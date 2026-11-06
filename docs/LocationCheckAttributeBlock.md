

# LocationCheckAttributeBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | A block discriminator of type &#x60;checkAttribute&#x60;. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The location membership operator applied to the attribute. |  |
|**attribute** | **Object** | The attribute path identifier (e.g. \&quot;$Session.Total\&quot;). |  |
|**value** | **Object** | The comparison value for scalar operators. |  [optional] |
|**min** | **Object** | The minimum value allowed for the &#x60;between&#x60; operator. |  [optional] |
|**max** | **Object** | The maximum value allowed for the &#x60;between&#x60; operator. |  [optional] |
|**start** | **Object** | The start value for the &#x60;within&#x60; operator. |  [optional] |
|**end** | **Object** | The end value for the &#x60;within&#x60; operator. |  [optional] |
|**startInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;start&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**endInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;end&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**timezoneInsensitive** | **Boolean** | Indicates whether the &#x60;within&#x60; operator ignores time zones and compares the wall-clock time only. When &#x60;false&#x60;, time zones are taken into account. |  [optional] |
|**values** | [**LocationCheckAttributeBlock1Values**](LocationCheckAttributeBlock1Values.md) |  |  |
|**count** | **Object** | The count threshold for &#x60;containsAtLeast&#x60; and &#x60;containsExactly&#x60; operators. |  [optional] |
|**onFailure** | [**List&lt;Block&gt;**](Block.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECK_ATTRIBUTE | &quot;checkAttribute&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| IN | &quot;in&quot; |
| NOT_IN_ | &quot;not(in)&quot; |



