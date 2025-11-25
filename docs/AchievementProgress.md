

# AchievementProgress

The current progress of the customer in the achievement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the achievement. |  |
|**progress** | **BigDecimal** | The current progress of the customer in the achievement. |  |
|**startDate** | **OffsetDateTime** | Timestamp at which the customer started the achievement. |  [optional] |
|**completionDate** | **OffsetDateTime** | Timestamp at which point the customer completed the achievement. |  [optional] |
|**endDate** | **OffsetDateTime** | Timestamp at which point the achievement ends and resets for the customer. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INPROGRESS | &quot;inprogress&quot; |
| COMPLETED | &quot;completed&quot; |
| EXPIRED | &quot;expired&quot; |
| NOT_STARTED | &quot;not_started&quot; |



