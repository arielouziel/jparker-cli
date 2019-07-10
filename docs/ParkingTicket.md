
# ParkingTicket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carPowerType** | [**CarPowerTypeEnum**](#CarPowerTypeEnum) | The power type of the car using the slot |  [optional]
**currencyCode** | **String** | The currency code for billed price |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time when occupation has ended |  [optional]
**formattedPrice** | **String** | The billed price in human readable format |  [optional]
**id** | **Long** | The database generated slot occupation item ID |  [optional]
**number** | **String** | The ticket number |  [optional]
**price** | **Integer** | The billed price for this ticket |  [optional]
**slot** | [**ParkingSlot**](ParkingSlot.md) |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time when occupation has started |  [optional]


<a name="CarPowerTypeEnum"></a>
## Enum: CarPowerTypeEnum
Name | Value
---- | -----
TWENTYKW | &quot;twentyKw&quot;
FIFTYKW | &quot;fiftyKw&quot;
SEDAN | &quot;sedan&quot;



