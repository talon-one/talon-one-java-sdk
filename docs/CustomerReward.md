

# CustomerReward

A reward unlocked by a customer profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **Long** | The ID of the Application in which the reward was unlocked. |  |
|**profileIntegrationId** | **String** | The integration ID of the customer profile that unlocked this reward. |  |
|**integrationId** | **String** | The integration ID assigned to this reward unlock. |  |
|**unlockedAt** | **OffsetDateTime** | The date and time when the reward was unlocked. |  |
|**expiryDate** | **OffsetDateTime** | The date and time when the customer reward expires, based on the  &#x60;validityDuration&#x60; or &#x60;expiryDate&#x60; of the reward when the reward was  unlocked. If the reward does not specify either property, the customer reward  has unlimited validity and this field is omitted.  **Note**: The expiry date is calculated using the time zone of the  Application connected to the reward.  |  [optional] |
|**usedAt** | **OffsetDateTime** | The date and time when the reward was used. |  [optional] |



