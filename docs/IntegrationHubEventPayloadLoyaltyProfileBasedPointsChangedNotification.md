

# IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileIntegrationID** | **String** |  |  |
|**loyaltyProgramID** | **Long** |  |  |
|**loyaltyProgramName** | **String** | The name of the loyalty program. |  |
|**subledgerID** | **String** |  |  |
|**sourceOfEvent** | **String** |  |  |
|**currentTier** | **String** | The name of the customer&#39;s current tier. |  |
|**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. Only set when the change results from a rule engine execution; empty otherwise. |  [optional] |
|**employeeName** | **String** |  |  [optional] |
|**userID** | **Long** |  |  [optional] |
|**currentPoints** | **Float** |  |  |
|**actions** | [**List&lt;IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction&gt;**](IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction.md) |  |  [optional] |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |



