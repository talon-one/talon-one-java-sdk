

# EffectAllOfProps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **BigDecimal** | The current progress of the customer in the achievement. |  |
|**id** | **Long** | The id of the referral code that was redeemed. |  |
|**rejectionReason** | **String** | The reason why the code was rejected.  - &#x60;AdvocateNotFound&#x60;: The advocate was not found. - &#x60;CampaignLimitReached&#x60;: The campaign-wide referral code redemption limit has been reached. - &#x60;EffectCouldNotBeApplied&#x60;: One of the effects in the campaign wasn&#39;t applied because a limit for that effect was reached (most common use case will be &#x60;setDiscount&#x60; can not be applied because a discount limit is reached). - &#x60;ProfileLimitReached&#x60;: The profile-specific referral code redemption limit has been reached. - &#x60;ReferralCustomerAlreadyReferred&#x60;: The friend is already referred. - &#x60;ReferralExpired&#x60;: The transferred referral code is expired. - &#x60;ReferralLimitReached&#x60;: The referral code redemption limit has been reached. - &#x60;ReferralNotFound&#x60;: The transferred referral code is wrong. - &#x60;ReferralPartOfNotRunningCampaign&#x60;: The campaign the referral code belongs to is currently not active. The campaign ID field shows the ID of that campaign. - &#x60;ReferralRecipientDoesNotMatch&#x60;: The given referral code value does not match the recipient. - &#x60;ReferralRecipientIdSameAsAdvocate&#x60;: The recipient (friend) has the same id as the advocate. - &#x60;ReferralRejectedByCondition&#x60;: The referral code is valid and in an active campaign, but there were other conditions in that campaign&#39;s rules that were not met. - &#x60;ReferralStartDateInFuture&#x60;: The transferred referral code isn&#39;t active yet. - &#x60;ReferralPartOfNotTriggeredCampaign&#x60;: The campaign the referral code belongs to was not triggered during evaluation (an exclusive or stackable campaign). The campaign ID field shows the ID of that campaign. |  |
|**conditionIndex** | **Long** | The index of the condition that caused the rejection of the referral. |  [optional] |
|**effectIndex** | **Long** | The index of the effect that caused the rejection of the referral. |  [optional] |
|**details** | **String** | More details about the failure. |  [optional] |
|**campaignExclusionReason** | **String** | The reason why the campaign the referral belongs to was excluded during [campaign evaluation](https://docs.talon.one/docs/product/applications/manage-campaign-evaluation), when &#x60;rejectionReason&#x60; was &#x60;CouponPartOfNotTriggeredCampaign&#x60;. Its possible values are:  - &#x60;CampaignGaveLowerDiscount&#x60;: The required campaign and referral conditions were met, but another campaign in a [Highest discount value](https://docs.talon.one/docs/product/applications/manage-campaign-evaluation#set-campaign-evaluation-mode) group offered a higher discount value. - &#x60;CampaignIsNotFirst&#x60;: The campaign was not evaluated because another campaign in a [First campaign](https://docs.talon.one/docs/product/applications/manage-campaign-evaluation#set-campaign-evaluation-mode) group was picked and evaluated first. - &#x60;CampaignNotInEvaluationSet&#x60;: The campaign did not meet other evaluation requirements, for example, because the referral is part of an archived campaign. |  [optional] |
|**profileId** | **Long** | The internal ID of the customer profile. |  |
|**name** | **String** | The description of this discount. &#x60;#number&#x60; is appended to the name. It is equal to the &#x60;position&#x60; property. |  |
|**scope** | **String** | The scope of the rolled back discount.  - For a discount per session, it can be one of &#x60;cartItems&#x60;, &#x60;additionalCosts&#x60; or &#x60;sessionTotal&#x60; - For a discount per item, it can be one of &#x60;price&#x60;, &#x60;additionalCosts&#x60; or &#x60;itemTotal&#x60; |  [optional] |
|**desiredValue** | **BigDecimal** | _[(Partial discounts enabled only)](https://docs.talon.one/docs/product/applications/manage-general-settings#partial-discounts)_. The monetary value of the discount to be applied to the additional cost without considering budget limitations. |  [optional] |
|**position** | **BigDecimal** | The index of the item in the &#x60;cartItem&#x60; object containing the additional cost that this discount applies to. |  |
|**subPosition** | **BigDecimal** | The index of the item unit in its line item. |  [optional] |
|**totalDiscount** | **BigDecimal** | _(Pro rata discounts only)_ The monetary value of the total effective discount |  [optional] |
|**desiredTotalDiscount** | **BigDecimal** | _(Pro rata discounts only)_ The monetary value of the total discount to be applied without considering budget limitations |  [optional] |
|**bundleIndex** | **Long** | The position of the bundle in a list of item bundles created from the same bundle definition. |  [optional] |
|**bundleName** | **String** | The name of the bundle definition. |  [optional] |
|**targetedItemPosition** | **BigDecimal** | _(Discounting individual item in bundles only)_ The index of the targeted bundle item on which the applied discount is based. |  [optional] |
|**targetedItemSubPosition** | **BigDecimal** | _(Discounting individual item in bundles only)_ The sub-position of the targeted bundle item on which the applied discount is based. |  [optional] |
|**excludedFromPriceHistory** | **Boolean** | When set to &#x60;true&#x60;, the applied discount is excluded from the item&#39;s price history. |  [optional] |
|**additionalCostId** | **Long** | The identifier of the additional cost to be discounted. |  |
|**additionalCost** | **String** | The API name of the additional cost to be discounted. |  |
|**webhookId** | **BigDecimal** | The internal ID of the webhook. |  |
|**webhookName** | **String** | The name of the webhook. |  |
|**programId** | **Long** | ID of the loyalty program that contains these points. |  |
|**subLedgerId** | **String** | API name of the loyalty program subledger that contains these points. |  |
|**recipientIntegrationId** | **String** | The integration ID of the customer that receives the giveaway. |  |
|**startDate** | **OffsetDateTime** | Timestamp at which the customer&#39;s progress started. |  |
|**expiryDate** | **OffsetDateTime** | The date after which the reimbursed points will expire. |  [optional] |
|**transactionUUID** | **String** | The identifier of this loyalty point transaction. |  |
|**cartItemPosition** | **BigDecimal** | The index of the item in the cart item list to which the custom effect is applied. |  [optional] |
|**cartItemSubPosition** | **BigDecimal** | For cart items with quantity &gt; 1, the sub position indicates to which item unit the custom effect is applied.  |  [optional] |
|**cardIdentifier** | **String** | The identifier of the card from which these points were originally deducted. |  [optional] |
|**awaitsActivation** | **Boolean** | Indicates whether the points have an action-based start date. This property is returned only for point transactions with an action-based start date. |  [optional] |
|**validityDuration** | **String** | The duration for which the points remain active, calculated relative to their start date. |  [optional] |
|**ruleTitle** | **String** | The title of the rule that triggered the tier upgrade. |  |
|**previousTierName** | **String** | The name of the tier from which the user was upgraded. |  [optional] |
|**newTierName** | **String** | The name of the tier to which the user has been upgraded. |  |
|**sku** | **String** | SKU of the item that needs to be added. |  |
|**desiredQuantity** | **Long** | The original quantity in case a partial reward was applied. |  [optional] |
|**notificationType** | **String** | The type of notification. |  |
|**title** | **String** | The title of the notification. |  |
|**body** | **String** | The body of the notification. |  |
|**path** | **String** | The entity type and the attribute name. |  |
|**description** | **String** | Description of the product bundle. |  |
|**bundleAttributes** | **List&lt;String&gt;** | The cart item attributes that determined which items are being bundled together. |  |
|**itemsIndices** | **List&lt;BigDecimal&gt;** | The indices in the cart items array of the bundled items. |  |
|**poolId** | **Long** | The internal ID of the giveaway pool. |  |
|**poolName** | **String** | The name of the giveaway pool. |  |
|**giveawayId** | **Long** | The internal ID of the giveaway. |  |
|**code** | **String** | The giveaway code to be rewarded. |  |
|**message** | **String** | The error message. |  |
|**effectId** | **Long** | The ID of the custom effect that was triggered. |  |
|**payload** | **Object** | The JSON payload of the custom effect. |  |
|**couponValue** | **String** | The coupon code that was created. |  |
|**profileIntegrationId** | **String** | The ID of the customer profile in the third-party integration platform. |  |
|**isNewReservation** | **Boolean** | Indicates whether this is a new coupon reservation or not. |  |
|**audienceId** | **Long** | The internal ID of the audience. |  [optional] |
|**audienceName** | **String** | The name of the audience. |  [optional] |
|**achievementId** | **Long** | The ID of the achievement. |  |
|**achievementName** | **String** | The name of the achievement. |  |
|**progressTrackerId** | **Long** | The ID of the customer&#39;s progress tracker for this achievement.  For [on-completion achievements](https://docs.talon.one/docs/product/campaigns/achievements/achievements-overview#recurring-on-completion-achievements), this effect generates a unique ID for each iteration. |  |
|**delta** | **BigDecimal** | The value by which the customer&#39;s current progress in the achievement has increased. |  |
|**target** | **BigDecimal** | The target value to complete the achievement. |  |
|**isJustCompleted** | **Boolean** | Indicates if the customer has completed the achievement in the current session. |  |
|**decreaseProgressBy** | **BigDecimal** | The value by which the customer&#39;s current progress in the achievement has decreased. |  |
|**currentProgress** | **BigDecimal** | The current progress of the customer in the achievement. |  |
|**extensionDuration** | **String** | Time frame by which the expiry date extends.  The time format is either: - immediate, or - an **integer** followed by a letter indicating the time unit.  Examples: &#x60;immediate&#x60;, &#x60;30s&#x60;, &#x60;40m&#x60;, &#x60;1h&#x60;, &#x60;5D&#x60;, &#x60;7W&#x60;, &#x60;10M&#x60;, &#x60;15Y&#x60;.  Available units:  - &#x60;s&#x60;: seconds - &#x60;m&#x60;: minutes - &#x60;h&#x60;: hours - &#x60;D&#x60;: days - &#x60;W&#x60;: weeks - &#x60;M&#x60;: months - &#x60;Y&#x60;: years  You can round certain units up or down: - &#x60;_D&#x60; for rounding down days only. Signifies the start of the day. - &#x60;_U&#x60; for rounding up days, weeks, months and years. Signifies the end of the day, week, month or year.  |  |
|**affectedTransactions** | [**List&lt;LoyaltyLedgerEntryExpiryDateChange&gt;**](LoyaltyLedgerEntryExpiryDateChange.md) | List of transactions affected by the expiry date update. |  [optional] |
|**newExpiryDate** | **OffsetDateTime** | The specified expiry date and time for all active and pending point transactions in the loyalty program subledger. |  |
|**endDate** | **OffsetDateTime** | Timestamp at which this progress period ends.  Only returned for achievements that have a fixed end date. [On-completion achievements](https://docs.talon.one/docs/product/campaigns/achievements/achievements-overview#recurring-on-completion-achievements) have no end date. |  [optional] |



