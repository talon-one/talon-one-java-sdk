

# IntegrationHubPaginatedEventPayloadDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **Long** | The ID of the integration hub event. Return this value in the delivery-status callback to mark the event delivered or failed. |  |
|**profileIntegrationID** | **String** |  |  |
|**loyaltyProgramID** | **Long** |  |  |
|**loyaltyProgramName** | **String** | The name of the loyalty program. |  |
|**subledgerID** | **String** |  |  |
|**sourceOfEvent** | **String** |  |  |
|**currentTier** | **String** | The name of the customer&#39;s current tier. |  |
|**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. Only set when the change results from a rule engine execution; empty otherwise. |  [optional] |
|**employeeName** | **String** |  |  |
|**userID** | **Long** |  |  [optional] |
|**currentPoints** | **Float** |  |  |
|**actions** | [**List&lt;IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction&gt;**](IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction.md) |  |  [optional] |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |
|**oldTier** | **String** |  |  [optional] |
|**tierExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**timestampOfTierChange** | **OffsetDateTime** |  |  [optional] |
|**pointsRequiredToTheNextTier** | **Float** |  |  [optional] |
|**nextTier** | **String** |  |  [optional] |
|**id** | **Long** |  |  |
|**created** | **OffsetDateTime** |  |  |
|**campaignId** | **Long** |  |  |
|**value** | **String** |  |  |
|**usageLimit** | **Long** |  |  |
|**discountLimit** | **Float** |  |  [optional] |
|**reservationLimit** | **Long** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**usageCounter** | **Long** |  |  |
|**discountCounter** | **Float** |  |  [optional] |
|**discountRemainder** | **Float** |  |  [optional] |
|**referralId** | **Long** |  |  [optional] |
|**recipientIntegrationId** | **String** |  |  [optional] |
|**importId** | **Long** |  |  [optional] |
|**batchId** | **String** |  |  [optional] |
|**attributes** | **Object** |  |  [optional] |
|**limits** | [**List&lt;IntegrationHubEventPayloadCouponBasedNotificationsLimits&gt;**](IntegrationHubEventPayloadCouponBasedNotificationsLimits.md) |  |  [optional] |



