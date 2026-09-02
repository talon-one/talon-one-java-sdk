

# CreateReferralBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**campaignId** | [**CreateReferralBlock1CampaignId**](CreateReferralBlock1CampaignId.md) |  |  |
|**friendId** | **String** | An optional integration ID of the friend&#39;s profile. |  |
|**storeInSession** | **Boolean** | When &#x60;true&#x60;, the referral code is stored in the session. |  |
|**usageLimit** | [**CreateReferralBlock1UsageLimit**](CreateReferralBlock1UsageLimit.md) |  |  [optional] |
|**startDate** | **Object** | Timestamp at which point the referral code becomes valid. |  [optional] |
|**expiryDate** | **Object** | Expiration date of the referral code. Referral code never expires if this is omitted. |  [optional] |
|**attributes** | **Object** | Custom attributes associated with this referral code. |  [optional] |
|**validCharacters** | **String** | Characters used to generate the random parts of a code. |  [optional] |
|**pattern** | **String** | The pattern used to generate codes, such as coupon codes, referral codes, and loyalty cards. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set.  |  [optional] |



