

# CheckEventBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**eventType** | **String** | The event type to check against. |  |
|**matchers** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) |  |  [optional] |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



