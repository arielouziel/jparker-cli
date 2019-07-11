package com.aouziel.jparker.client.cli;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.ParkingSlot;
import com.aouziel.jparker.client.model.ParkingTicket;
import picocli.CommandLine;

@CommandLine.Command(description = "Enter parking lot",
        name = "enter", mixinStandardHelpOptions = true)
public class EnterParkingLot implements Runnable {
    @CommandLine.ParentCommand
    private JParker parent;

    @CommandLine.Option(names = {"-cp", "--car-power"}, description = "Power type for slot", defaultValue = "SEDAN")
    private ParkingSlot.TypeEnum carPowerType;

    @CommandLine.Option(names = {"-l", "--lot-id"}, description = "Parking lot ID", required = true)
    private Long lotId;

    @Override
    public void run() {
        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
        apiInstance.getApiClient().setBasePath(parent.getPath());

        try {
            ParkingTicket response = apiInstance.enterParkingLot(lotId, carPowerType.toString());
            System.out.println("Ticket received: " + response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }
}
