/*
 * JParker REST API
 * An Open API for parking lot management
 *
 * OpenAPI spec version: 1.0.0
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void createParkingLotUsingPOSTTest() throws ApiException {
        ParkingLot parkingLot = null;
        ParkingLot response = api.createParkingLotUsingPOST(parkingLot);

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
    public void createParkingSlotUsingPOSTTest() throws ApiException {
        Long lotId = null;
        ParkingSlot parkingSlot = null;
        ParkingSlot response = api.createParkingSlotUsingPOST(lotId, parkingSlot);

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
    public void enterParkingLotUsingPOSTTest() throws ApiException {
        Long lotId = null;
        String body = null;
        ParkingTicket response = api.enterParkingLotUsingPOST(lotId, body);

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
    public void getAllParkingLotsUsingGETTest() throws ApiException {
        List<ParkingLot> response = api.getAllParkingLotsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Get a parking lot by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParkingLotByIdUsingGETTest() throws ApiException {
        Long lotId = null;
        ParkingLot response = api.getParkingLotByIdUsingGET(lotId);

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
    public void leaveParkingLotUsingPUTTest() throws ApiException {
        Long lotId = null;
        String ticketNumber = null;
        ParkingTicket response = api.leaveParkingLotUsingPUT(lotId, ticketNumber);

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
    public void listFreeParkingSlotsUsingGETTest() throws ApiException {
        Long lotId = null;
        String parkingSlotStatus = null;
        String parkingSlotType = null;
        List<ParkingSlot> response = api.listFreeParkingSlotsUsingGET(lotId, parkingSlotStatus, parkingSlotType);

        // TODO: test validations
    }
    
}
