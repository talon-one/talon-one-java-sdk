

# IntegrationHubEventPayloadLoyaltyProfileBasedNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileIntegrationID** | **String** |  |  |
|**loyaltyProgramID** | **Long** |  |  |
|**loyaltyProgramName** | **String** | The name of the loyalty program. |  |
|**subledgerID** | **String** |  |  |
|**sourceOfEvent** | **String** |  |  |
|**currentTier** | **String** | The name of the customer&#39;s current tier. |  |
|**employeeName** | **String** |  |  [optional] |
|**userID** | **Long** |  |  [optional] |
|**currentPoints** | **Float** |  |  |
|**actions** | [**List&lt;IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction&gt;**](IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction.md) |  |  [optional] |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |
|**oldTier** | **String** |  |  [optional] |
|**tierExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**timestampOfTierChange** | **OffsetDateTime** |  |  [optional] |
|**pointsRequiredToTheNextTier** | **Float** |  |  [optional] |
|**nextTier** | **String** |  |  [optional] |



