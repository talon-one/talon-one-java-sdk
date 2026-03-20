

# IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Float** |  |  |
|**reason** | **String** |  |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**transactionUUID** | **UUID** | The identifier of the transaction in the loyalty ledger. |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADDITION | &quot;addition&quot; |
| SUBTRACTION | &quot;subtraction&quot; |



