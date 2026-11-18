

# RewardBudget


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**rewardId** | **Long** | The ID of the reward this budget applies to. |  |
|**metric** | [**MetricEnum**](#MetricEnum) | The customer action that counts towards the budget. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The type of count that the budget keeps of how many times the reward has  been unlocked.  - &#x60;perReward&#x60;: Counts how many times the reward has been unlocked by all customers. - &#x60;perProfile&#x60;: Counts how many times each customer profile has unlocked the reward.  |  |
|**period** | [**PeriodEnum**](#PeriodEnum) | The time frame after which the budget count resets to &#x60;0&#x60;. If you select &#x60;overall&#x60;, the budget never resets.  The count resets at the start of each calendar time frame, not on the day the budget was created. For example, a &#x60;monthly&#x60; budget created on 20 October counts each time the reward is unlocked from 20 to 31 October. On 1 November,  resets to &#x60;0&#x60;.  |  |
|**limit** | **Long** | The maximum number of times the reward can be unlocked in the time frame. |  |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| UNLOCKS | &quot;unlocks&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| PER_REWARD | &quot;perReward&quot; |
| PER_PROFILE | &quot;perProfile&quot; |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| OVERALL | &quot;overall&quot; |
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



