

# UpdateAttributeValueBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The update operation applied to the attribute. |  |
|**attribute** | [**UpdateAttributeValueBlock1Attribute**](UpdateAttributeValueBlock1Attribute.md) |  |  |
|**value** | **Object** | The value of the attribute. Omitted when operator is set to &#x60;toggle&#x60;. |  [optional] |
|**target** | [**UpdateAttributeValueBlock1Target**](UpdateAttributeValueBlock1Target.md) |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| SET_TO | &quot;setTo&quot; |
| INCREASE_BY | &quot;increaseBy&quot; |
| DECREASE_BY | &quot;decreaseBy&quot; |
| MULTIPLY_BY | &quot;multiplyBy&quot; |
| DIVIDE_BY | &quot;divideBy&quot; |
| TOGGLE | &quot;toggle&quot; |
| LATER_BY | &quot;laterBy&quot; |
| EARLIER_BY | &quot;earlierBy&quot; |



