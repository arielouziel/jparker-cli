package com.aouziel.jparker.client.cli;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.HourRatePlusFixedPricingPolicy;
import com.aouziel.jparker.client.model.HourRatePricingPolicy;
import com.aouziel.jparker.client.model.ParkingLot;
import com.aouziel.jparker.client.model.PricingPolicy;
import picocli.CommandLine;

@CommandLine.Command(description = "Create a new parking lot",
        name = "create", mixinStandardHelpOptions = true)
public class CreateParkingLot implements Runnable {
    @CommandLine.ParentCommand
    private JParker parent;

    @CommandLine.Option(names = {"-n", "--name"}, description = "Name of the parking lot")
    private String name = "My Parking Lot";

    @CommandLine.Option(
            names = {"-t", "--pricing-policy"},
            description = "Pricing policy (HOURRATEPRICINGPOLICY, HOURRATEPLUSFIXEDPRICINGPOLICY)",
            required = true
    )
    private String pricingPolicyType;

    @CommandLine.Option(names = {"-r", "--hour-price"}, description = "Hour price", required = true)
    private Integer hourPrice;

    @CommandLine.Option(names = {"-c", "--currency-code"}, description = "Currency code")
    private String currencyCode = "EUR";

    @CommandLine.Option(names = {"-f", "--fixed-price"}, description = "Fixed price")
    private Integer fixedPrice;

    @Override
    public void run() {
        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
        apiInstance.getApiClient().setBasePath(parent.getPath());

        try {
            PricingPolicy pricingPolicy = pricingPolicyType.equals("HOURRATEPRICINGPOLICY") ?
                    new HourRatePricingPolicy()
                            .hourPrice(hourPrice)
                            .currencyCode(currencyCode)
                            .pricingPolicyType(pricingPolicyType):
                    new HourRatePlusFixedPricingPolicy()
                            .hourPrice(hourPrice)
                            .currencyCode(currencyCode)
                            .fixedPrice(fixedPrice)
                            .pricingPolicyType(pricingPolicyType);

            ParkingLot parkingLot = new ParkingLot().name(name)
                    .pricingPolicy(pricingPolicy);

            ParkingLot response = apiInstance.createParkingLot(parkingLot);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }
}
