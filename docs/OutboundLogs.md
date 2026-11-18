

# OutboundLogs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextCursor** | **byte[]** | Cursor for the next page of results. Omitted when there are no more results. |  [optional] |
|**data** | [**List&lt;OutboundLogsDataInner&gt;**](OutboundLogsDataInner.md) | List of outbound log entries. The &#x60;type&#x60; field determines the kind of entry. When an error ends the response, an &#x60;OutboundLogStreamErrorEntry&#x60; is the last item and the response is incomplete. |  |



