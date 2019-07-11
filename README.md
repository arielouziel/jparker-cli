# jparker-cli

JParker REST API
- API version: 1.0.0
  - Build date: 2019-07-11T13:46:25.422+02:00[Europe/Brussels]

An Open API for parking lot management

  For more information, please visit [http://www.arielouziel.com](http://www.arielouziel.com)

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
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aouziel:jparker-cli:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/jparker-cli-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ParkingLotControllerApi* | [**createParkingLot**](docs/ParkingLotControllerApi.md#createParkingLot) | **POST** /api/v1/parking-lots | Create a new parking lot
*ParkingLotControllerApi* | [**createParkingSlot**](docs/ParkingLotControllerApi.md#createParkingSlot) | **POST** /api/v1/parking-lots/{lotId}/slots | Create a new slot in a parking lot
*ParkingLotControllerApi* | [**deleteParkingLot**](docs/ParkingLotControllerApi.md#deleteParkingLot) | **DELETE** /api/v1/parking-lots/{lotId} | Delete a parking
*ParkingLotControllerApi* | [**enterParkingLot**](docs/ParkingLotControllerApi.md#enterParkingLot) | **POST** /api/v1/parking-lots/{lotId}/slot-uses | Put a car in a any free parking slot
*ParkingLotControllerApi* | [**getAllParkingLots**](docs/ParkingLotControllerApi.md#getAllParkingLots) | **GET** /api/v1/parking-lots | View a list of all parking lots
*ParkingLotControllerApi* | [**getParkingLotById**](docs/ParkingLotControllerApi.md#getParkingLotById) | **GET** /api/v1/parking-lots/{lotId} | Get a parking lot by id
*ParkingLotControllerApi* | [**leaveParkingLot**](docs/ParkingLotControllerApi.md#leaveParkingLot) | **PUT** /api/v1/parking-lots/{lotId}/tickets/{ticketNumber}/leave | Remove car from parking lot and bill the customer
*ParkingLotControllerApi* | [**listFreeParkingSlots**](docs/ParkingLotControllerApi.md#listFreeParkingSlots) | **GET** /api/v1/parking-lots/{lotId}/slots | Get a list of free slots in a parking lot
*ParkingLotControllerApi* | [**removeParkingSlot**](docs/ParkingLotControllerApi.md#removeParkingSlot) | **DELETE** /api/v1/parking-lots/{lotId}/slots/{slotId} | Remove a slot from a parking lot


## Documentation for Models

 - [HourRatePlusFixedPricingPolicy](docs/HourRatePlusFixedPricingPolicy.md)
 - [HourRatePricingPolicy](docs/HourRatePricingPolicy.md)
 - [ParkingLot](docs/ParkingLot.md)
 - [ParkingSlot](docs/ParkingSlot.md)
 - [ParkingTicket](docs/ParkingTicket.md)
 - [PricingPolicy](docs/PricingPolicy.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Build and Run the CLI

Build an executable jar with all dependencies

```shell
mvn clean compile assembly:single
```

Move and rename jar to current dir

```shell
mv target/jparker-cli-1.0.0-jar-with-dependencies.jar jparker-cli.jar
```

Show usage

```shell
java -jar jparker-cli.jar -h
java -jar jparker-cli.jar create -h
java -jar jparker-cli.jar slot -h
java -jar jparker-cli.jar enter -h
java -jar jparker-cli.jar leave -h
``` 

Examples

```shell
java -jar jparker-cli.jar create "My New Parking Lot"
java -jar jparker-cli.jar slot -l 1 -n 10 -cp "SEDAN"
java -jar jparker-cli.jar enter -l 1 -cp "TWENTYKW"
java -jar jparker-cli.jar leave -l 1 -n "XXXXXX"  # XXXXXX = whatever ticket number you received when entered
``` 

## Author

contact@arielouziel.com

