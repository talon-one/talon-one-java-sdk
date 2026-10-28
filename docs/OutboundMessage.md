

# OutboundMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | UUID of the outbound message. |  |
|**notificationId** | **Long** | ID of the notification that triggered the outbound message. |  [optional] |
|**notificationName** | **String** | Name of the notification that triggered the outbound message. |  [optional] |
|**webhookId** | **Long** | ID of the webhook that triggered the outbound message. |  [optional] |
|**webhookName** | **String** | Name of the webhook that triggered the outbound message. |  [optional] |
|**notificationType** | **String** | Type of notification that triggered the outbound message. |  |
|**applicationId** | **Long** | ID of the Application associated with the outbound message. |  [optional] |
|**loyaltyProgramId** | **Long** | ID of the loyalty program associated with the outbound message. |  [optional] |
|**request** | [**OutboundLogRequest**](OutboundLogRequest.md) |  |  [optional] |
|**firstLogAt** | **OffsetDateTime** | Timestamp of the first log entry for this message. |  |
|**lastLogAt** | **OffsetDateTime** | Timestamp of the last log entry for this message. |  |
|**lastResponseCode** | **Long** | HTTP status code from the latest response. |  [optional] |
|**status** | **String** |  |  |
|**retryCount** | **Long** | Number of retries. |  [optional] |
|**responses** | [**List&lt;OutboundMessageResponse&gt;**](OutboundMessageResponse.md) | Log entries for this message. One entry per delivery attempt. Empty when &#x60;includeLogs&#x3D;false&#x60;. |  [optional] |



