

# CouponRejectionReason

Holds a reference to the campaign, the coupon and the reason for which that coupon was rejected. Should only be present when there is a 'rejectCoupon' effect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **Long** |  |  |
|**couponId** | **Long** |  |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| COUPON_NOT_FOUND | &quot;CouponNotFound&quot; |
| COUPON_PART_OF_NOT_RUNNING_CAMPAIGN | &quot;CouponPartOfNotRunningCampaign&quot; |
| CAMPAIGN_LIMIT_REACHED | &quot;CampaignLimitReached&quot; |
| PROFILE_LIMIT_REACHED | &quot;ProfileLimitReached&quot; |
| COUPON_RECIPIENT_DOES_NOT_MATCH | &quot;CouponRecipientDoesNotMatch&quot; |
| COUPON_EXPIRED | &quot;CouponExpired&quot; |
| COUPON_START_DATE_IN_FUTURE | &quot;CouponStartDateInFuture&quot; |
| COUPON_REJECTED_BY_CONDITION | &quot;CouponRejectedByCondition&quot; |
| EFFECT_COULD_NOT_BE_APPLIED | &quot;EffectCouldNotBeApplied&quot; |
| COUPON_PART_OF_NOT_TRIGGERED_CAMPAIGN | &quot;CouponPartOfNotTriggeredCampaign&quot; |
| COUPON_RESERVATION_REQUIRED | &quot;CouponReservationRequired&quot; |
| PROFILE_REQUIRED | &quot;ProfileRequired&quot; |



