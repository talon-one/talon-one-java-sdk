

# IntegrationHubEventRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | ID of the event record. |  |
|**flowId** | **Long** | ID of the integration hub flow. |  |
|**integrationName** | **String** | Name of the integration. |  [optional] |
|**instanceName** | **String** | Name of the integration instance. |  [optional] |
|**eventType** | **IntegrationHubEventType** |  |  |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |
|**processedAt** | **OffsetDateTime** | Timestamp when the event was processed. |  [optional] |
|**deliveredAt** | **OffsetDateTime** | Timestamp when the event was delivered. |  [optional] |
|**scheduledTo** | **OffsetDateTime** | Timestamp after which the event is scheduled to be processed. |  |
|**retry** | **Long** | Number of delivery retries attempted. |  |
|**payload** | **String** | The event payload as a formatted JSON string. |  |



