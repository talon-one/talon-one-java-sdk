

# UpdateReferralBatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Object** | Arbitrary properties associated with this item. |  [optional] |
|**batchID** | **String** | The id of the batch the referral belongs to. |  |
|**startDate** | **OffsetDateTime** | Timestamp at which point the referral code becomes valid. |  [optional] |
|**expiryDate** | **OffsetDateTime** | Expiration date of the referral code. Referral never expires if this is omitted. |  [optional] |
|**usageLimit** | **Long** | The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply.  |  [optional] |



