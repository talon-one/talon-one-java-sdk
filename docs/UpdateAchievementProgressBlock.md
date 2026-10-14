

# UpdateAchievementProgressBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**value** | [**UpdateAchievementProgressBlock1Value**](UpdateAchievementProgressBlock1Value.md) |  |  |
|**achievement** | [**AchievementBlockReference**](AchievementBlockReference.md) | The achievement to update. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| INCREASE_BY | &quot;increaseBy&quot; |



