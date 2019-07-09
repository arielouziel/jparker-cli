package com.aouziel.jparker.client;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.*;
import org.apache.commons.cli.*;

public class JParkerCli {
    private static ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();

    private static Options commonOptions() {
        final Options options = new Options();

        options.addOption("h", "help", false, "Display help on command");
        options.addOption("c", "create", false, "Create parking lot");
        options.addOption("p","path", true, "JParker API Base Path (default: http://localhost:8080)");

        return options;
    }

    private static Options createOptions(Options commonOptions) {
        final Options options = new Options();

        // First Options
        for (final Option fo : commonOptions.getOptions()) {
            options.addOption(fo);
        }

        options.addRequiredOption("c", "create", false, "Create a new parking lot");
        options.addRequiredOption("n", "name", true, "Name of parking lot");
        options.addRequiredOption("pp", "pricing-policy", true, "Pricing policy (hourRate, hourRatePlusFixed)");
        options.addRequiredOption("hr", "hour-rate", true, "Hour rate in smallest currency unit");
        options.addRequiredOption("cc", "currency-code", true, "Currency code (EUR, USD, ...)");
        options.addOption("a", "fixed-amount", true, "Fixed amount in smallest currency unit");

        return options;
    }

    private static Options configParameters(Options firstOptions) {
        final Options options = new Options();

        // First Options
        for (final Option fo : firstOptions.getOptions()) {
            options.addOption(fo);
        }

        options.addOption("p", "parking-lot", true, "Parking lot ID");
        options.addOption("c", "create", true, "Create a new parking lot");
        options.addOption("a", "add-slot", true, "Add slot in parking lot");
        options.addOption("e", "enter", false, "Enter parking lot");
        options.addOption("pt", "power-type", true, "Car power type");
        options.addOption("l", "leave", false, "Leave parking lot");
        options.addOption("u", "use-id", true, "Slot use id");
        options.addOption("h","host", true, "JParker API Base URL (default: http://localhost:8080)");

        return options;
    }

    public static void main(final String[] args) throws ParseException, ApiException {
        final Options commonOptions = commonOptions();
        final Options createOptions = createOptions(commonOptions);

        // On parse l'aide
        final CommandLineParser parser = new DefaultParser();
        final CommandLine firstLine = parser.parse(commonOptions(), args, true);

        // Si mode aide
        boolean helpMode = firstLine.hasOption("help");
        if (helpMode) {
            final HelpFormatter formatter = new HelpFormatter();
            if (firstLine.hasOption("create")) {
                formatter.printHelp("jparker", createOptions, true);
            } else {
                formatter.printHelp("jparker", commonOptions, true);
            }

            System.exit(0);
        }

        apiInstance.getApiClient().setBasePath(firstLine.getOptionValue("p", "http://localhost:8080"));

        if (firstLine.hasOption("create")) {
            final CommandLine line = parser.parse(createOptions, args);
            createParkingLot(
                    line.getOptionValue("name"),
                    line.getOptionValue("pricing-policy"),
                    line.getOptionValue("hour-rate"),
                    line.getOptionValue("currency-code"),
                    line.getOptionValue("fixed-amount")
            );
        }

//        // On parse la suite
//
//
//        if (line.hasOption("create")) {
//
//        } else if (line.hasOption("enter")) {
//            enterParkingLot(
//                    line.getOptionValue('p'),
//                    line.getOptionValue("pt")
//            );
//        }
    }

    private static void enterParkingLot(String lotId, String powerType) {
        try {
            ParkingSlotUse response = apiInstance.enterParkingLotUsingPOST(Long.valueOf(lotId), powerType);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }

    private static void createParkingLot(String name, String pricingPolicyType, String hourPrice, String currencyCode, String fixedPrice) {
        try {
            PricingPolicy pricingPolicy = pricingPolicyType.equals("HOURRATEPRICINGPOLICY") ?
                    new HourRatePricingPolicy()
                            .hourPrice(Integer.valueOf(hourPrice))
                            .currencyCode(currencyCode)
                            .pricingPolicyType(pricingPolicyType):
                    new HourRatePlusFixedPricingPolicy()
                            .hourPrice(Integer.valueOf(hourPrice))
                            .currencyCode(currencyCode)
                            .fixedPrice(Integer.valueOf(fixedPrice))
                            .pricingPolicyType(pricingPolicyType);

            ParkingLot parkingLot = new ParkingLot().name(name)
                    .pricingPolicy(pricingPolicy);

            ParkingLot response = apiInstance.createParkingLotUsingPOST(parkingLot);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }
}