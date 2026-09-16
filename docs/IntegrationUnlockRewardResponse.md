

# IntegrationUnlockRewardResponse

Contains the result of unlocking a reward for a customer profile or loyalty card. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerProfile** | [**CustomerProfile**](CustomerProfile.md) | The customer profile that unlocked the reward. |  [optional] |
|**loyalty** | [**Loyalty**](Loyalty.md) | The loyalty information of the customer profile or loyalty card that unlocked the reward. |  [optional] |
|**effects** | [**List&lt;Effect&gt;**](Effect.md) | The effects generated when evaluating this reward unlock, after the reward&#39;s eligibility conditions are met. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects). |  |



