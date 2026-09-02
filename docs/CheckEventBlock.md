

# CheckEventBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**eventType** | **String** | The event type to check against. |  |
|**matchers** | [**List&lt;Block&gt;**](Block.md) |  |  [optional] |
|**onFailure** | [**List&lt;Block&gt;**](Block.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



