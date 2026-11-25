

# RewardBudgetLimitCounter

The count of times the reward has been unlocked in the current period, and how many times it can still be unlocked. It is shown when the budget scope is `perReward`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**counter** | **Long** | The number of times the reward has been unlocked in the current period. It is &#x60;0&#x60; if the reward has not been unlocked by any profile yet. |  |
|**remaining** | **Long** | The number of times the reward can still be unlocked. It is never negative. |  |



