# ParkingLotControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterParkingLotUsingPOST**](ParkingLotControllerApi.md#enterParkingLotUsingPOST) | **POST** /api/v1/parking-lots/{lotId}/slot-uses | Put a car in a any free parking slot
[**getAllParkingLotsUsingGET**](ParkingLotControllerApi.md#getAllParkingLotsUsingGET) | **GET** /api/v1/parking-lots | View a list of all parking lots
[**getParkingLotByIdUsingGET**](ParkingLotControllerApi.md#getParkingLotByIdUsingGET) | **GET** /api/v1/parking-lots/{lotId} | Get a parking lot by Id
[**leaveParkingLotUsingPUT**](ParkingLotControllerApi.md#leaveParkingLotUsingPUT) | **PUT** /api/v1/parking-lots/{lotId}/slot-uses/{useId}/leave | Remove car from parking lot and bill the customer
[**listFreeParkingSlotsUsingGET**](ParkingLotControllerApi.md#listFreeParkingSlotsUsingGET) | **GET** /api/v1/parking-lots/{lotId}/free-slots | Get a list of free slots in a parking lot


<a name="enterParkingLotUsingPOST"></a>
# **enterParkingLotUsingPOST**
> ParkingSlotUse enterParkingLotUsingPOST(lotId, body)

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
    ParkingSlotUse result = apiInstance.enterParkingLotUsingPOST(lotId, body);
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

[**ParkingSlotUse**](ParkingSlotUse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllParkingLotsUsingGET"></a>
# **getAllParkingLotsUsingGET**
> List&lt;Object&gt; getAllParkingLotsUsingGET()

View a list of all parking lots

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
try {
    List<Object> result = apiInstance.getAllParkingLotsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingLotControllerApi#getAllParkingLotsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

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
> ParkingSlotUse leaveParkingLotUsingPUT(lotId, useId)

Remove car from parking lot and bill the customer

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking slot will be retrieved
Long useId = 56L; // Long | Occupation id provided when entered the parking lot
try {
    ParkingSlotUse result = apiInstance.leaveParkingLotUsingPUT(lotId, useId);
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
 **useId** | **Long**| Occupation id provided when entered the parking lot |

### Return type

[**ParkingSlotUse**](ParkingSlotUse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listFreeParkingSlotsUsingGET"></a>
# **listFreeParkingSlotsUsingGET**
> List&lt;ParkingSlot&gt; listFreeParkingSlotsUsingGET(lotId, parkingSlotType)

Get a list of free slots in a parking lot

### Example
```java
// Import classes:
//import com.aouziel.jparker.client.invoker.ApiException;
//import com.aouziel.jparker.client.api.ParkingLotControllerApi;


ParkingLotControllerApi apiInstance = new ParkingLotControllerApi();
Long lotId = 56L; // Long | ParkingLot id from which parking slots will be retrieved
String parkingSlotType = "parkingSlotType_example"; // String | Specify parking slot type to be used (twentyKw, fiftyKw or sedan)
try {
    List<ParkingSlot> result = apiInstance.listFreeParkingSlotsUsingGET(lotId, parkingSlotType);
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
 **parkingSlotType** | **String**| Specify parking slot type to be used (twentyKw, fiftyKw or sedan) | [optional]

### Return type

[**List&lt;ParkingSlot&gt;**](ParkingSlot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

