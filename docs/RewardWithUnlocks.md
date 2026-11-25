

# RewardWithUnlocks

A reward and details of each time a customer profile has unlocked it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The unique ID of the reward. |  |
|**integrationId** | **String** | A unique identifier used to reference the reward in API integrations. |  |
|**name** | **String** | The customer-facing name of the reward. |  |
|**description** | **String** | Customer-facing description of the reward. |  [optional] |
|**rule** | [**RuleMetadata**](RuleMetadata.md) | Customer-facing rule metadata for the reward. |  |
|**unlocked** | [**List&lt;CustomerReward&gt;**](CustomerReward.md) | The instances of this reward that the customer has unlocked but not used. Expired customer rewards are not returned. |  [optional] |



