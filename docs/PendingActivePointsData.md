

# PendingActivePointsData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loyaltyProgramID** | **Long** | The ID of the loyalty program. |  |
|**subledgerID** | **String** | The ID of the subledger, when applicable. If this field is empty, the main ledger is used. |  |
|**customerProfileID** | **String** | The integration ID of the customer profile whose loyalty points are becoming active. |  |
|**points** | **BigDecimal** | The amount of pending loyalty points becoming active. |  |
|**activeOn** | **OffsetDateTime** | The date and time the loyalty points become active. |  [optional] |
|**expireOn** | **OffsetDateTime** | The date and time the loyalty points expire. |  [optional] |
|**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned. |  [optional] |



