

# RiskNotification

A risk notification configuration rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**entity** | [**EntityEnum**](#EntityEnum) | The entity type to analyze within the given time frame. |  |
|**activity** | [**ActivityEnum**](#ActivityEnum) | The activity metric to analyze within the given entity. |  |
|**timeFrame** | [**TimeFrameEnum**](#TimeFrameEnum) | The rolling time window for risk evaluation. |  |
|**active** | **Boolean** | Indicates whether this risk notification is active. |  |
|**modified** | **OffsetDateTime** | Timestamp of the most recent update. |  |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| CUSTOMER_PROFILE | &quot;customer_profile&quot; |
| CUSTOMER_SESSION | &quot;customer_session&quot; |



## Enum: ActivityEnum

| Name | Value |
|---- | -----|
| LOYALTY_POINTS_EARNED | &quot;loyalty_points_earned&quot; |
| DISCOUNTED_AMOUNT | &quot;discounted_amount&quot; |
| COMPLETED_ORDERS | &quot;completed_orders&quot; |
| COUPON_ATTEMPTS | &quot;coupon_attempts&quot; |



## Enum: TimeFrameEnum

| Name | Value |
|---- | -----|
| _1_DAY | &quot;1_day&quot; |
| _1_WEEK | &quot;1_week&quot; |
| _1_MONTH | &quot;1_month&quot; |



