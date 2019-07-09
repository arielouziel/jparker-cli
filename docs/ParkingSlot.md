
# ParkingSlot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The database generated slot ID |  [optional]
**location** | **String** | The slot location in the parking lot |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the parking slot |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the parking slot |  [optional]
**version** | **Integer** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FREE | &quot;free&quot;
OCCUPIED | &quot;occupied&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TWENTYKW | &quot;twentyKw&quot;
FIFTYKW | &quot;fiftyKw&quot;
SEDAN | &quot;sedan&quot;



