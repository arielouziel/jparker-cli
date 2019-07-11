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
import com.aouziel.jparker.client.model.ParkingLot;
import com.aouziel.jparker.client.model.ParkingSlot;
import com.aouziel.jparker.client.model.ParkingTicket;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ParkingLotControllerApi
 */
@Ignore
public class ParkingLotControllerApiTest {

    private final ParkingLotControllerApi api = new ParkingLotControllerApi();

    
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
        ParkingLot parkingLot = null;
        ParkingLot response = api.createParkingLot(parkingLot);

        // TODO: test validations
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
        Long lotId = null;
        ParkingSlot slot = null;
        ParkingSlot response = api.createParkingSlot(lotId, slot);

        // TODO: test validations
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
        Long lotId = null;
        api.deleteParkingLot(lotId);

        // TODO: test validations
    }
    
    /**
     * Put a car in a any free parking slot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterParkingLotTest() throws ApiException {
        Long lotId = null;
        String carPowerType = null;
        ParkingTicket response = api.enterParkingLot(lotId, carPowerType);

        // TODO: test validations
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

        // TODO: test validations
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
        Long lotId = null;
        ParkingLot response = api.getParkingLotById(lotId);

        // TODO: test validations
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
    public void leaveParkingLotTest() throws ApiException {
        Long lotId = null;
        String ticketNumber = null;
        ParkingTicket response = api.leaveParkingLot(lotId, ticketNumber);

        // TODO: test validations
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
        Long lotId = null;
        String parkingSlotStatus = null;
        String parkingSlotType = null;
        List<ParkingSlot> response = api.getParkingSlots(lotId, parkingSlotStatus, parkingSlotType);

        // TODO: test validations
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
        Long lotId = null;
        Long slotId = null;
        api.removeParkingSlot(lotId, slotId);

        // TODO: test validations
    }
    
}
