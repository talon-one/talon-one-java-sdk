

# ReferralConstraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | Timestamp at which point the referral code becomes valid. |  [optional] |
|**expiryDate** | **OffsetDateTime** | Expiration date of the referral code. Referral never expires if this is omitted. |  [optional] |
|**usageLimit** | **Long** | The number of times a referral code can be used. &#x60;0&#x60; means no limit but any campaign usage limits will still apply.  |  [optional] |



