# ParkingLotControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createParkingLot**](ParkingLotControllerApi.md#createParkingLot) | **POST** /api/v1/parking-lots | Create a new parking lot
[**createParkingSlot**](ParkingLotControllerApi.md#createParkingSlot) | **POST** /api/v1/parking-lots/{lotId}/slots | Create a new slot in a parking lot
[**deleteParkingLot**](ParkingLotControllerApi.md#deleteParkingLot) | **DELETE** /api/v1/parking-lots/{lotId} | Delete a parking
[**enterParkingLot**](ParkingLotControllerApi.md#enterParkingLot) | **POST** /api/v1/parking-lots/{lotId}/tickets | Put a car in a any free parking slot
[**getAllParkingLots**](ParkingLotControllerApi.md#getAllParkingLots) | **GET** /api/v1/parking-lots | View a list of all parking lots
[**getParkingLotById**](ParkingLotControllerApi.md#getParkingLotById) | **GET** /api/v1/parking-lots/{lotId} | Get a parking lot by id
[**leaveParkingLot**](ParkingLotControllerApi.md#leaveParkingLot) | **PUT** /api/v1/parking-lots/{lotId}/tickets/{ticketNumber}/leave | Remove car from parking lot and bill the customer
[**listFreeParkingSlots**](ParkingLotControllerApi.md#listFreeParkingSlots) | **GET** /api/v1/parking-lots/{lotId}/slots | Get a list of free slots in a parking lot
[**removeParkingSlot**](ParkingLotControllerApi.md#removeParkingSlot) | **DELETE** /api/v1/parking-lots/{lotId}/slots/{slotId} | Remove a slot from a parking lot


<a name="createParkingLot"></a>
# **createParkingLot**
> ParkingLot createParkingLot(parkingLot)

Create a new parking lot

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    ParkingLot parkingLot = new ParkingLot(); // ParkingLot | parkingLot
    try {
      ParkingLot result = apiInstance.createParkingLot(parkingLot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#createParkingLot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="createParkingSlot"></a>
# **createParkingSlot**
> ParkingSlot createParkingSlot(lotId, slot)

Create a new slot in a parking lot

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id where to add the slot
    ParkingSlot slot = new ParkingSlot(); // ParkingSlot | slot
    try {
      ParkingSlot result = apiInstance.createParkingSlot(lotId, slot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#createParkingSlot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id where to add the slot |
 **slot** | [**ParkingSlot**](ParkingSlot.md)| slot |

### Return type

[**ParkingSlot**](ParkingSlot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully added slot |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

<a name="deleteParkingLot"></a>
# **deleteParkingLot**
> deleteParkingLot(lotId)

Delete a parking

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | Parking lot id to delete
    try {
      apiInstance.deleteParkingLot(lotId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#deleteParkingLot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| Parking lot id to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted parking lot |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

<a name="enterParkingLot"></a>
# **enterParkingLot**
> ParkingTicket enterParkingLot(lotId, carPowerType)

Put a car in a any free parking slot

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id from which parking slot will be retrieved
    String carPowerType = "carPowerType_example"; // String | carPowerType
    try {
      ParkingTicket result = apiInstance.enterParkingLot(lotId, carPowerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#enterParkingLot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id from which parking slot will be retrieved |
 **carPowerType** | **String**| carPowerType |

### Return type

[**ParkingTicket**](ParkingTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully picked the slot |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Somebody took the slot before you |  -  |
**412** | Preconditions failed |  -  |

<a name="getAllParkingLots"></a>
# **getAllParkingLots**
> List&lt;ParkingLot&gt; getAllParkingLots()

View a list of all parking lots

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    try {
      List<ParkingLot> result = apiInstance.getAllParkingLots();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#getAllParkingLots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved list |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

<a name="getParkingLotById"></a>
# **getParkingLotById**
> ParkingLot getParkingLotById(lotId)

Get a parking lot by id

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id from which parking object will retrieve
    try {
      ParkingLot result = apiInstance.getParkingLotById(lotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#getParkingLotById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved parking lot |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

<a name="leaveParkingLot"></a>
# **leaveParkingLot**
> ParkingTicket leaveParkingLot(lotId, ticketNumber)

Remove car from parking lot and bill the customer

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id from which parking slot will be retrieved
    String ticketNumber = "ticketNumber_example"; // String | Ticket number provided when entered the parking lot
    try {
      ParkingTicket result = apiInstance.leaveParkingLot(lotId, ticketNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#leaveParkingLot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully leaved the parking lot |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Somebody took the slot before you |  -  |
**412** | Preconditions failed |  -  |

<a name="listFreeParkingSlots"></a>
# **listFreeParkingSlots**
> List&lt;ParkingSlot&gt; listFreeParkingSlots(lotId, parkingSlotStatus, parkingSlotType)

Get a list of free slots in a parking lot

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id from which parking slots will be retrieved
    String parkingSlotStatus = "parkingSlotStatus_example"; // String | Specify parking slot status to be used (free, occupied)
    String parkingSlotType = "parkingSlotType_example"; // String | Specify parking slot type to be used (twentyKw, fiftyKw or sedan)
    try {
      List<ParkingSlot> result = apiInstance.listFreeParkingSlots(lotId, parkingSlotStatus, parkingSlotType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#listFreeParkingSlots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved list |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

<a name="removeParkingSlot"></a>
# **removeParkingSlot**
> removeParkingSlot(lotId, slotId)

Remove a slot from a parking lot

### Example
```java
// Import classes:
import com.aouziel.jparker.client.invoker.ApiClient;
import com.aouziel.jparker.client.invoker.ApiException;
import com.aouziel.jparker.client.invoker.Configuration;
import com.aouziel.jparker.client.invoker.models.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ParkingLotControllerApi apiInstance = new ParkingLotControllerApi(defaultClient);
    Long lotId = 56L; // Long | ParkingLot id where to add the slot
    Long slotId = 56L; // Long | Slot id to remove
    try {
      apiInstance.removeParkingSlot(lotId, slotId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParkingLotControllerApi#removeParkingSlot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lotId** | **Long**| ParkingLot id where to add the slot |
 **slotId** | **Long**| Slot id to remove |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully removed slot |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | The resource you were trying to reach is not found |  -  |

