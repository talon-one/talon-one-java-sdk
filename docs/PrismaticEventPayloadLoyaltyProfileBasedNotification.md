

# PrismaticEventPayloadLoyaltyProfileBasedNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileIntegrationID** | **String** |  |  |
|**loyaltyProgramID** | **Long** |  |  |
|**subledgerID** | **String** |  |  |
|**sourceOfEvent** | **String** |  |  |
|**employeeName** | **String** |  |  [optional] |
|**userID** | **Long** |  |  [optional] |
|**currentPoints** | **Float** |  |  |
|**actions** | [**List&lt;PrismaticEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction&gt;**](PrismaticEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction.md) |  |  [optional] |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |
|**currentTier** | **String** |  |  [optional] |
|**oldTier** | **String** |  |  [optional] |
|**tierExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**timestampOfTierChange** | **OffsetDateTime** |  |  [optional] |
|**pointsRequiredToTheNextTier** | **Float** |  |  [optional] |
|**nextTier** | **String** |  |  [optional] |



