# jparker-cli

JParker REST API
- API version: 1.0.0
  - Build date: 2019-07-09T01:28:10.848+02:00[Europe/Paris]

An Open API for parking lot management

  For more information, please visit [www.arielouziel.com](www.arielouziel.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.aouziel</groupId>
  <artifactId>jparker-cli</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aouziel:jparker-cli:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/jparker-cli-0.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aouziel.jparker.client.invoker.*;
import com.aouziel.jparker.client.invoker.auth.*;
import com.aouziel.jparker.client.model.*;
import com.aouziel.jparker.client.api.ParkingLotControllerApi;

import java.io.File;
import java.util.*;

public class ParkingLotControllerApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ParkingLotControllerApi* | [**enterParkingLotUsingPOST**](docs/ParkingLotControllerApi.md#enterParkingLotUsingPOST) | **POST** /api/v1/parking-lots/{lotId}/slot-uses | Put a car in a any free parking slot
*ParkingLotControllerApi* | [**getAllParkingLotsUsingGET**](docs/ParkingLotControllerApi.md#getAllParkingLotsUsingGET) | **GET** /api/v1/parking-lots | View a list of all parking lots
*ParkingLotControllerApi* | [**getParkingLotByIdUsingGET**](docs/ParkingLotControllerApi.md#getParkingLotByIdUsingGET) | **GET** /api/v1/parking-lots/{lotId} | Get a parking lot by Id
*ParkingLotControllerApi* | [**leaveParkingLotUsingPUT**](docs/ParkingLotControllerApi.md#leaveParkingLotUsingPUT) | **PUT** /api/v1/parking-lots/{lotId}/slot-uses/{useId}/leave | Remove car from parking lot and bill the customer
*ParkingLotControllerApi* | [**listFreeParkingSlotsUsingGET**](docs/ParkingLotControllerApi.md#listFreeParkingSlotsUsingGET) | **GET** /api/v1/parking-lots/{lotId}/free-slots | Get a list of free slots in a parking lot


## Documentation for Models

 - [ParkingLot](docs/ParkingLot.md)
 - [ParkingSlot](docs/ParkingSlot.md)
 - [ParkingSlotUse](docs/ParkingSlotUse.md)
 - [PricingPolicy](docs/PricingPolicy.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@arielouziel.com

