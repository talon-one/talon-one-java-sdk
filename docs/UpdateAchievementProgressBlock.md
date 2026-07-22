

# UpdateAchievementProgressBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**value** | **String** | The value to update the progress by. Supports template placeholders (e.g. \&quot;{{$Session.Total / 2}}\&quot;) for dynamic quantities. |  |
|**achievement** | [**UpdateAchievementProgressBlock1Achievement**](UpdateAchievementProgressBlock1Achievement.md) |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| INCREASE_BY | &quot;increaseBy&quot; |



