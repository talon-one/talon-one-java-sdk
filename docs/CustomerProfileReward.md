

# CustomerProfileReward

A reward instance held by a customer profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the customer reward instance. A customer profile can have multiple instances of the same reward. |  |
|**rewardId** | **Long** | The ID of the reward this instance belongs to. |  |
|**rewardName** | **String** | The name of the reward. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the customer reward: - &#x60;unlocked&#x60;: The reward is available for use. - &#x60;used&#x60;: The reward has been used.  |  |
|**unlockedAt** | **OffsetDateTime** | The date and time when the reward was unlocked. |  |
|**unlockedByIntegrationId** | **String** | The integration ID of the customer profile that unlocked the reward.   For rewards unlocked with a loyalty card, this can be any customer profile  linked to that loyalty card.  |  [optional] |
|**usedAt** | **OffsetDateTime** | The date and time when the reward was used. |  [optional] |
|**usedByIntegrationId** | **String** | The integration ID of the customer profile that used the reward.   For rewards unlocked with a loyalty card, this can be any customer profile  linked to that loyalty card.   Only returned when the reward has been used.  |  [optional] |
|**loyaltyProgramId** | **Long** | The ID of the loyalty program that the loyalty card belongs to. Only returned for rewards unlocked with a loyalty card. |  [optional] |
|**loyaltyCardIdentifier** | **String** | The identifier of the loyalty card that the reward was unlocked with. Only returned for rewards unlocked with a loyalty card. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNLOCKED | &quot;unlocked&quot; |
| USED | &quot;used&quot; |



