

# InventoryReferral


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**startDate** | **OffsetDateTime** | Timestamp at which point the referral code becomes valid. |  [optional] |
|**expiryDate** | **OffsetDateTime** | Expiration date of the referral code. Referral never expires if this is omitted. |  [optional] |
|**usageLimit** | **Long** | The number of times a referral code can be used. &#x60;0&#x60; means no limit but any campaign usage limits will still apply.  |  [optional] |
|**campaignId** | **Long** | ID of the campaign from which the referral received the referral code. |  |
|**advocateProfileIntegrationId** | **String** | The Integration ID of the Advocate&#39;s Profile. |  |
|**friendProfileIntegrationId** | **String** | An optional Integration ID of the Friend&#39;s Profile. |  [optional] |
|**attributes** | **Object** | Arbitrary properties associated with this item. |  [optional] |
|**importId** | **Long** | The ID of the Import which created this referral. |  [optional] |
|**code** | **String** | The referral code. |  |
|**usageCounter** | **Long** | The number of times this referral code has been successfully used. |  |
|**batchId** | **String** | The ID of the batch the referrals belong to. |  [optional] |
|**referredCustomers** | **List&lt;String&gt;** | An array of referred customers. |  |



