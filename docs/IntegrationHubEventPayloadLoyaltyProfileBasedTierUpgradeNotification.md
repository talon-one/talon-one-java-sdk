

# IntegrationHubEventPayloadLoyaltyProfileBasedTierUpgradeNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileIntegrationID** | **String** |  |  |
|**loyaltyProgramID** | **Long** |  |  |
|**loyaltyProgramName** | **String** | The name of the loyalty program. |  |
|**subledgerID** | **String** |  |  |
|**sourceOfEvent** | **String** |  |  |
|**currentTier** | **String** | The name of the customer&#39;s current tier. |  |
|**currentPoints** | **Float** |  |  |
|**oldTier** | **String** |  |  [optional] |
|**pointsRequiredToTheNextTier** | **Float** |  |  [optional] |
|**nextTier** | **String** |  |  [optional] |
|**tierExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**timestampOfTierChange** | **OffsetDateTime** |  |  [optional] |
|**publishedAt** | **OffsetDateTime** | Timestamp when the event was published. |  |



