

# ReferralRejectionReason

Holds a reference to the campaign, the referral and the reason for which that referral was rejected. Should only be present when there is a 'rejectReferral' effect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **Long** |  |  |
|**referralId** | **Long** |  |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| REFERRAL_NOT_FOUND | &quot;ReferralNotFound&quot; |
| REFERRAL_RECIPIENT_ID_SAME_AS_ADVOCATE | &quot;ReferralRecipientIdSameAsAdvocate&quot; |
| REFERRAL_PART_OF_NOT_RUNNING_CAMPAIGN | &quot;ReferralPartOfNotRunningCampaign&quot; |
| REFERRAL_LIMIT_REACHED | &quot;ReferralLimitReached&quot; |
| CAMPAIGN_LIMIT_REACHED | &quot;CampaignLimitReached&quot; |
| PROFILE_LIMIT_REACHED | &quot;ProfileLimitReached&quot; |
| REFERRAL_RECIPIENT_DOES_NOT_MATCH | &quot;ReferralRecipientDoesNotMatch&quot; |
| REFERRAL_EXPIRED | &quot;ReferralExpired&quot; |
| REFERRAL_START_DATE_IN_FUTURE | &quot;ReferralStartDateInFuture&quot; |
| REFERRAL_REJECTED_BY_CONDITION | &quot;ReferralRejectedByCondition&quot; |
| EFFECT_COULD_NOT_BE_APPLIED | &quot;EffectCouldNotBeApplied&quot; |
| REFERRAL_PART_OF_NOT_TRIGGERED_CAMPAIGN | &quot;ReferralPartOfNotTriggeredCampaign&quot; |



