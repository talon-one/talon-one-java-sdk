

# CheckLoyaltyCardBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares its elements. |  |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LINKED | &quot;linked&quot; |
| NOT_LINKED_ | &quot;not(linked)&quot; |



