

# RollbackIncreasedAchievementProgressEffectProps

The properties specific to the \"rollbackIncreasedAchievementProgress\" effect. This gets triggered whenever a closed session where the `increaseAchievementProgress` effect was triggered is cancelled. This is applicable only when the customer has not completed the achievement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**achievementId** | **Long** | The internal ID of the achievement. |  |
|**achievementName** | **String** | The name of the achievement. |  |
|**progressTrackerId** | **Long** | The internal ID of the achievement progress tracker. |  |
|**decreaseProgressBy** | **BigDecimal** | The value by which the customer&#39;s current progress in the achievement is decreased. |  |
|**currentProgress** | **BigDecimal** | The current progress of the customer in the achievement. |  |
|**target** | **BigDecimal** | The target value to complete the achievement. |  |



