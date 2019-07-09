package com.aouziel.jparker.client;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.ParkingSlotUse;
import org.apache.commons.cli.*;

public class JParkerCli {
    private static Options configFirstParameters() {
        final Option helpFileOption = Option.builder("h")
                .longOpt("help")
                .desc("Affiche le message d'aide")
                .build();

        final Options firstOptions = new Options();

        firstOptions.addOption(helpFileOption);

        return firstOptions;

    }

    private static Options configParameters(Options firstOptions) {
        final Options options = new Options();

        // First Options
        for (final Option fo : firstOptions.getOptions()) {
            options.addOption(fo);
        }

        options.addOption("p", "parking-lot", true, "Parking lot ID");
        options.addOption("c", "create", false, "Create a new parking lot");
        options.addOption("a", "add-slot", true, "Add slot in parking lot");
        options.addOption("e", "enter", false, "Enter parking lot");
        options.addOption("pt", "power-type", true, "Car power type");
        options.addOption("l", "leave", false, "Leave parking lot");
        options.addOption("u", "use-id", true, "Slot use id");

        return options;
    }

    public static void main(final String[] args) throws ParseException, ApiException {
        final Options firstOptions = configFirstParameters();
        final Options options = configParameters(firstOptions);

        // On parse l'aide
        final CommandLineParser parser = new DefaultParser();
        final CommandLine firstLine = parser.parse(configFirstParameters(), args, true);

        // Si mode aide
        boolean helpMode = firstLine.hasOption("help");
        if (helpMode) {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("jparker", options, true);
            System.exit(0);
        }

        // On parse la suite
        final CommandLine line = parser.parse(options, args);
        if (line.hasOption("enter")) {
            enterParkingLot(
                    line.getOptionValue('p'),
                    line.getOptionValue("pt")
            );
        }
    }

    private static void enterParkingLot(String lotId, String powerType) {
        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
        try {
            ParkingSlotUse response = apiInstance.enterParkingLotUsingPOST(Long.valueOf(lotId), powerType);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }

    private static void createParkingLot(String name) {
//        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
//        apiInstance.
    }
}