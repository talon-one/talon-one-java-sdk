

# OutboundLog


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
|**createdAt** | **OffsetDateTime** | Timestamp when the log was created. |  |
|**processingTimeMs** | **Long** | Time in milliseconds between sending the outbound request and receiving the response. |  |
|**response** | [**OutboundLogResponse**](OutboundLogResponse.md) |  |  [optional] |



