

# CheckReferralBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | A block discriminator of type &#x60;checkReferral&#x60;. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**redeem** | **Boolean** | When &#x60;true&#x60;, the referral code is redeemed. |  |
|**onFailure** | [**List&lt;Block&gt;**](Block.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECK_REFERRAL | &quot;checkReferral&quot; |



