

# ShowNotificationBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**notificationType** | **String** | The type of notification to display. |  |
|**title** | **String** | The notification heading shown to the customer. |  |
|**body** | **String** | The notification body text. Supports template placeholders (e.g. \&quot;{{$Session.Total}}\&quot;) evaluated at rule execution time. |  [optional] |
|**onFailure** | **List&lt;Object&gt;** | Blocks evaluated when this block fails or returns false. |  [optional] |
|**onError** | **Map&lt;String, List&lt;Object&gt;&gt;** | Named error handlers evaluated when a specific error occurs. |  [optional] |



