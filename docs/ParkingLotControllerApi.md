# ParkingLotControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createParkingLotUsingPOST**](ParkingLotControllerApi.md#createParkingLotUsingPOST) | **POST** /api/v1/parking-lots | Create a new parking lot
[**createParkingSlotUsingPOST**](ParkingLotControllerApi.md#createParkingSlotUsingPOST) | **POST** /api/v1/parking-lots/{lotId}/slots | Create a new slot in a parking lot
[**enterParkingLotUsingPOST**](ParkingLotControllerApi.md#enterParkingLotUsingPOST) | **POST** /api/v1/parking-lots/{lotId}/slot-uses | Put a car in a any free parking slot
[**getAllParkingLotsUsingGET**](ParkingLotControllerApi.md#getAllParkingLotsUsingGET) | **GET** /api/v1/parking-lots | View a list of all parking lots
[**getParkingLotByIdUsingGET**](ParkingLotControllerApi.md#getParkingLotByIdUsingGET) | **GET** /api/v1/parking-lots/{lotId} | Get a parking lot by Id
[**leaveParkingLotUsingPUT**](ParkingLotControllerApi.md#leaveParkingLotUsingPUT) | **PUT** /api/v1/parking-lots/{lotId}/tickets/{ticketNumber}/leave | Remove car from parking lot and bill the customer
[**listFreeParkingSlotsUsingGET**](ParkingLotControllerApi.md#listFreeParkingSlotsUsingGET) | **GET** /api/v1/parking-lots/{lotId}/slots | Get a list of free slots in a parking lot


<a name="createParkingLotUsingPOST"></a>
# **createParkingLotUsingPOST**
> ParkingLot createParkingLotUsingPOST(parkingLot)

Create a new parking lot

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
ParkingLot parkingLot = new ParkingLot(); // ParkingLot | parkingLot
try {
    ParkingLot result = apiInstance.createParkingLotUsingPOST(parkingLot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#createParkingLotUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parkingLot** | [**ParkingLot**](ParkingLot.md)| parkingLot |

### Return type

[**ParkingLot**](ParkingLot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createParkingSlotUsingPOST"></a>
# **createParkingSlotUsingPOST**
> ParkingSlot createParkingSlotUsingPOST(lotId, parkingSlot)

Create a new slot in a parking lot

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id where to add the slot
ParkingSlot parkingSlot = new ParkingSlot(); // ParkingSlot | slot
try {
    ParkingSlot result = apiInstance.createParkingSlotUsingPOST(lotId, parkingSlot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#createParkingSlotUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id where to add the slot |
 **parkingSlot** | [**ParkingSlot**](ParkingSlot.md)| slot |

### Return type

[**ParkingSlot**](ParkingSlot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="enterParkingLotUsingPOST"></a>
# **enterParkingLotUsingPOST**
> ParkingTicket enterParkingLotUsingPOST(lotId, body)

Put a car in a any free parking slot

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking slot will be retrieved
String body = "body_example"; // String | carPowerType
try {
    ParkingTicket result = apiInstance.enterParkingLotUsingPOST(lotId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#enterParkingLotUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id from which parking slot will be retrieved |
 **body** | **String**| carPowerType |

### Return type

[**ParkingTicket**](ParkingTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllParkingLotsUsingGET"></a>
# **getAllParkingLotsUsingGET**
> List&lt;ParkingLot&gt; getAllParkingLotsUsingGET()

View a list of all parking lots

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
try {
    List<ParkingLot> result = apiInstance.getAllParkingLotsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#getAllParkingLotsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ParkingLot&gt;**](ParkingLot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getParkingLotByIdUsingGET"></a>
# **getParkingLotByIdUsingGET**
> ParkingLot getParkingLotByIdUsingGET(lotId)

Get a parking lot by Id

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking object will retrieve
try {
    ParkingLot result = apiInstance.getParkingLotByIdUsingGET(lotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#getParkingLotByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id from which parking object will retrieve |

### Return type

[**ParkingLot**](ParkingLot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="leaveParkingLotUsingPUT"></a>
# **leaveParkingLotUsingPUT**
> ParkingTicket leaveParkingLotUsingPUT(lotId, ticketNumber)

Remove car from parking lot and bill the customer

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking slot will be retrieved
String ticketNumber = "ticketNumber_example"; // String | Ticket number provided when entered the parking lot
try {
    ParkingTicket result = apiInstance.leaveParkingLotUsingPUT(lotId, ticketNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#leaveParkingLotUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id from which parking slot will be retrieved |
 **ticketNumber** | **String**| Ticket number provided when entered the parking lot |

### Return type

[**ParkingTicket**](ParkingTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listFreeParkingSlotsUsingGET"></a>
# **listFreeParkingSlotsUsingGET**
> List&lt;ParkingSlot&gt; listFreeParkingSlotsUsingGET(lotId, parkingSlotStatus, parkingSlotType)

Get a list of free slots in a parking lot

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking slots will be retrieved
String parkingSlotStatus = "parkingSlotStatus_example"; // String | Specify parking slot status to be used (free, occupied)
String parkingSlotType = "parkingSlotType_example"; // String | Specify parking slot type to be used (twentyKw, fiftyKw or sedan)
try {
    List<ParkingSlot> result = apiInstance.listFreeParkingSlotsUsingGET(lotId, parkingSlotStatus, parkingSlotType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#listFreeParkingSlotsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id from which parking slots will be retrieved |
 **parkingSlotStatus** | **String**| Specify parking slot status to be used (free, occupied) | [optional] [enum: free, occupied]
 **parkingSlotType** | **String**| Specify parking slot type to be used (twentyKw, fiftyKw or sedan) | [optional] [enum: twentyKw, fiftyKw, sedan]

### Return type

[**List&lt;ParkingSlot&gt;**](ParkingSlot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

