

# CustomerProfileReward

A reward instance held by a customer profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the customer reward instance. A customer profile can have multiple instances of the same reward. |  |
|**integrationId** | **String** | The integration ID of the customer reward instance. |  |
|**rewardId** | **Long** | The ID of the reward this instance belongs to. |  |
|**rewardIntegrationId** | **String** | The integration ID of the reward this instance belongs to. |  |
|**rewardName** | **String** | The name of the reward. |  |
|**description** | **String** | The customer-facing description of the reward. |  [optional] |
|**rule** | [**RuleMetadata**](RuleMetadata.md) | Customer-facing rule metadata for the reward. Only returned when the reward defines a rule. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the customer reward: - &#x60;unlocked&#x60;: The reward is available for use. - &#x60;used&#x60;: The reward has been used. - &#x60;expired&#x60;: The reward was not used before its expiry date.  |  |
|**unlockedAt** | **OffsetDateTime** | The date and time when the reward was unlocked. |  |
|**unlockedByProfileIntegrationId** | **String** | The integration ID of the customer profile that unlocked the reward.   For rewards unlocked with a loyalty card, this can be any customer profile  linked to that loyalty card.  |  [optional] |
|**expiryDate** | **OffsetDateTime** | The date and time when the customer reward expires, based on the  &#x60;validityDuration&#x60; or &#x60;expiryDate&#x60; of the reward when the reward was  unlocked. If the reward does not specify either property, the customer reward  has unlimited validity and this field is omitted.  **Note**: The expiry date is calculated using the time zone of the  Application connected to the reward.  |  [optional] |
|**usedAt** | **OffsetDateTime** | The date and time when the reward was used. |  [optional] |
|**usedByProfileIntegrationId** | **String** | The integration ID of the customer profile that used the reward.   For rewards unlocked with a loyalty card, this can be any customer profile  linked to that loyalty card.   Only returned when the reward has been used.  |  [optional] |
|**loyaltyProgramId** | **Long** | The ID of the loyalty program that the loyalty card belongs to. Only returned for rewards unlocked with a loyalty card. |  [optional] |
|**loyaltyCardId** | **String** | The identifier of the loyalty card that the reward was unlocked with. Only returned for rewards unlocked with a loyalty card. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNLOCKED | &quot;unlocked&quot; |
| USED | &quot;used&quot; |
| EXPIRED | &quot;expired&quot; |



