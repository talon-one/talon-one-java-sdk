

# CreateCouponBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**campaignId** | [**CreateCouponBlock1CampaignId**](CreateCouponBlock1CampaignId.md) |  |  |
|**recipientId** | **String** | The integration ID of the customer that is allowed to redeem this coupon. |  |
|**storeInSession** | **Boolean** | When &#x60;true&#x60;, the coupon is stored in the session. |  |
|**usageLimit** | [**CreateCouponBlock1UsageLimit**](CreateCouponBlock1UsageLimit.md) |  |  [optional] |
|**discountLimit** | [**CreateCouponBlock1DiscountLimit**](CreateCouponBlock1DiscountLimit.md) |  |  [optional] |
|**startDate** | **Object** |  |  [optional] |
|**expiryDate** | **Object** |  |  [optional] |
|**attributes** | **Object** |  |  [optional] |
|**validCharacters** | **String** | Characters used to generate the random parts of a code. |  [optional] |
|**pattern** | **String** | The pattern used to generate codes, such as coupon codes, referral codes, and loyalty cards. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set.  |  [optional] |



