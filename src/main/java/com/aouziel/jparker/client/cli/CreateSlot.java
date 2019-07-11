package com.aouziel.jparker.client.cli;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.ParkingSlot;
import picocli.CommandLine;

@CommandLine.Command(description = "Create a new parking slot",
        name = "slot", mixinStandardHelpOptions = true)
public class CreateSlot implements Runnable {
    @CommandLine.ParentCommand
    private JParker parent;

    @CommandLine.Option(names = {"-n", "--number"}, description = "Number of slot to create", defaultValue = "1")
    private int nb;

    @CommandLine.Option(names = {"-cp", "--car-power"}, description = "Power type for slot", defaultValue = "SEDAN")
    private ParkingSlot.TypeEnum carPowerType;

    @CommandLine.Option(names = {"-l", "--lot-id"}, description = "Parking lot ID", required = true)
    private Long lotId;

    @Override
    public void run() {
        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
        apiInstance.getApiClient().setBasePath(parent.getPath());

        try {
            for (int i = 0; i < nb; i++) {
                ParkingSlot parkingSlot = new ParkingSlot()
                        .type(carPowerType);
                ParkingSlot response = apiInstance.createParkingSlot(lotId, parkingSlot);
                System.out.println("Slot created: " + response);
            }
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }
}
