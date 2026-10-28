

# LoyaltyCardBatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numberOfCards** | **Long** | Number of loyalty cards in the batch. |  |
|**batchId** | **String** | ID of the loyalty card batch. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the loyalty cards in the batch. |  [optional] |
|**attributes** | **Object** | Set values for the [custom attributes](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes) of a loyalty card. These attributes must be created in the Campaign Manager before their values can be updated through this endpoint.  |  [optional] |
|**cardCodeSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



