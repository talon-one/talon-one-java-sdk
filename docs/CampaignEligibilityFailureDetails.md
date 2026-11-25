

# CampaignEligibilityFailureDetails

The details about why the customer was not eligible for the campaign in the current session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failureCode** | [**FailureCodeEnum**](#FailureCodeEnum) | A code identifying why the customer was not eligible for the campaign.  - &#x60;ALL_RULES_FAILED&#x60;: Every rule in the campaign failed for the customer,  so they are not eligible for the campaign.  - &#x60;SKIPPED&#x60;: The campaign was not applied in the current session because  it was not selected for evaluation. For example, another campaign in the  same evaluation group took precedence.  - &#x60;AUDIENCE_NOT_MATCHED&#x60;: The campaign was not evaluated because the  customer profile is not a member of any audience that the campaign targets.  |  |



## Enum: FailureCodeEnum

| Name | Value |
|---- | -----|
| ALL_RULES_FAILED | &quot;ALL_RULES_FAILED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| AUDIENCE_NOT_MATCHED | &quot;AUDIENCE_NOT_MATCHED&quot; |



