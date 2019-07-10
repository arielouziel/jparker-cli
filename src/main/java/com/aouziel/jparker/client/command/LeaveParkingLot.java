package com.aouziel.jparker.client.command;

import com.aouziel.jparker.client.api.ParkingLotControllerApi;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.ParkingSlot;
import com.aouziel.jparker.client.model.ParkingTicket;
import picocli.CommandLine;

@CommandLine.Command(description = "Leave parking lot",
        name = "leave", mixinStandardHelpOptions = true)
public class LeaveParkingLot implements Runnable {
    @CommandLine.ParentCommand
    private JParker parent;

    @CommandLine.Option(names = {"-l", "--lot-id"}, description = "Parking lot ID", required = true)
    private Long lotId;

    @CommandLine.Option(names = {"-n", "--number"}, description = "Ticket number", required = true)
    private String number;

    @Override
    public void run() {
        ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
        apiInstance.getApiClient().setBasePath(parent.getPath());

        try {
            ParkingTicket response = apiInstance.leaveParkingLotUsingPUT(lotId, number);
            System.out.println("Ticket received: " + response);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }
    }
}
