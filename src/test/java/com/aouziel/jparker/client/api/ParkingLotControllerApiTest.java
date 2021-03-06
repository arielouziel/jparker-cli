/*
 * JParker REST API
 * An Open API for parking lot management
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@arielouziel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aouziel.jparker.client.api;

import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.model.*;
import org.junit.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * API tests for ParkingLotControllerApi
 */
public class ParkingLotControllerApiTest {

    private static final ParkingLotControllerApi api = new ParkingLotControllerApi();
    private static ParkingLot testParkingLot;

    @Before
    public void setup() throws ApiException {
        testParkingLot = new ParkingLot().name("Parking Lot under test")
                .pricingPolicy(new HourRatePricingPolicy()
                        .hourPrice(100)
                        .currencyCode("EUR")
                        .pricingPolicyType("HOURRATEPRICINGPOLICY"));
        testParkingLot = api.createParkingLot(testParkingLot);
        assertThat(testParkingLot.getId()).isNotNull();

        for (int i = 0; i < 2; i++) { // create 10 slots
            ParkingSlot parkingSlot = new ParkingSlot()
                    .type(ParkingSlot.TypeEnum.SEDAN);
            ParkingSlot slot = api.createParkingSlot(testParkingLot.getId(), parkingSlot);
        }
    }


    /**
     * View a list of all parking lots
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllParkingLotsTest() throws ApiException {
        List<ParkingLot> response = api.getAllParkingLots();
        assertThat(response).isNotNull().isNotEmpty();
    }

    /**
     * Create a new parking lot
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createParkingLotTest() throws ApiException {
        ParkingLot parkingLot = new ParkingLot().name("Test Parking Lot")
                .pricingPolicy(new HourRatePricingPolicy()
                        .hourPrice(100)
                        .currencyCode("EUR")
                        .pricingPolicyType("HOURRATEPRICINGPOLICY"));
        ParkingLot response = api.createParkingLot(parkingLot);
        assertThat(response.getId()).isNotNull();
    }

    /**
     * Delete a parking
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParkingLotTest() throws ApiException {
        ParkingLot parkingLot = new ParkingLot().name("Test To Remove Parking Lot")
                .pricingPolicy(new HourRatePricingPolicy()
                        .hourPrice(100)
                        .currencyCode("EUR")
                        .pricingPolicyType("HOURRATEPRICINGPOLICY"));
        parkingLot = api.createParkingLot(parkingLot);
        assertThat(parkingLot.getId()).isNotNull();

        api.deleteParkingLot(parkingLot.getId());
    }

    /**
     * Create a new slot in a parking lot
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createParkingSlotTest() throws ApiException {
        ParkingSlot response = api.createParkingSlot(testParkingLot.getId(), new ParkingSlot().type(ParkingSlot.TypeEnum.SEDAN));
        assertThat(response.getId()).isNotNull();
    }

    /**
     * Remove a slot from a parking lot
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeParkingSlotTest() throws ApiException {
        ParkingSlot slot = api.createParkingSlot(testParkingLot.getId(), new ParkingSlot().type(ParkingSlot.TypeEnum.SEDAN));
        assertThat(slot.getId()).isNotNull();

        api.removeParkingSlot(testParkingLot.getId(), slot.getId());
    }

    /**
     * Get a parking lot by id
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParkingLotByIdTest() throws ApiException {
        api.getParkingLotById(testParkingLot.getId());
    }

    /**
     * Remove car from parking lot and bill the customer
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterAndleaveParkingLotTest() throws ApiException {
        ParkingTicket ticket = api.enterParkingLot(testParkingLot.getId(), ParkingTicket.CarPowerTypeEnum.SEDAN.toString());
        assertThat(ticket.getNumber()).isNotNull();

        ticket = api.leaveParkingLot(testParkingLot.getId(), ticket.getNumber());
        assertThat(ticket.getPrice()).isGreaterThan(0);
    }

    /**
     * Get a list of free slots in a parking lot
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParkingSlotsTest() throws ApiException {
        Long lotId = testParkingLot.getId();
        String parkingSlotStatus = "free";
        String parkingSlotType = "sedan";
        List<ParkingSlot> response = api.getParkingSlots(lotId, parkingSlotStatus, parkingSlotType);
        assertThat(response).isNotEmpty().isNotNull();
    }

    @After
    public void tearDown() throws ApiException, InterruptedException {
        api.deleteParkingLot(testParkingLot.getId());
    }
}
