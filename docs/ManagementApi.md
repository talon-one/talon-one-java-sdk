# ManagementApi

All URIs are relative to *https://yourbaseurl.talon.one*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUserByEmail**](ManagementApi.md#activateUserByEmail) | **POST** /v1/users/activate | Enable user by email address |
| [**addLoyaltyCardPoints**](ManagementApi.md#addLoyaltyCardPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/add_points | Add points to card |
| [**addLoyaltyPoints**](ManagementApi.md#addLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/add_points | Add points to customer profile |
| [**copyCampaignToApplications**](ManagementApi.md#copyCampaignToApplications) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/copy | Copy the campaign into the specified Application |
| [**createAccountCollection**](ManagementApi.md#createAccountCollection) | **POST** /v1/collections | Create account-level collection |
| [**createAchievement**](ManagementApi.md#createAchievement) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements | Create achievement |
| [**createAdditionalCost**](ManagementApi.md#createAdditionalCost) | **POST** /v1/additional_costs | Create additional cost |
| [**createAttribute**](ManagementApi.md#createAttribute) | **POST** /v1/attributes | Create custom attribute |
| [**createBatchLoyaltyCards**](ManagementApi.md#createBatchLoyaltyCards) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/cards/batch | Create loyalty cards |
| [**createCampaignFromTemplate**](ManagementApi.md#createCampaignFromTemplate) | **POST** /v1/applications/{applicationId}/create_campaign_from_template | Create campaign from campaign template |
| [**createCampaignStoreBudget**](ManagementApi.md#createCampaignStoreBudget) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | Create campaign store budget |
| [**createCollection**](ManagementApi.md#createCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | Create campaign-level collection |
| [**createCoupons**](ManagementApi.md#createCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Create coupons |
| [**createCouponsAsync**](ManagementApi.md#createCouponsAsync) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_async | Create coupons asynchronously |
| [**createCouponsDeletionJob**](ManagementApi.md#createCouponsDeletionJob) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_deletion_jobs | Creates a coupon deletion job |
| [**createCouponsForMultipleRecipients**](ManagementApi.md#createCouponsForMultipleRecipients) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_with_recipients | Create coupons for multiple recipients |
| [**createInviteEmail**](ManagementApi.md#createInviteEmail) | **POST** /v1/invite_emails | Resend invitation email |
| [**createInviteV2**](ManagementApi.md#createInviteV2) | **POST** /v2/invites | Invite user |
| [**createPasswordRecoveryEmail**](ManagementApi.md#createPasswordRecoveryEmail) | **POST** /v1/password_recovery_emails | Request a password reset |
| [**createSession**](ManagementApi.md#createSession) | **POST** /v1/sessions | Create session |
| [**createStore**](ManagementApi.md#createStore) | **POST** /v1/applications/{applicationId}/stores | Create store |
| [**deactivateUserByEmail**](ManagementApi.md#deactivateUserByEmail) | **POST** /v1/users/deactivate | Disable user by email address |
| [**deductLoyaltyCardPoints**](ManagementApi.md#deductLoyaltyCardPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/deduct_points | Deduct points from card |
| [**deleteAccountCollection**](ManagementApi.md#deleteAccountCollection) | **DELETE** /v1/collections/{collectionId} | Delete account-level collection |
| [**deleteAchievement**](ManagementApi.md#deleteAchievement) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Delete achievement |
| [**deleteCampaign**](ManagementApi.md#deleteCampaign) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId} | Delete campaign |
| [**deleteCampaignStoreBudgets**](ManagementApi.md#deleteCampaignStoreBudgets) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | Delete campaign store budgets |
| [**deleteCollection**](ManagementApi.md#deleteCollection) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Delete campaign-level collection |
| [**deleteCoupon**](ManagementApi.md#deleteCoupon) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Delete coupon |
| [**deleteCoupons**](ManagementApi.md#deleteCoupons) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Delete coupons |
| [**deleteLoyaltyCard**](ManagementApi.md#deleteLoyaltyCard) | **DELETE** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Delete loyalty card |
| [**deleteReferral**](ManagementApi.md#deleteReferral) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Delete referral |
| [**deleteStore**](ManagementApi.md#deleteStore) | **DELETE** /v1/applications/{applicationId}/stores/{storeId} | Delete store |
| [**deleteUser**](ManagementApi.md#deleteUser) | **DELETE** /v1/users/{userId} | Delete user |
| [**deleteUserByEmail**](ManagementApi.md#deleteUserByEmail) | **POST** /v1/users/delete | Delete user by email address |
| [**destroySession**](ManagementApi.md#destroySession) | **DELETE** /v1/sessions | Destroy session |
| [**disconnectCampaignStores**](ManagementApi.md#disconnectCampaignStores) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/stores | Disconnect stores |
| [**exportAccountCollectionItems**](ManagementApi.md#exportAccountCollectionItems) | **GET** /v1/collections/{collectionId}/export | Export account-level collection&#39;s items |
| [**exportAchievements**](ManagementApi.md#exportAchievements) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId}/export | Export achievement customer data |
| [**exportAudiencesMemberships**](ManagementApi.md#exportAudiencesMemberships) | **GET** /v1/audiences/{audienceId}/memberships/export | Export audience members |
| [**exportCampaignStoreBudgets**](ManagementApi.md#exportCampaignStoreBudgets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/export | Export campaign store budgets |
| [**exportCampaignStores**](ManagementApi.md#exportCampaignStores) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/export | Export stores |
| [**exportCollectionItems**](ManagementApi.md#exportCollectionItems) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/export | Export campaign-level collection&#39;s items |
| [**exportCoupons**](ManagementApi.md#exportCoupons) | **GET** /v1/applications/{applicationId}/export_coupons | Export coupons |
| [**exportCustomerSessions**](ManagementApi.md#exportCustomerSessions) | **GET** /v1/applications/{applicationId}/export_customer_sessions | Export customer sessions |
| [**exportCustomersTiers**](ManagementApi.md#exportCustomersTiers) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customers_tiers | Export customers&#39; tier data |
| [**exportEffects**](ManagementApi.md#exportEffects) | **GET** /v1/applications/{applicationId}/export_effects | Export triggered effects |
| [**exportLoyaltyBalance**](ManagementApi.md#exportLoyaltyBalance) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customer_balance | Export customer loyalty balance to CSV |
| [**exportLoyaltyBalances**](ManagementApi.md#exportLoyaltyBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customer_balances | Export customer loyalty balances |
| [**exportLoyaltyCardBalances**](ManagementApi.md#exportLoyaltyCardBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_card_balances | Export all card transaction logs |
| [**exportLoyaltyCardLedger**](ManagementApi.md#exportLoyaltyCardLedger) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/export_log | Export card&#39;s ledger log |
| [**exportLoyaltyCards**](ManagementApi.md#exportLoyaltyCards) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/export | Export loyalty cards |
| [**exportLoyaltyLedger**](ManagementApi.md#exportLoyaltyLedger) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/export_log | Export customer&#39;s transaction logs |
| [**exportPoolGiveaways**](ManagementApi.md#exportPoolGiveaways) | **GET** /v1/giveaways/pools/{poolId}/export | Export giveaway codes of a giveaway pool |
| [**exportReferrals**](ManagementApi.md#exportReferrals) | **GET** /v1/applications/{applicationId}/export_referrals | Export referrals |
| [**getAccessLogsWithoutTotalCount**](ManagementApi.md#getAccessLogsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/access_logs/no_total | Get access logs for Application |
| [**getAccount**](ManagementApi.md#getAccount) | **GET** /v1/accounts/{accountId} | Get account details |
| [**getAccountAnalytics**](ManagementApi.md#getAccountAnalytics) | **GET** /v1/accounts/{accountId}/analytics | Get account analytics |
| [**getAccountCollection**](ManagementApi.md#getAccountCollection) | **GET** /v1/collections/{collectionId} | Get account-level collection |
| [**getAchievement**](ManagementApi.md#getAchievement) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Get achievement |
| [**getAdditionalCost**](ManagementApi.md#getAdditionalCost) | **GET** /v1/additional_costs/{additionalCostId} | Get additional cost |
| [**getAdditionalCosts**](ManagementApi.md#getAdditionalCosts) | **GET** /v1/additional_costs | List additional costs |
| [**getApplication**](ManagementApi.md#getApplication) | **GET** /v1/applications/{applicationId} | Get Application |
| [**getApplicationApiHealth**](ManagementApi.md#getApplicationApiHealth) | **GET** /v1/applications/{applicationId}/health_report | Get Application health |
| [**getApplicationCustomer**](ManagementApi.md#getApplicationCustomer) | **GET** /v1/applications/{applicationId}/customers/{customerId} | Get application&#39;s customer |
| [**getApplicationCustomerFriends**](ManagementApi.md#getApplicationCustomerFriends) | **GET** /v1/applications/{applicationId}/profile/{integrationId}/friends | List friends referred by customer profile |
| [**getApplicationCustomers**](ManagementApi.md#getApplicationCustomers) | **GET** /v1/applications/{applicationId}/customers | List application&#39;s customers |
| [**getApplicationCustomersByAttributes**](ManagementApi.md#getApplicationCustomersByAttributes) | **POST** /v1/applications/{applicationId}/customer_search | List application customers matching the given attributes |
| [**getApplicationEventTypes**](ManagementApi.md#getApplicationEventTypes) | **GET** /v1/applications/{applicationId}/event_types | List Applications event types |
| [**getApplicationEventsWithoutTotalCount**](ManagementApi.md#getApplicationEventsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/events/no_total | List Applications events |
| [**getApplicationSession**](ManagementApi.md#getApplicationSession) | **GET** /v1/applications/{applicationId}/sessions/{sessionId} | Get Application session |
| [**getApplicationSessions**](ManagementApi.md#getApplicationSessions) | **GET** /v1/applications/{applicationId}/sessions | List Application sessions |
| [**getApplications**](ManagementApi.md#getApplications) | **GET** /v1/applications | List Applications |
| [**getAttribute**](ManagementApi.md#getAttribute) | **GET** /v1/attributes/{attributeId} | Get custom attribute |
| [**getAttributes**](ManagementApi.md#getAttributes) | **GET** /v1/attributes | List custom attributes |
| [**getAudienceMemberships**](ManagementApi.md#getAudienceMemberships) | **GET** /v1/audiences/{audienceId}/memberships | List audience members |
| [**getAudiences**](ManagementApi.md#getAudiences) | **GET** /v1/audiences | List audiences |
| [**getAudiencesAnalytics**](ManagementApi.md#getAudiencesAnalytics) | **GET** /v1/audiences/analytics | List audience analytics |
| [**getCampaign**](ManagementApi.md#getCampaign) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId} | Get campaign |
| [**getCampaignAnalytics**](ManagementApi.md#getCampaignAnalytics) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/analytics | Get analytics of campaigns |
| [**getCampaignByAttributes**](ManagementApi.md#getCampaignByAttributes) | **POST** /v1/applications/{applicationId}/campaigns_search | List campaigns that match the given attributes |
| [**getCampaignGroup**](ManagementApi.md#getCampaignGroup) | **GET** /v1/campaign_groups/{campaignGroupId} | Get campaign access group |
| [**getCampaignGroups**](ManagementApi.md#getCampaignGroups) | **GET** /v1/campaign_groups | List campaign access groups |
| [**getCampaignTemplates**](ManagementApi.md#getCampaignTemplates) | **GET** /v1/campaign_templates | List campaign templates |
| [**getCampaigns**](ManagementApi.md#getCampaigns) | **GET** /v1/applications/{applicationId}/campaigns | List campaigns |
| [**getChanges**](ManagementApi.md#getChanges) | **GET** /v1/changes | Get audit logs for an account |
| [**getCollection**](ManagementApi.md#getCollection) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Get campaign-level collection |
| [**getCollectionItems**](ManagementApi.md#getCollectionItems) | **GET** /v1/collections/{collectionId}/items | Get collection items |
| [**getCouponsWithoutTotalCount**](ManagementApi.md#getCouponsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/no_total | List coupons |
| [**getCustomerActivityReport**](ManagementApi.md#getCustomerActivityReport) | **GET** /v1/applications/{applicationId}/customer_activity_reports/{customerId} | Get customer&#39;s activity report |
| [**getCustomerActivityReportsWithoutTotalCount**](ManagementApi.md#getCustomerActivityReportsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/customer_activity_reports/no_total | Get Activity Reports for Application Customers |
| [**getCustomerAnalytics**](ManagementApi.md#getCustomerAnalytics) | **GET** /v1/applications/{applicationId}/customers/{customerId}/analytics | Get customer&#39;s analytics report |
| [**getCustomerProfile**](ManagementApi.md#getCustomerProfile) | **GET** /v1/customers/{customerId} | Get customer profile |
| [**getCustomerProfileAchievementProgress**](ManagementApi.md#getCustomerProfileAchievementProgress) | **GET** /v1/applications/{applicationId}/achievement_progress/{integrationId} | List customer achievements |
| [**getCustomerProfiles**](ManagementApi.md#getCustomerProfiles) | **GET** /v1/customers/no_total | List customer profiles |
| [**getCustomersByAttributes**](ManagementApi.md#getCustomersByAttributes) | **POST** /v1/customer_search/no_total | List customer profiles matching the given attributes |
| [**getDashboardStatistics**](ManagementApi.md#getDashboardStatistics) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/dashboard | Get statistics for loyalty dashboard |
| [**getEventTypes**](ManagementApi.md#getEventTypes) | **GET** /v1/event_types | List event types |
| [**getExports**](ManagementApi.md#getExports) | **GET** /v1/exports | Get exports |
| [**getLoyaltyCard**](ManagementApi.md#getLoyaltyCard) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Get loyalty card |
| [**getLoyaltyCardTransactionLogs**](ManagementApi.md#getLoyaltyCardTransactionLogs) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/logs | List card&#39;s transactions |
| [**getLoyaltyCards**](ManagementApi.md#getLoyaltyCards) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards | List loyalty cards |
| [**getLoyaltyPoints**](ManagementApi.md#getLoyaltyPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId} | Get customer&#39;s full loyalty ledger |
| [**getLoyaltyProgram**](ManagementApi.md#getLoyaltyProgram) | **GET** /v1/loyalty_programs/{loyaltyProgramId} | Get loyalty program |
| [**getLoyaltyProgramTransactions**](ManagementApi.md#getLoyaltyProgramTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/transactions | List loyalty program transactions |
| [**getLoyaltyPrograms**](ManagementApi.md#getLoyaltyPrograms) | **GET** /v1/loyalty_programs | List loyalty programs |
| [**getLoyaltyStatistics**](ManagementApi.md#getLoyaltyStatistics) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/statistics | Get loyalty program statistics |
| [**getMessageLogs**](ManagementApi.md#getMessageLogs) | **GET** /v1/message_logs | List message log entries |
| [**getReferralsWithoutTotalCount**](ManagementApi.md#getReferralsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/no_total | List referrals |
| [**getRoleV2**](ManagementApi.md#getRoleV2) | **GET** /v2/roles/{roleId} | Get role |
| [**getRuleset**](ManagementApi.md#getRuleset) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Get ruleset |
| [**getRulesets**](ManagementApi.md#getRulesets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | List campaign rulesets |
| [**getStore**](ManagementApi.md#getStore) | **GET** /v1/applications/{applicationId}/stores/{storeId} | Get store |
| [**getUser**](ManagementApi.md#getUser) | **GET** /v1/users/{userId} | Get user |
| [**getUsers**](ManagementApi.md#getUsers) | **GET** /v1/users | List users in account |
| [**getWebhook**](ManagementApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get webhook |
| [**getWebhooks**](ManagementApi.md#getWebhooks) | **GET** /v1/webhooks | List webhooks |
| [**importAccountCollection**](ManagementApi.md#importAccountCollection) | **POST** /v1/collections/{collectionId}/import | Import data into existing account-level collection |
| [**importAllowedList**](ManagementApi.md#importAllowedList) | **POST** /v1/attributes/{attributeId}/allowed_list/import | Import allowed values for attribute |
| [**importAudiencesMemberships**](ManagementApi.md#importAudiencesMemberships) | **POST** /v1/audiences/{audienceId}/memberships/import | Import audience members |
| [**importCampaignStoreBudget**](ManagementApi.md#importCampaignStoreBudget) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/import | Import campaign store budgets |
| [**importCampaignStores**](ManagementApi.md#importCampaignStores) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/import | Import stores |
| [**importCollection**](ManagementApi.md#importCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/import | Import data into existing campaign-level collection |
| [**importCoupons**](ManagementApi.md#importCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_coupons | Import coupons |
| [**importLoyaltyCards**](ManagementApi.md#importLoyaltyCards) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_cards | Import loyalty cards |
| [**importLoyaltyCustomersTiers**](ManagementApi.md#importLoyaltyCustomersTiers) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_customers_tiers | Import customers into loyalty tiers |
| [**importLoyaltyPoints**](ManagementApi.md#importLoyaltyPoints) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_points | Import loyalty points |
| [**importPoolGiveaways**](ManagementApi.md#importPoolGiveaways) | **POST** /v1/giveaways/pools/{poolId}/import | Import giveaway codes into a giveaway pool |
| [**importReferrals**](ManagementApi.md#importReferrals) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_referrals | Import referrals |
| [**inviteUserExternal**](ManagementApi.md#inviteUserExternal) | **POST** /v1/users/invite | Invite user from identity provider |
| [**listAccountCollections**](ManagementApi.md#listAccountCollections) | **GET** /v1/collections | List collections in account |
| [**listAchievements**](ManagementApi.md#listAchievements) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements | List achievements |
| [**listAllRolesV2**](ManagementApi.md#listAllRolesV2) | **GET** /v2/roles | List roles |
| [**listCampaignStoreBudgetLimits**](ManagementApi.md#listCampaignStoreBudgetLimits) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | List campaign store budget limits |
| [**listCatalogItems**](ManagementApi.md#listCatalogItems) | **GET** /v1/catalogs/{catalogId}/items | List items in a catalog |
| [**listCollections**](ManagementApi.md#listCollections) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | List collections in campaign |
| [**listCollectionsInApplication**](ManagementApi.md#listCollectionsInApplication) | **GET** /v1/applications/{applicationId}/collections | List collections in Application |
| [**listStores**](ManagementApi.md#listStores) | **GET** /v1/applications/{applicationId}/stores | List stores |
| [**oktaEventHandlerChallenge**](ManagementApi.md#oktaEventHandlerChallenge) | **GET** /v1/provisioning/okta | Validate Okta API ownership |
| [**removeLoyaltyPoints**](ManagementApi.md#removeLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/deduct_points | Deduct points from customer profile |
| [**resetPassword**](ManagementApi.md#resetPassword) | **POST** /v1/reset_password | Reset password |
| [**scimCreateGroup**](ManagementApi.md#scimCreateGroup) | **POST** /v1/provisioning/scim/Groups | Create SCIM group |
| [**scimCreateUser**](ManagementApi.md#scimCreateUser) | **POST** /v1/provisioning/scim/Users | Create SCIM user |
| [**scimDeleteGroup**](ManagementApi.md#scimDeleteGroup) | **DELETE** /v1/provisioning/scim/Groups/{groupId} | Delete SCIM group |
| [**scimDeleteUser**](ManagementApi.md#scimDeleteUser) | **DELETE** /v1/provisioning/scim/Users/{userId} | Delete SCIM user |
| [**scimGetGroup**](ManagementApi.md#scimGetGroup) | **GET** /v1/provisioning/scim/Groups/{groupId} | Get SCIM group |
| [**scimGetGroups**](ManagementApi.md#scimGetGroups) | **GET** /v1/provisioning/scim/Groups | List SCIM groups |
| [**scimGetResourceTypes**](ManagementApi.md#scimGetResourceTypes) | **GET** /v1/provisioning/scim/ResourceTypes | List supported SCIM resource types |
| [**scimGetSchemas**](ManagementApi.md#scimGetSchemas) | **GET** /v1/provisioning/scim/Schemas | List supported SCIM schemas |
| [**scimGetServiceProviderConfig**](ManagementApi.md#scimGetServiceProviderConfig) | **GET** /v1/provisioning/scim/ServiceProviderConfig | Get SCIM service provider configuration |
| [**scimGetUser**](ManagementApi.md#scimGetUser) | **GET** /v1/provisioning/scim/Users/{userId} | Get SCIM user |
| [**scimGetUsers**](ManagementApi.md#scimGetUsers) | **GET** /v1/provisioning/scim/Users | List SCIM users |
| [**scimPatchGroup**](ManagementApi.md#scimPatchGroup) | **PATCH** /v1/provisioning/scim/Groups/{groupId} | Update SCIM group attributes |
| [**scimPatchUser**](ManagementApi.md#scimPatchUser) | **PATCH** /v1/provisioning/scim/Users/{userId} | Update SCIM user attributes |
| [**scimReplaceGroupAttributes**](ManagementApi.md#scimReplaceGroupAttributes) | **PUT** /v1/provisioning/scim/Groups/{groupId} | Update SCIM group |
| [**scimReplaceUserAttributes**](ManagementApi.md#scimReplaceUserAttributes) | **PUT** /v1/provisioning/scim/Users/{userId} | Update SCIM user |
| [**searchCouponsAdvancedApplicationWideWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedApplicationWideWithoutTotalCount) | **POST** /v1/applications/{applicationId}/coupons_search_advanced/no_total | List coupons that match the given attributes (without total count) |
| [**searchCouponsAdvancedWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedWithoutTotalCount) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced/no_total | List coupons that match the given attributes in campaign (without total count) |
| [**summarizeCampaignStoreBudget**](ManagementApi.md#summarizeCampaignStoreBudget) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/summary | Get summary of campaign store budgets |
| [**transferLoyaltyCard**](ManagementApi.md#transferLoyaltyCard) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/transfer | Transfer card data |
| [**updateAccountCollection**](ManagementApi.md#updateAccountCollection) | **PUT** /v1/collections/{collectionId} | Update account-level collection |
| [**updateAchievement**](ManagementApi.md#updateAchievement) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Update achievement |
| [**updateAdditionalCost**](ManagementApi.md#updateAdditionalCost) | **PUT** /v1/additional_costs/{additionalCostId} | Update additional cost |
| [**updateAttribute**](ManagementApi.md#updateAttribute) | **PUT** /v1/attributes/{attributeId} | Update custom attribute |
| [**updateCampaign**](ManagementApi.md#updateCampaign) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId} | Update campaign |
| [**updateCollection**](ManagementApi.md#updateCollection) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Update campaign-level collection&#39;s description |
| [**updateCoupon**](ManagementApi.md#updateCoupon) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Update coupon |
| [**updateCouponBatch**](ManagementApi.md#updateCouponBatch) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Update coupons |
| [**updateLoyaltyCard**](ManagementApi.md#updateLoyaltyCard) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Update loyalty card status |
| [**updateReferral**](ManagementApi.md#updateReferral) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Update referral |
| [**updateRoleV2**](ManagementApi.md#updateRoleV2) | **PUT** /v2/roles/{roleId} | Update role |
| [**updateStore**](ManagementApi.md#updateStore) | **PUT** /v1/applications/{applicationId}/stores/{storeId} | Update store |
| [**updateUser**](ManagementApi.md#updateUser) | **PUT** /v1/users/{userId} | Update user |


<a id="activateUserByEmail"></a>
# **activateUserByEmail**
> activateUserByEmail(activateUserRequest)

Enable user by email address

Enable a [disabled user](https://docs.talon.one/docs/product/account/account-settings/managing-users#disabling-a-user) by their email address. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ActivateUserRequest activateUserRequest = new ActivateUserRequest(); // ActivateUserRequest | body
    try {
      apiInstance.activateUserByEmail(activateUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#activateUserByEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="addLoyaltyCardPoints"></a>
# **addLoyaltyCardPoints**
> addLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, addLoyaltyPoints)

Add points to card

Add points to the given loyalty card in the specified card-based loyalty program. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    AddLoyaltyPoints addLoyaltyPoints = new AddLoyaltyPoints(); // AddLoyaltyPoints | body
    try {
      apiInstance.addLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, addLoyaltyPoints);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#addLoyaltyCardPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **addLoyaltyPoints** | [**AddLoyaltyPoints**](AddLoyaltyPoints.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="addLoyaltyPoints"></a>
# **addLoyaltyPoints**
> addLoyaltyPoints(loyaltyProgramId, integrationId, addLoyaltyPoints)

Add points to customer profile

Add points in the specified loyalty program for the given customer.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
    AddLoyaltyPoints addLoyaltyPoints = new AddLoyaltyPoints(); // AddLoyaltyPoints | body
    try {
      apiInstance.addLoyaltyPoints(loyaltyProgramId, integrationId, addLoyaltyPoints);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#addLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  | |
| **addLoyaltyPoints** | [**AddLoyaltyPoints**](AddLoyaltyPoints.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="copyCampaignToApplications"></a>
# **copyCampaignToApplications**
> GetCampaigns200Response copyCampaignToApplications(applicationId, campaignId, campaignCopy)

Copy the campaign into the specified Application

Copy the campaign into all specified Applications.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    CampaignCopy campaignCopy = new CampaignCopy(); // CampaignCopy | body
    try {
      GetCampaigns200Response result = apiInstance.copyCampaignToApplications(applicationId, campaignId, campaignCopy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#copyCampaignToApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **campaignCopy** | [**CampaignCopy**](CampaignCopy.md)| body | |

### Return type

[**GetCampaigns200Response**](GetCampaigns200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAccountCollection"></a>
# **createAccountCollection**
> Collection createAccountCollection(newCollection)

Create account-level collection

Create an account-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewCollection newCollection = new NewCollection(); // NewCollection | body
    try {
      Collection result = apiInstance.createAccountCollection(newCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newCollection** | [**NewCollection**](NewCollection.md)| body | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **409** | Conflict. A collection with this name already exists. |  -  |

<a id="createAchievement"></a>
# **createAchievement**
> Achievement createAchievement(applicationId, campaignId, createAchievement)

Create achievement

Create a new achievement in a specific campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    CreateAchievement createAchievement = new CreateAchievement(); // CreateAchievement | body
    try {
      Achievement result = apiInstance.createAchievement(applicationId, campaignId, createAchievement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAchievement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **createAchievement** | [**CreateAchievement**](CreateAchievement.md)| body | |

### Return type

[**Achievement**](Achievement.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **409** | Conflict. An achievement with this name or title already exists. |  -  |

<a id="createAdditionalCost"></a>
# **createAdditionalCost**
> AccountAdditionalCost createAdditionalCost(newAdditionalCost)

Create additional cost

Create an [additional cost](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs).  These additional costs are shared across all applications in your account, and are never required. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewAdditionalCost newAdditionalCost = new NewAdditionalCost(); // NewAdditionalCost | body
    try {
      AccountAdditionalCost result = apiInstance.createAdditionalCost(newAdditionalCost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newAdditionalCost** | [**NewAdditionalCost**](NewAdditionalCost.md)| body | |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createAttribute"></a>
# **createAttribute**
> Attribute createAttribute(newAttribute)

Create custom attribute

Create a _custom attribute_ in this account. [Custom attributes](https://docs.talon.one/docs/dev/concepts/attributes) allow you to add data to Talon.One domain entities like campaigns, coupons, customers and so on.  These attributes can then be given values when creating/updating these entities, and these values can be used in your campaign rules.  For example, you could define a &#x60;zipCode&#x60; field for customer sessions, and add a rule to your campaign that only allows certain ZIP codes.  These attributes are shared across all Applications in your account and are never required. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewAttribute newAttribute = new NewAttribute(); // NewAttribute | body
    try {
      Attribute result = apiInstance.createAttribute(newAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newAttribute** | [**NewAttribute**](NewAttribute.md)| body | |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createBatchLoyaltyCards"></a>
# **createBatchLoyaltyCards**
> LoyaltyCardBatchResponse createBatchLoyaltyCards(loyaltyProgramId, loyaltyCardBatch)

Create loyalty cards

Create a batch of loyalty cards in a specified [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types).  Customers can use loyalty cards to collect and spend loyalty points.  **Important:**  - The specified card-based loyalty program must have a defined card code format that is used to generate the loyalty card codes. - Trying to create more than 20,000 loyalty cards in a single request returns an error message with a &#x60;400&#x60; status code. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    LoyaltyCardBatch loyaltyCardBatch = new LoyaltyCardBatch(); // LoyaltyCardBatch | body
    try {
      LoyaltyCardBatchResponse result = apiInstance.createBatchLoyaltyCards(loyaltyProgramId, loyaltyCardBatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createBatchLoyaltyCards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardBatch** | [**LoyaltyCardBatch**](LoyaltyCardBatch.md)| body | |

### Return type

[**LoyaltyCardBatchResponse**](LoyaltyCardBatchResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="createCampaignFromTemplate"></a>
# **createCampaignFromTemplate**
> CreateTemplateCampaignResponse createCampaignFromTemplate(applicationId, createTemplateCampaign)

Create campaign from campaign template

Use the campaign template referenced in the request body to create a new campaign in one of the connected Applications.  If the template was created from a campaign with rules referencing [campaign collections](https://docs.talon.one/docs/product/campaigns/managing-collections), the corresponding collections for the new campaign are created automatically. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CreateTemplateCampaign createTemplateCampaign = new CreateTemplateCampaign(); // CreateTemplateCampaign | body
    try {
      CreateTemplateCampaignResponse result = apiInstance.createCampaignFromTemplate(applicationId, createTemplateCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCampaignFromTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **createTemplateCampaign** | [**CreateTemplateCampaign**](CreateTemplateCampaign.md)| body | |

### Return type

[**CreateTemplateCampaignResponse**](CreateTemplateCampaignResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCampaignStoreBudget"></a>
# **createCampaignStoreBudget**
> createCampaignStoreBudget(applicationId, campaignId, newCampaignStoreBudget)

Create campaign store budget

Create a new store budget for a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCampaignStoreBudget newCampaignStoreBudget = new NewCampaignStoreBudget(); // NewCampaignStoreBudget | body
    try {
      apiInstance.createCampaignStoreBudget(applicationId, campaignId, newCampaignStoreBudget);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCampaignStoreBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCampaignStoreBudget** | [**NewCampaignStoreBudget**](NewCampaignStoreBudget.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **409** | Conflict |  -  |

<a id="createCollection"></a>
# **createCollection**
> Collection createCollection(applicationId, campaignId, newCampaignCollection)

Create campaign-level collection

Create a campaign-level collection in a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCampaignCollection newCampaignCollection = new NewCampaignCollection(); // NewCampaignCollection | body
    try {
      Collection result = apiInstance.createCollection(applicationId, campaignId, newCampaignCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCampaignCollection** | [**NewCampaignCollection**](NewCampaignCollection.md)| body | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCoupons"></a>
# **createCoupons**
> CreateCoupons200Response createCoupons(applicationId, campaignId, newCoupons, silent)

Create coupons

Create coupons according to some pattern. Up to 20.000 coupons can be created without a unique prefix. When a unique prefix is provided, up to 200.000 coupons can be created.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCoupons newCoupons = new NewCoupons(); // NewCoupons | body
    String silent = "yes"; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
    try {
      CreateCoupons200Response result = apiInstance.createCoupons(applicationId, campaignId, newCoupons, silent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCoupons** | [**NewCoupons**](NewCoupons.md)| body | |
| **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to yes] |

### Return type

[**CreateCoupons200Response**](CreateCoupons200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a id="createCouponsAsync"></a>
# **createCouponsAsync**
> AsyncCouponCreationResponse createCouponsAsync(applicationId, campaignId, newCouponCreationJob)

Create coupons asynchronously

Create up to 5,000,000 coupons asynchronously. You should typically use this enpdoint when you create at least 20,001 coupons. You receive an email when the creation is complete.  If you want to create less than 20,001 coupons, you can use the [Create coupons](https://docs.talon.one/management-api#tag/Coupons/operation/createCoupons) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCouponCreationJob newCouponCreationJob = new NewCouponCreationJob(); // NewCouponCreationJob | body
    try {
      AsyncCouponCreationResponse result = apiInstance.createCouponsAsync(applicationId, campaignId, newCouponCreationJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCouponsAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCouponCreationJob** | [**NewCouponCreationJob**](NewCouponCreationJob.md)| body | |

### Return type

[**AsyncCouponCreationResponse**](AsyncCouponCreationResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createCouponsDeletionJob"></a>
# **createCouponsDeletionJob**
> AsyncCouponDeletionJobResponse createCouponsDeletionJob(applicationId, campaignId, newCouponDeletionJob)

Creates a coupon deletion job

This endpoint handles creating a job to delete coupons asynchronously. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCouponDeletionJob newCouponDeletionJob = new NewCouponDeletionJob(); // NewCouponDeletionJob | body
    try {
      AsyncCouponDeletionJobResponse result = apiInstance.createCouponsDeletionJob(applicationId, campaignId, newCouponDeletionJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCouponsDeletionJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCouponDeletionJob** | [**NewCouponDeletionJob**](NewCouponDeletionJob.md)| body | |

### Return type

[**AsyncCouponDeletionJobResponse**](AsyncCouponDeletionJobResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The deletion request has been accepted and will be processed asynchronously |  -  |

<a id="createCouponsForMultipleRecipients"></a>
# **createCouponsForMultipleRecipients**
> CreateCoupons200Response createCouponsForMultipleRecipients(applicationId, campaignId, newCouponsForMultipleRecipients, silent)

Create coupons for multiple recipients

Create coupons according to some pattern for up to 1000 recipients.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCouponsForMultipleRecipients newCouponsForMultipleRecipients = new NewCouponsForMultipleRecipients(); // NewCouponsForMultipleRecipients | body
    String silent = "yes"; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
    try {
      CreateCoupons200Response result = apiInstance.createCouponsForMultipleRecipients(applicationId, campaignId, newCouponsForMultipleRecipients, silent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCouponsForMultipleRecipients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **newCouponsForMultipleRecipients** | [**NewCouponsForMultipleRecipients**](NewCouponsForMultipleRecipients.md)| body | |
| **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to yes] |

### Return type

[**CreateCoupons200Response**](CreateCoupons200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a id="createInviteEmail"></a>
# **createInviteEmail**
> NewInviteEmail createInviteEmail(newInviteEmail)

Resend invitation email

Resend an email invitation to an existing user.  **Note:** The invitation token is valid for 24 hours after the email has been sent. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewInviteEmail newInviteEmail = new NewInviteEmail(); // NewInviteEmail | body
    try {
      NewInviteEmail result = apiInstance.createInviteEmail(newInviteEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createInviteEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newInviteEmail** | [**NewInviteEmail**](NewInviteEmail.md)| body | |

### Return type

[**NewInviteEmail**](NewInviteEmail.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createInviteV2"></a>
# **createInviteV2**
> User createInviteV2(newInvitation)

Invite user

Create a new user in the account and send an invitation to their email address.  **Note**: The invitation token is valid for 24 hours after the email has been sent. You can resend an invitation to a user with the [Resend invitation email](https://docs.talon.one/management-api#tag/Accounts-and-users/operation/createInviteEmail) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewInvitation newInvitation = new NewInvitation(); // NewInvitation | body
    try {
      User result = apiInstance.createInviteV2(newInvitation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createInviteV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newInvitation** | [**NewInvitation**](NewInvitation.md)| body | |

### Return type

[**User**](User.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createPasswordRecoveryEmail"></a>
# **createPasswordRecoveryEmail**
> NewPasswordEmail createPasswordRecoveryEmail(newPasswordEmail)

Request a password reset

Send an email with a password recovery link to the email address of an existing account.  **Note:** The password recovery link expires 30 minutes after this endpoint is triggered. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewPasswordEmail newPasswordEmail = new NewPasswordEmail(); // NewPasswordEmail | body
    try {
      NewPasswordEmail result = apiInstance.createPasswordRecoveryEmail(newPasswordEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createPasswordRecoveryEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newPasswordEmail** | [**NewPasswordEmail**](NewPasswordEmail.md)| body | |

### Return type

[**NewPasswordEmail**](NewPasswordEmail.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Created |  -  |

<a id="createSession"></a>
# **createSession**
> Session createSession(loginParams)

Create session

Create a session to use the Management API endpoints. Use the value of the &#x60;token&#x60; property provided in the response as bearer token in other API calls.  A token is valid for 3 months. In accordance with best pratices, use your generated token for all your API requests. Do **not** regenerate a token for each request.  This endpoint has a rate limit of 3 to 6 requests per second per account, depending on your setup.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Granular API key&lt;/p&gt;   Instead of using a session, you can also use the &lt;a href&#x3D;\&quot;https://docs.talon.one/docs/product/account/dev-tools/managing-mapi-keys\&quot;&gt;Management API key feature&lt;/a&gt;   in the Campaign Manager to decide which endpoints can be used with a given key. &lt;/div&gt; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    LoginParams loginParams = new LoginParams(); // LoginParams | body
    try {
      Session result = apiInstance.createSession(loginParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginParams** | [**LoginParams**](LoginParams.md)| body | |

### Return type

[**Session**](Session.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createStore"></a>
# **createStore**
> Store createStore(applicationId, newStore)

Create store

Create a new store in a specific Application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    NewStore newStore = new NewStore(); // NewStore | body
    try {
      Store result = apiInstance.createStore(applicationId, newStore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **newStore** | [**NewStore**](NewStore.md)| body | |

### Return type

[**Store**](Store.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **409** | Conflict. A store with this integration ID already exists for this application. |  -  |

<a id="deactivateUserByEmail"></a>
# **deactivateUserByEmail**
> deactivateUserByEmail(deactivateUserRequest)

Disable user by email address

[Disable a specific user](https://docs.talon.one/docs/product/account/account-settings/managing-users#disabling-a-user) by their email address. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    DeactivateUserRequest deactivateUserRequest = new DeactivateUserRequest(); // DeactivateUserRequest | body
    try {
      apiInstance.deactivateUserByEmail(deactivateUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deactivateUserByEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deactivateUserRequest** | [**DeactivateUserRequest**](DeactivateUserRequest.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deductLoyaltyCardPoints"></a>
# **deductLoyaltyCardPoints**
> deductLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, deductLoyaltyPoints)

Deduct points from card

Deduct points from the given loyalty card in the specified card-based loyalty program. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    DeductLoyaltyPoints deductLoyaltyPoints = new DeductLoyaltyPoints(); // DeductLoyaltyPoints | body
    try {
      apiInstance.deductLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, deductLoyaltyPoints);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deductLoyaltyCardPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **deductLoyaltyPoints** | [**DeductLoyaltyPoints**](DeductLoyaltyPoints.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="deleteAccountCollection"></a>
# **deleteAccountCollection**
> deleteAccountCollection(collectionId)

Delete account-level collection

Delete a given account-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    try {
      apiInstance.deleteAccountCollection(collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not found |  -  |

<a id="deleteAchievement"></a>
# **deleteAchievement**
> deleteAchievement(applicationId, campaignId, achievementId)

Delete achievement

Delete the specified achievement.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long achievementId = 56L; // Long | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint.
    try {
      apiInstance.deleteAchievement(applicationId, campaignId, achievementId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteAchievement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **achievementId** | **Long**| The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(applicationId, campaignId)

Delete campaign

Delete the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      apiInstance.deleteCampaign(applicationId, campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteCampaignStoreBudgets"></a>
# **deleteCampaignStoreBudgets**
> deleteCampaignStoreBudgets(applicationId, campaignId, action, period)

Delete campaign store budgets

Delete the store budgets for a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String action = "setDiscount"; // String | The action that this budget is limiting.
    String period = "overall"; // String | The period to which the limit applies.  **Note**: For budgets with no period, set this to `overall`. 
    try {
      apiInstance.deleteCampaignStoreBudgets(applicationId, campaignId, action, period);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCampaignStoreBudgets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **action** | **String**| The action that this budget is limiting. | [optional] [enum: setDiscount] |
| **period** | **String**| The period to which the limit applies.  **Note**: For budgets with no period, set this to &#x60;overall&#x60;.  | [optional] [enum: overall, daily, weekly, monthly, yearly] |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted |  -  |
| **400** | Bad request |  -  |

<a id="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(applicationId, campaignId, collectionId)

Delete campaign-level collection

Delete a given campaign-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint.
    try {
      apiInstance.deleteCollection(applicationId, campaignId, collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(applicationId, campaignId, couponId)

Delete coupon

Delete the specified coupon.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String couponId = "couponId_example"; // String | The internal ID of the coupon code. You can find this value in the `id` property from the [List coupons](https://docs.talon.one/management-api#tag/Coupons/operation/getCouponsWithoutTotalCount) endpoint response. 
    try {
      apiInstance.deleteCoupon(applicationId, campaignId, couponId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **couponId** | **String**| The internal ID of the coupon code. You can find this value in the &#x60;id&#x60; property from the [List coupons](https://docs.talon.one/management-api#tag/Coupons/operation/getCouponsWithoutTotalCount) endpoint response.  | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteCoupons"></a>
# **deleteCoupons**
> deleteCoupons(applicationId, campaignId, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch)

Delete coupons

Deletes all the coupons matching the specified criteria.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime startsAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime startsBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime expiresAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime expiresBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | - `expired`: Matches coupons in which the expiration date is set and in the past. - `validNow`: Matches coupons in which start date is null or in the past and expiration date is null or in the future. - `validFuture`: Matches coupons in which start date is set and in the future. 
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    String usable = "true"; // String | - `true`: only coupons where `usageCounter < usageLimit` will be returned. - `false`: only coupons where `usageCounter >= usageLimit` will be returned. 
    Long referralId = 56L; // Long | Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile ID specified in the coupon's `RecipientIntegrationId` field. 
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    try {
      apiInstance.deleteCoupons(applicationId, campaignId, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **startsAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **startsBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **expiresAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **expiresBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| - &#x60;expired&#x60;: Matches coupons in which the expiration date is set and in the past. - &#x60;validNow&#x60;: Matches coupons in which start date is null or in the past and expiration date is null or in the future. - &#x60;validFuture&#x60;: Matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **batchId** | **String**| Filter results by batches of coupons | [optional] |
| **usable** | **String**| - &#x60;true&#x60;: only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned. - &#x60;false&#x60;: only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60; will be returned.  | [optional] [enum: true, false] |
| **referralId** | **Long**| Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code. | [optional] |
| **recipientIntegrationId** | **String**| Filter results by match with a profile ID specified in the coupon&#39;s &#x60;RecipientIntegrationId&#x60; field.  | [optional] |
| **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteLoyaltyCard"></a>
# **deleteLoyaltyCard**
> deleteLoyaltyCard(loyaltyProgramId, loyaltyCardId)

Delete loyalty card

Delete the given loyalty card.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    try {
      apiInstance.deleteLoyaltyCard(loyaltyProgramId, loyaltyCardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteLoyaltyCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="deleteReferral"></a>
# **deleteReferral**
> deleteReferral(applicationId, campaignId, referralId)

Delete referral

Delete the specified referral.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String referralId = "referralId_example"; // String | The ID of the referral code.
    try {
      apiInstance.deleteReferral(applicationId, campaignId, referralId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteReferral");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **referralId** | **String**| The ID of the referral code. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteStore"></a>
# **deleteStore**
> deleteStore(applicationId, storeId)

Delete store

Delete the specified store.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String storeId = "storeId_example"; // String | The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint. 
    try {
      apiInstance.deleteStore(applicationId, storeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **storeId** | **String**| The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint.  | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not found |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Delete user

Delete a specific user.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    try {
      apiInstance.deleteUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteUserByEmail"></a>
# **deleteUserByEmail**
> deleteUserByEmail(deleteUserRequest)

Delete user by email address

[Delete a specific user](https://docs.talon.one/docs/product/account/account-settings/managing-users#deleting-a-user) by their email address. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    DeleteUserRequest deleteUserRequest = new DeleteUserRequest(); // DeleteUserRequest | body
    try {
      apiInstance.deleteUserByEmail(deleteUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteUserByEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteUserRequest** | [**DeleteUserRequest**](DeleteUserRequest.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="destroySession"></a>
# **destroySession**
> destroySession()

Destroy session

Destroys the session.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      apiInstance.destroySession();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#destroySession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="disconnectCampaignStores"></a>
# **disconnectCampaignStores**
> disconnectCampaignStores(applicationId, campaignId)

Disconnect stores

Disconnect the stores linked to a specific campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      apiInstance.disconnectCampaignStores(applicationId, campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#disconnectCampaignStores");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="exportAccountCollectionItems"></a>
# **exportAccountCollectionItems**
> String exportAccountCollectionItems(collectionId)

Export account-level collection&#39;s items

Download a CSV file containing items from a given account-level collection.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    try {
      String result = apiInstance.exportAccountCollectionItems(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportAccountCollectionItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="exportAchievements"></a>
# **exportAchievements**
> String exportAchievements(applicationId, campaignId, achievementId)

Export achievement customer data

Download a CSV file containing a list of all the customers who have participated in and are currently participating in the given achievement.  The CSV file contains the following columns: - &#x60;profileIntegrationID&#x60;: The integration ID of the customer profile participating in the achievement. - &#x60;title&#x60;: The display name of the achievement in the Campaign Manager. - &#x60;target&#x60;: The required number of actions or the transactional milestone to complete the achievement. - &#x60;progress&#x60;: The current progress of the customer in the achievement. - &#x60;status&#x60;: The status of the achievement. Can be one of: [&#39;inprogress&#39;, &#39;completed&#39;, &#39;expired&#39;]. - &#x60;startDate&#x60;: The date on which the customer profile started the achievement in RFC3339. - &#x60;endDate&#x60;: The date on which the achievement ends and resets for the customer profile in RFC3339. - &#x60;completionDate&#x60;: The date on which the customer profile completed the achievement in RFC3339. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long achievementId = 56L; // Long | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint.
    try {
      String result = apiInstance.exportAchievements(applicationId, campaignId, achievementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportAchievements");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **achievementId** | **Long**| The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint. | |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="exportAudiencesMemberships"></a>
# **exportAudiencesMemberships**
> String exportAudiencesMemberships(audienceId)

Export audience members

Download a CSV file containing the integration IDs of the members of an audience.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The file contains the following column: - &#x60;profileintegrationid&#x60;: The integration ID of the customer profile. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long audienceId = 56L; // Long | The ID of the audience.
    try {
      String result = apiInstance.exportAudiencesMemberships(audienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportAudiencesMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceId** | **Long**| The ID of the audience. | |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="exportCampaignStoreBudgets"></a>
# **exportCampaignStoreBudgets**
> String exportCampaignStoreBudgets(applicationId, campaignId, action, period)

Export campaign store budgets

Download a CSV file containing the store budgets for a given campaign.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following columns:  - &#x60;store_integration_id&#x60;: The identifier of the store. - &#x60;limit&#x60;: The budget limit for the store. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String action = "setDiscount"; // String | The action that this budget is limiting.
    String period = "overall"; // String | The period to which the limit applies.  **Note**: For budgets with no period, set this to `overall`. 
    try {
      String result = apiInstance.exportCampaignStoreBudgets(applicationId, campaignId, action, period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCampaignStoreBudgets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **action** | **String**| The action that this budget is limiting. | [optional] [enum: setDiscount] |
| **period** | **String**| The period to which the limit applies.  **Note**: For budgets with no period, set this to &#x60;overall&#x60;.  | [optional] [enum: overall, daily, weekly, monthly, yearly] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="exportCampaignStores"></a>
# **exportCampaignStores**
> String exportCampaignStores(applicationId, campaignId)

Export stores

Download a CSV file containing the stores linked to a specific campaign.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following column:  - &#x60;store_integration_id&#x60;: The identifier of the store. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      String result = apiInstance.exportCampaignStores(applicationId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCampaignStores");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="exportCollectionItems"></a>
# **exportCollectionItems**
> String exportCollectionItems(applicationId, campaignId, collectionId)

Export campaign-level collection&#39;s items

Download a CSV file containing items from a given campaign-level collection.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint.
    try {
      String result = apiInstance.exportCollectionItems(applicationId, campaignId, collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCollectionItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint. | |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="exportCoupons"></a>
# **exportCoupons**
> String exportCoupons(applicationId, campaignId, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, dateFormat, campaignState, valuesOnly)

Export coupons

Download a CSV file containing the coupons that match the given properties.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file can contain the following columns:  - &#x60;accountid&#x60;: The ID of your deployment. - &#x60;applicationid&#x60;: The ID of the Application this coupon is related to. - &#x60;attributes&#x60;: A json object describing _custom_ referral attribute names and their values. - &#x60;batchid&#x60;: The ID of the batch this coupon is part of. - &#x60;campaignid&#x60;: The ID of the campaign this coupon is related to. - &#x60;counter&#x60;: The number of times this coupon has been redeemed. - &#x60;created&#x60;: The creation date in RFC3339 of the coupon code. - &#x60;deleted&#x60;: Whether the coupon code is deleted. - &#x60;deleted_changelogid&#x60;: The ID of the delete event in the logs. - &#x60;discount_counter&#x60;: The amount of discount given by this coupon. - &#x60;discount_limitval&#x60;: The maximum discount amount that can be given be this coupon. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;id&#x60;: The internal ID of the coupon code. - &#x60;importid&#x60;: The ID of the import job that created this coupon. - &#x60;is_reservation_mandatory&#x60;: Whether this coupon requires a reservation to be redeemed. - &#x60;limits&#x60;: The limits set on this coupon. - &#x60;limitval&#x60;: The maximum number of redemptions of this code. - &#x60;recipientintegrationid&#x60;: The integration ID of the recipient of the coupon.   Only the customer with this integration ID can redeem this code. Available only for personal codes. - &#x60;referralid&#x60;: The ID of the referral code that triggered the creation of this coupon (create coupon effect). - &#x60;reservation&#x60;: Whether the coupon can be reserved for multiple customers. - &#x60;reservation_counter&#x60;: How many times this coupon has been reserved. - &#x60;reservation_limitval&#x60;: The maximum of number of reservations this coupon can have. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;value&#x60;: The coupon code. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(78); // BigDecimal | Filter results by campaign ID.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "true"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Long referralId = 56L; // Long | Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field.
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code.
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    String campaignState = "enabled"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. 
    Boolean valuesOnly = false; // Boolean | Filter results to only return the coupon codes (`value` column) without the associated coupon data.
    try {
      String result = apiInstance.exportCoupons(applicationId, campaignId, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, dateFormat, campaignState, valuesOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **BigDecimal**| Filter results by campaign ID. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false] |
| **referralId** | **Long**| Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code. | [optional] |
| **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field. | [optional] |
| **batchId** | **String**| Filter results by batches of coupons | [optional] |
| **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code. | [optional] [default to false] |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |
| **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived.  | [optional] [enum: enabled, disabled, archived, scheduled, running, expired, staged] |
| **valuesOnly** | **Boolean**| Filter results to only return the coupon codes (&#x60;value&#x60; column) without the associated coupon data. | [optional] [default to false] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportCustomerSessions"></a>
# **exportCustomerSessions**
> String exportCustomerSessions(applicationId, createdBefore, createdAfter, profileIntegrationId, dateFormat, customerSessionState)

Export customer sessions

Download a CSV file containing the customer sessions that match the request.  **Important:** Archived sessions cannot be exported. See the [retention policy](https://docs.talon.one/docs/dev/server-infrastructure-and-data-retention).  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  - &#x60;id&#x60;: The internal ID of the session. - &#x60;firstsession&#x60;: Whether this is a first session. - &#x60;integrationid&#x60;: The integration ID of the session. - &#x60;applicationid&#x60;: The ID of the Application. - &#x60;profileid&#x60;: The internal ID of the customer profile. - &#x60;profileintegrationid&#x60;: The integration ID of the customer profile. - &#x60;created&#x60;: The timestamp when the session was created. - &#x60;state&#x60;: The [state](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#customer-session-states) of the session. - &#x60;cartitems&#x60;: The cart items in the session. - &#x60;discounts&#x60;: The discounts in the session. - &#x60;total&#x60;: The total value of cart items and additional costs in the session, before any discounts are applied. - &#x60;attributes&#x60;: The attributes set in the session. - &#x60;closedat&#x60;: Timestamp when the session was closed. - &#x60;cancelledat&#x60;: Timestamp when the session was cancelled. - &#x60;referral&#x60;: The referral code in the session. - &#x60;identifiers&#x60;: The identifiers in the session. - &#x60;additional_costs&#x60;: The [additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs) in the session. - &#x60;updated&#x60;: Timestamp of the last session update. - &#x60;store_integration_id&#x60;: The integration ID of the store. - &#x60;coupons&#x60;: Coupon codes in the session. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string.
    String profileIntegrationId = "profileIntegrationId_example"; // String | Only return sessions for the customer that matches this customer integration ID.
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    String customerSessionState = "open"; // String | Filter results by state.
    try {
      String result = apiInstance.exportCustomerSessions(applicationId, createdBefore, createdAfter, profileIntegrationId, dateFormat, customerSessionState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCustomerSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. | [optional] |
| **profileIntegrationId** | **String**| Only return sessions for the customer that matches this customer integration ID. | [optional] |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |
| **customerSessionState** | **String**| Filter results by state. | [optional] [enum: open, closed, partially_returned, cancelled] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportCustomersTiers"></a>
# **exportCustomersTiers**
> String exportCustomersTiers(loyaltyProgramId, subledgerIds, tierNames)

Export customers&#39; tier data

Download a CSV file containing the tier information for customers of the specified loyalty program.  The generated file contains the following columns:  - &#x60;programid&#x60;: The identifier of the loyalty program. It is displayed in your Talon.One deployment URL. - &#x60;subledgerid&#x60;: The ID of the subledger associated with the loyalty program. This column is empty if the loyalty program has no subledger. In this case, refer to the export file name to get the ID of the loyalty program. - &#x60;customerprofileid&#x60;: The ID used to integrate customer profiles with the loyalty program. - &#x60;tiername&#x60;: The name of the tier. - &#x60;startdate&#x60;: The tier start date in RFC3339. - &#x60;expirydate&#x60;: The tier expiry date in RFC3339.  You can filter the results by providing the following optional input parameters:  - &#x60;subledgerIds&#x60; (optional): Filter results by an array of subledger IDs. If no value is provided, all subledger data for the specified loyalty program will be exported. - &#x60;tierNames&#x60; (optional): Filter results by an array of tier names. If no value is provided, all tier data for the specified loyalty program will be exported. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    List<String> subledgerIds = Arrays.asList(); // List<String> | An array of subledgers IDs to filter the export by.
    List<String> tierNames = Arrays.asList(); // List<String> | An array of tier names to filter the export by.
    try {
      String result = apiInstance.exportCustomersTiers(loyaltyProgramId, subledgerIds, tierNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCustomersTiers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **subledgerIds** | [**List&lt;String&gt;**](String.md)| An array of subledgers IDs to filter the export by. | [optional] |
| **tierNames** | [**List&lt;String&gt;**](String.md)| An array of tier names to filter the export by. | [optional] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportEffects"></a>
# **exportEffects**
> String exportEffects(applicationId, campaignId, createdBefore, createdAfter, dateFormat)

Export triggered effects

Download a CSV file containing the triggered effects that match the given attributes.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The generated file can contain the following columns:  - &#x60;applicationid&#x60;: The ID of the Application. - &#x60;campaignid&#x60;: The ID of the campaign. - &#x60;couponid&#x60;: The ID of the coupon, when applicable to the effect. - &#x60;created&#x60;: The timestamp of the effect. - &#x60;event_type&#x60;: The name of the event. See the [docs](https://docs.talon.one/docs/dev/concepts/entities/events). - &#x60;eventid&#x60;: The internal ID of the effect. - &#x60;name&#x60;: The effect name. See the [docs](https://docs.talon.one/docs/dev/integration-api/api-effects). - &#x60;profileintegrationid&#x60;: The ID of the customer profile, when applicable. - &#x60;props&#x60;: The [properties](https://docs.talon.one/docs/dev/integration-api/api-effects) of the effect. - &#x60;ruleindex&#x60;: The index of the rule. - &#x60;rulesetid&#x60;: The ID of the rule set. - &#x60;sessionid&#x60;: The internal ID of the session that triggered the effect. - &#x60;profileid&#x60;: The internal ID of the customer profile. - &#x60;sessionintegrationid&#x60;: The integration ID of the session. - &#x60;total_revenue&#x60;: The total revenue. - &#x60;store_integration_id&#x60;: The integration ID of the store. You choose this ID when you create a store. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(78); // BigDecimal | Filter results by campaign ID.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. You can use any time zone setting. Talon.One will convert to UTC internally.
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportEffects(applicationId, campaignId, createdBefore, createdAfter, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportEffects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **BigDecimal**| Filter results by campaign ID. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportLoyaltyBalance"></a>
# **exportLoyaltyBalance**
> String exportLoyaltyBalance(loyaltyProgramId, endDate)

Export customer loyalty balance to CSV

⚠️ Deprecation notice: Support for requests to this endpoint will end soon. To export customer loyalty balances to CSV, use the [Export customer loyalty balances to CSV](/management-api#tag/Loyalty/operation/exportLoyaltyBalances) endpoint.  Download a CSV file containing the balance of each customer in the loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    try {
      String result = apiInstance.exportLoyaltyBalance(loyaltyProgramId, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="exportLoyaltyBalances"></a>
# **exportLoyaltyBalances**
> String exportLoyaltyBalances(loyaltyProgramId, endDate)

Export customer loyalty balances

Download a CSV file containing the balance of each customer in the loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The generated file can contain the following columns:  - &#x60;loyaltyProgramID&#x60;: The ID of the loyalty program. - &#x60;loyaltySubledger&#x60;: The name of the subdleger, when applicatble. - &#x60;profileIntegrationID&#x60;: The integration ID of the customer profile. - &#x60;currentBalance&#x60;: The current point balance. - &#x60;pendingBalance&#x60;: The number of pending points. - &#x60;expiredBalance&#x60;: The number of expired points. - &#x60;spentBalance&#x60;: The number of spent points. - &#x60;currentTier&#x60;: The tier that the customer is in at the time of the export. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    try {
      String result = apiInstance.exportLoyaltyBalances(loyaltyProgramId, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyBalances");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="exportLoyaltyCardBalances"></a>
# **exportLoyaltyCardBalances**
> String exportLoyaltyCardBalances(loyaltyProgramId, endDate)

Export all card transaction logs

Download a CSV file containing the balances of all cards in the loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following columns: - &#x60;loyaltyProgramID&#x60;: The ID of the loyalty program. - &#x60;loyaltySubledger&#x60;: The name of the subdleger, when applicatble. - &#x60;cardIdentifier&#x60;: The alphanumeric identifier of the loyalty card. - &#x60;cardState&#x60;:The state of the loyalty card. It can be &#x60;active&#x60; or &#x60;inactive&#x60;. - &#x60;currentBalance&#x60;: The current point balance. - &#x60;pendingBalance&#x60;: The number of pending points. - &#x60;expiredBalance&#x60;: The number of expired points. - &#x60;spentBalance&#x60;: The number of spent points. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    try {
      String result = apiInstance.exportLoyaltyCardBalances(loyaltyProgramId, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyCardBalances");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="exportLoyaltyCardLedger"></a>
# **exportLoyaltyCardLedger**
> String exportLoyaltyCardLedger(loyaltyProgramId, loyaltyCardId, rangeStart, rangeEnd, dateFormat)

Export card&#39;s ledger log

Download a CSV file containing a loyalty card ledger log of the loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportLoyaltyCardLedger(loyaltyProgramId, loyaltyCardId, rangeStart, rangeEnd, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyCardLedger");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="exportLoyaltyCards"></a>
# **exportLoyaltyCards**
> String exportLoyaltyCards(loyaltyProgramId, batchId, createdBefore, createdAfter, dateFormat)

Export loyalty cards

Download a CSV file containing the loyalty cards from a specified loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following columns: - &#x60;identifier&#x60;: The unique identifier of the loyalty card. - &#x60;created&#x60;: The date and time the loyalty card was created. - &#x60;status&#x60;: The status of the loyalty card. - &#x60;userpercardlimit&#x60;: The maximum number of customer profiles that can be linked to the card. - &#x60;customerprofileids&#x60;: Integration IDs of the customer profiles linked to the card. - &#x60;blockreason&#x60;: The reason for transferring and blocking the loyalty card. - &#x60;generated&#x60;: An indicator of whether the loyalty card was generated. - &#x60;batchid&#x60;: The ID of the batch the loyalty card is in. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String batchId = "batchId_example"; // String | Filter results by loyalty card batch ID.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Only return loyalty cards created before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. 
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Only return loyalty cards created after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. 
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportLoyaltyCards(loyaltyProgramId, batchId, createdBefore, createdAfter, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyCards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **batchId** | **String**| Filter results by loyalty card batch ID. | [optional] |
| **createdBefore** | **OffsetDateTime**| Only return loyalty cards created before this timestamp.  **Note:** - This must be an RFC3339 timestamp string.  | [optional] |
| **createdAfter** | **OffsetDateTime**| Only return loyalty cards created after this timestamp.  **Note:** - This must be an RFC3339 timestamp string.  | [optional] |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="exportLoyaltyLedger"></a>
# **exportLoyaltyLedger**
> String exportLoyaltyLedger(rangeStart, rangeEnd, loyaltyProgramId, integrationId, dateFormat)

Export customer&#39;s transaction logs

Download a CSV file containing a customer&#39;s transaction logs in the loyalty program.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The generated file can contain the following columns:  - &#x60;customerprofileid&#x60;: The ID of the profile. - &#x60;customersessionid&#x60;: The ID of the customer session. - &#x60;rulesetid&#x60;: The ID of the rule set. - &#x60;rulename&#x60;: The name of the rule. - &#x60;programid&#x60;: The ID of the loyalty program. - &#x60;type&#x60;: The transaction type, such as &#x60;addition&#x60; or &#x60;subtraction&#x60;. - &#x60;name&#x60;: The reason for the transaction. - &#x60;subledgerid&#x60;: The ID of the subledger, when applicable. - &#x60;startdate&#x60;: The start date of the program. - &#x60;expirydate&#x60;: The expiration date of the program. - &#x60;id&#x60;: The ID of the transaction. - &#x60;created&#x60;: The timestamp of the creation of the loyalty program. - &#x60;amount&#x60;: The number of points in that transaction. - &#x60;archived&#x60;: Whether the session related to the transaction is archived. - &#x60;campaignid&#x60;: The ID of the campaign. - &#x60;flags&#x60;: The flags of the transaction, when applicable. The &#x60;createsNegativeBalance&#x60; flag indicates whether the transaction results in a negative balance. - &#x60;transactionUUID&#x60;: Unique identifier of the transaction in the UUID format. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportLoyaltyLedger(rangeStart, rangeEnd, loyaltyProgramId, integrationId, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyLedger");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  | |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportPoolGiveaways"></a>
# **exportPoolGiveaways**
> String exportPoolGiveaways(poolId, createdBefore, createdAfter)

Export giveaway codes of a giveaway pool

Download a CSV file containing the giveaway codes of a specific giveaway pool.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following columns:  - &#x60;id&#x60;: The internal ID of the giveaway. - &#x60;poolid&#x60;: The internal ID of the giveaway pool. - &#x60;code&#x60;: The giveaway code. - &#x60;startdate&#x60;: The validity start date in RFC3339 of the giveaway (can be empty). - &#x60;enddate&#x60;: The validity end date in RFC3339 of the giveaway (can be empty). - &#x60;attributes&#x60;: Any custom attributes associated with the giveaway code (can be empty). - &#x60;used&#x60;: An indication of whether the giveaway is already awarded. - &#x60;importid&#x60;: The ID of the import which created the giveaway. - &#x60;created&#x60;: The creation time of the giveaway code. - &#x60;profileintegrationid&#x60;: The third-party integration ID of the customer profile that was awarded the giveaway. Can be empty if the giveaway was not awarded. - &#x60;profileid&#x60;: The internal ID of the customer profile that was awarded the giveaway. Can be empty if the giveaway was not awarded or an internal ID does not exist. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long poolId = 56L; // Long | The ID of the pool. You can find it in the Campaign Manager, in the **Giveaways** section.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Timestamp that filters the results to only contain giveaways created before this date. Must be an RFC3339 timestamp string.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Timestamp that filters the results to only contain giveaways created after this date. Must be an RFC3339 timestamp string.
    try {
      String result = apiInstance.exportPoolGiveaways(poolId, createdBefore, createdAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportPoolGiveaways");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolId** | **Long**| The ID of the pool. You can find it in the Campaign Manager, in the **Giveaways** section. | |
| **createdBefore** | **OffsetDateTime**| Timestamp that filters the results to only contain giveaways created before this date. Must be an RFC3339 timestamp string. | [optional] |
| **createdAfter** | **OffsetDateTime**| Timestamp that filters the results to only contain giveaways created after this date. Must be an RFC3339 timestamp string. | [optional] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |

<a id="exportReferrals"></a>
# **exportReferrals**
> String exportReferrals(applicationId, campaignId, createdBefore, createdAfter, valid, usable, batchId, dateFormat)

Export referrals

Download a CSV file containing the referrals that match the given parameters.  **Tip:** If the exported CSV file is too large to view, you can [split it into multiple files](https://www.makeuseof.com/tag/how-to-split-a-huge-csv-excel-workbook-into-seperate-files/).  The CSV file contains the following columns:  - &#x60;code&#x60;: The referral code. - &#x60;advocateprofileintegrationid&#x60;: The profile ID of the advocate. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;limitval&#x60;: The maximum number of redemptions of this code. Defaults to &#x60;1&#x60; when left blank. - &#x60;attributes&#x60;: A json object describing _custom_ referral attribute names and their values. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(78); // BigDecimal | Filter results by campaign ID.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | - `expired`: Matches referrals in which the expiration date is set and in the past. - `validNow`: Matches referrals in which start date is null or in the past and expiration date is null or in the future. - `validFuture`: Matches referrals in which start date is set and in the future. 
    String usable = "true"; // String | - `true`, only referrals where `usageCounter < usageLimit` will be returned. - `false`, only referrals where `usageCounter >= usageLimit` will be returned. 
    String batchId = "batchId_example"; // String | Filter results by batches of referrals
    String dateFormat = "excel"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportReferrals(applicationId, campaignId, createdBefore, createdAfter, valid, usable, batchId, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportReferrals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **BigDecimal**| Filter results by campaign ID. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| - &#x60;expired&#x60;: Matches referrals in which the expiration date is set and in the past. - &#x60;validNow&#x60;: Matches referrals in which start date is null or in the past and expiration date is null or in the future. - &#x60;validFuture&#x60;: Matches referrals in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| - &#x60;true&#x60;, only referrals where &#x60;usageCounter &lt; usageLimit&#x60; will be returned. - &#x60;false&#x60;, only referrals where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60; will be returned.  | [optional] [enum: true, false] |
| **batchId** | **String**| Filter results by batches of referrals | [optional] |
| **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601] |

### Return type

**String**

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccessLogsWithoutTotalCount"></a>
# **getAccessLogsWithoutTotalCount**
> GetAccessLogsWithoutTotalCount200Response getAccessLogsWithoutTotalCount(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

Get access logs for Application

Retrieve the list of API calls sent to the specified Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    String path = "path_example"; // String | Only return results where the request path matches the given regular expression.
    String method = "get"; // String | Only return results where the request method matches the given regular expression.
    String status = "success"; // String | Filter results by HTTP status codes.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetAccessLogsWithoutTotalCount200Response result = apiInstance.getAccessLogsWithoutTotalCount(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccessLogsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **path** | **String**| Only return results where the request path matches the given regular expression. | [optional] |
| **method** | **String**| Only return results where the request method matches the given regular expression. | [optional] [enum: get, put, post, delete, patch] |
| **status** | **String**| Filter results by HTTP status codes. | [optional] [enum: success, error] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetAccessLogsWithoutTotalCount200Response**](GetAccessLogsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccount"></a>
# **getAccount**
> Account getAccount(accountId)

Get account details

Return the details of your companies Talon.One account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long accountId = 56L; // Long | The identifier of the account. Retrieve it via the [List users in account](https://docs.talon.one/management-api#operation/getUsers) endpoint in the `accountId` property. 
    try {
      Account result = apiInstance.getAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Long**| The identifier of the account. Retrieve it via the [List users in account](https://docs.talon.one/management-api#operation/getUsers) endpoint in the &#x60;accountId&#x60; property.  | |

### Return type

[**Account**](Account.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountAnalytics"></a>
# **getAccountAnalytics**
> AccountAnalytics getAccountAnalytics(accountId)

Get account analytics

Return the analytics of your Talon.One account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long accountId = 56L; // Long | The identifier of the account. Retrieve it via the [List users in account](https://docs.talon.one/management-api#operation/getUsers) endpoint in the `accountId` property. 
    try {
      AccountAnalytics result = apiInstance.getAccountAnalytics(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccountAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Long**| The identifier of the account. Retrieve it via the [List users in account](https://docs.talon.one/management-api#operation/getUsers) endpoint in the &#x60;accountId&#x60; property.  | |

### Return type

[**AccountAnalytics**](AccountAnalytics.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountCollection"></a>
# **getAccountCollection**
> Collection getAccountCollection(collectionId)

Get account-level collection

Retrieve a given account-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    try {
      Collection result = apiInstance.getAccountCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="getAchievement"></a>
# **getAchievement**
> Achievement getAchievement(applicationId, campaignId, achievementId)

Get achievement

Get the details of a specific achievement.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long achievementId = 56L; // Long | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint.
    try {
      Achievement result = apiInstance.getAchievement(applicationId, campaignId, achievementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAchievement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **achievementId** | **Long**| The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint. | |

### Return type

[**Achievement**](Achievement.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="getAdditionalCost"></a>
# **getAdditionalCost**
> AccountAdditionalCost getAdditionalCost(additionalCostId)

Get additional cost

Returns the additional cost. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long additionalCostId = 56L; // Long | The ID of the additional cost. You can find the ID the the Campaign Manager's URL when you display the details of the cost in **Account** > **Tools** > **Additional costs**. 
    try {
      AccountAdditionalCost result = apiInstance.getAdditionalCost(additionalCostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **additionalCostId** | **Long**| The ID of the additional cost. You can find the ID the the Campaign Manager&#39;s URL when you display the details of the cost in **Account** &gt; **Tools** &gt; **Additional costs**.  | |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAdditionalCosts"></a>
# **getAdditionalCosts**
> GetAdditionalCosts200Response getAdditionalCosts(pageSize, skip, sort)

List additional costs

Returns all the defined additional costs for the account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetAdditionalCosts200Response result = apiInstance.getAdditionalCosts(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAdditionalCosts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetAdditionalCosts200Response**](GetAdditionalCosts200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplication"></a>
# **getApplication**
> Application getApplication(applicationId)

Get Application

Get the application specified by the ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    try {
      Application result = apiInstance.getApplication(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |

### Return type

[**Application**](Application.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationApiHealth"></a>
# **getApplicationApiHealth**
> ApplicationApiHealth getApplicationApiHealth(applicationId)

Get Application health

Display the health of the Application and show the last time the Application was used.  You can also find this information in the Campaign Manager. In your Application, click **Settings** &gt; **Integration API Keys**. See the [docs](https://docs.talon.one/docs/dev/tutorials/monitoring-integration-status). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    try {
      ApplicationApiHealth result = apiInstance.getApplicationApiHealth(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationApiHealth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |

### Return type

[**ApplicationApiHealth**](ApplicationApiHealth.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationCustomer"></a>
# **getApplicationCustomer**
> ApplicationCustomer getApplicationCustomer(applicationId, customerId)

Get application&#39;s customer

Retrieve the customers of the specified application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long customerId = 56L; // Long | The value of the `id` property of a customer profile. Get it with the [List Application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
    try {
      ApplicationCustomer result = apiInstance.getApplicationCustomer(applicationId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **customerId** | **Long**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List Application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  | |

### Return type

[**ApplicationCustomer**](ApplicationCustomer.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationCustomerFriends"></a>
# **getApplicationCustomerFriends**
> GetApplicationCustomerFriends200Response getApplicationCustomerFriends(applicationId, integrationId, pageSize, skip, sort, withTotalResultSize)

List friends referred by customer profile

List the friends referred by the specified customer profile in this Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String integrationId = "integrationId_example"; // String | The Integration ID of the Advocate's Profile.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      GetApplicationCustomerFriends200Response result = apiInstance.getApplicationCustomerFriends(applicationId, integrationId, pageSize, skip, sort, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomerFriends");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **integrationId** | **String**| The Integration ID of the Advocate&#39;s Profile. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |

### Return type

[**GetApplicationCustomerFriends200Response**](GetApplicationCustomerFriends200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationCustomers"></a>
# **getApplicationCustomers**
> GetApplicationCustomers200Response getApplicationCustomers(applicationId, integrationId, pageSize, skip, withTotalResultSize)

List application&#39;s customers

List all the customers of the specified application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String integrationId = "integrationId_example"; // String | Filter results performing an exact matching against the profile integration identifier.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      GetApplicationCustomers200Response result = apiInstance.getApplicationCustomers(applicationId, integrationId, pageSize, skip, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **integrationId** | **String**| Filter results performing an exact matching against the profile integration identifier. | [optional] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |

### Return type

[**GetApplicationCustomers200Response**](GetApplicationCustomers200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationCustomersByAttributes"></a>
# **getApplicationCustomersByAttributes**
> GetApplicationCustomersByAttributes200Response getApplicationCustomersByAttributes(applicationId, customerProfileSearchQuery, pageSize, skip, withTotalResultSize)

List application customers matching the given attributes

Get a list of the application customers matching the provided criteria.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CustomerProfileSearchQuery customerProfileSearchQuery = new CustomerProfileSearchQuery(); // CustomerProfileSearchQuery | body
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      GetApplicationCustomersByAttributes200Response result = apiInstance.getApplicationCustomersByAttributes(applicationId, customerProfileSearchQuery, pageSize, skip, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomersByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **customerProfileSearchQuery** | [**CustomerProfileSearchQuery**](CustomerProfileSearchQuery.md)| body | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |

### Return type

[**GetApplicationCustomersByAttributes200Response**](GetApplicationCustomersByAttributes200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationEventTypes"></a>
# **getApplicationEventTypes**
> GetApplicationEventTypes200Response getApplicationEventTypes(applicationId, pageSize, skip, sort)

List Applications event types

Get all of the distinct values of the Event &#x60;type&#x60; property for events recorded in the application.  See also: [Track an event](https://docs.talon.one/integration-api#tag/Events/operation/trackEventV2) 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetApplicationEventTypes200Response result = apiInstance.getApplicationEventTypes(applicationId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationEventTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetApplicationEventTypes200Response**](GetApplicationEventTypes200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationEventsWithoutTotalCount"></a>
# **getApplicationEventsWithoutTotalCount**
> GetApplicationEventsWithoutTotalCount200Response getApplicationEventsWithoutTotalCount(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery, effectType)

List Applications events

Lists all events recorded for an application. Instead of having the total number of results in the response, this endpoint only mentions whether there are more results. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String type = "type_example"; // String | Comma-separated list of types by which to filter events. Must be exact match(es).
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Only return events created before this date. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Only return events created after this date. You can use any time zone setting. Talon.One will convert to UTC internally.
    String session = "session_example"; // String | Session integration ID filter for events. Must be exact match.
    String profile = "profile_example"; // String | Profile integration ID filter for events. Must be exact match.
    String customerName = "customerName_example"; // String | Customer name filter for events. Will match substrings case-insensitively.
    String customerEmail = "customerEmail_example"; // String | Customer e-mail address filter for events. Will match substrings case-insensitively.
    String couponCode = "couponCode_example"; // String | Coupon code
    String referralCode = "referralCode_example"; // String | Referral code
    String ruleQuery = "ruleQuery_example"; // String | Rule name filter for events
    String campaignQuery = "campaignQuery_example"; // String | Campaign name filter for events
    String effectType = "effectType_example"; // String | The type of effect that was triggered. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).
    try {
      GetApplicationEventsWithoutTotalCount200Response result = apiInstance.getApplicationEventsWithoutTotalCount(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery, effectType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationEventsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **type** | **String**| Comma-separated list of types by which to filter events. Must be exact match(es). | [optional] |
| **createdBefore** | **OffsetDateTime**| Only return events created before this date. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Only return events created after this date. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **session** | **String**| Session integration ID filter for events. Must be exact match. | [optional] |
| **profile** | **String**| Profile integration ID filter for events. Must be exact match. | [optional] |
| **customerName** | **String**| Customer name filter for events. Will match substrings case-insensitively. | [optional] |
| **customerEmail** | **String**| Customer e-mail address filter for events. Will match substrings case-insensitively. | [optional] |
| **couponCode** | **String**| Coupon code | [optional] |
| **referralCode** | **String**| Referral code | [optional] |
| **ruleQuery** | **String**| Rule name filter for events | [optional] |
| **campaignQuery** | **String**| Campaign name filter for events | [optional] |
| **effectType** | **String**| The type of effect that was triggered. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects). | [optional] |

### Return type

[**GetApplicationEventsWithoutTotalCount200Response**](GetApplicationEventsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationSession"></a>
# **getApplicationSession**
> ApplicationSession getApplicationSession(applicationId, sessionId)

Get Application session

Get the details of the given session. You can list the sessions with the [List Application sessions](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long sessionId = 56L; // Long | The **internal** ID of the session. You can get the ID with the [List Application sessions](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. 
    try {
      ApplicationSession result = apiInstance.getApplicationSession(applicationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **sessionId** | **Long**| The **internal** ID of the session. You can get the ID with the [List Application sessions](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint.  | |

### Return type

[**ApplicationSession**](ApplicationSession.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplicationSessions"></a>
# **getApplicationSessions**
> GetApplicationSessions200Response getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, createdBefore, createdAfter, coupon, referral, integrationId, storeIntegrationId)

List Application sessions

List all the sessions of the specified Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String profile = "profile_example"; // String | Profile integration ID filter for sessions. Must be exact match.
    String state = "open"; // String | Filter by sessions with this state. Must be exact match.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Only return events created before this date. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Only return events created after this date. You can use any time zone setting. Talon.One will convert to UTC internally.
    String coupon = "coupon_example"; // String | Filter by sessions with this coupon. Must be exact match.
    String referral = "referral_example"; // String | Filter by sessions with this referral. Must be exact match.
    String integrationId = "integrationId_example"; // String | Filter by sessions with this integration ID. Must be exact match.
    String storeIntegrationId = "storeIntegrationId_example"; // String | The integration ID of the store. You choose this ID when you create a store.
    try {
      GetApplicationSessions200Response result = apiInstance.getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, createdBefore, createdAfter, coupon, referral, integrationId, storeIntegrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **profile** | **String**| Profile integration ID filter for sessions. Must be exact match. | [optional] |
| **state** | **String**| Filter by sessions with this state. Must be exact match. | [optional] [enum: open, closed, partially_returned, cancelled] |
| **createdBefore** | **OffsetDateTime**| Only return events created before this date. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Only return events created after this date. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **coupon** | **String**| Filter by sessions with this coupon. Must be exact match. | [optional] |
| **referral** | **String**| Filter by sessions with this referral. Must be exact match. | [optional] |
| **integrationId** | **String**| Filter by sessions with this integration ID. Must be exact match. | [optional] |
| **storeIntegrationId** | **String**| The integration ID of the store. You choose this ID when you create a store. | [optional] |

### Return type

[**GetApplicationSessions200Response**](GetApplicationSessions200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApplications"></a>
# **getApplications**
> GetApplications200Response getApplications(pageSize, skip, sort)

List Applications

List all applications in the current account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetApplications200Response result = apiInstance.getApplications(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetApplications200Response**](GetApplications200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttribute"></a>
# **getAttribute**
> Attribute getAttribute(attributeId)

Get custom attribute

Retrieve the specified custom attribute. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long attributeId = 56L; // Long | The ID of the attribute. You can find the ID in the Campaign Manager's URL when you display the details of an attribute in **Account** > **Tools** > **Attributes**.
    try {
      Attribute result = apiInstance.getAttribute(attributeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributeId** | **Long**| The ID of the attribute. You can find the ID in the Campaign Manager&#39;s URL when you display the details of an attribute in **Account** &gt; **Tools** &gt; **Attributes**. | |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttributes"></a>
# **getAttributes**
> GetAttributes200Response getAttributes(pageSize, skip, sort, entity)

List custom attributes

Return all the custom attributes for the account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String entity = "entity_example"; // String | Returned attributes will be filtered by supplied entity.
    try {
      GetAttributes200Response result = apiInstance.getAttributes(pageSize, skip, sort, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **entity** | **String**| Returned attributes will be filtered by supplied entity. | [optional] |

### Return type

[**GetAttributes200Response**](GetAttributes200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAudienceMemberships"></a>
# **getAudienceMemberships**
> GetAudienceMemberships200Response getAudienceMemberships(audienceId, pageSize, skip, sort, profileQuery)

List audience members

Get a paginated list of the customer profiles in a given audience.  A maximum of 1000 customer profiles per page is allowed. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long audienceId = 56L; // Long | The ID of the audience.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String profileQuery = "profileQuery_example"; // String | The filter to select a profile.
    try {
      GetAudienceMemberships200Response result = apiInstance.getAudienceMemberships(audienceId, pageSize, skip, sort, profileQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAudienceMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceId** | **Long**| The ID of the audience. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **profileQuery** | **String**| The filter to select a profile. | [optional] |

### Return type

[**GetAudienceMemberships200Response**](GetAudienceMemberships200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="getAudiences"></a>
# **getAudiences**
> GetAudiences200Response getAudiences(pageSize, skip, sort, withTotalResultSize)

List audiences

Get all audiences created in the account. To create an audience, use [Create audience](https://docs.talon.one/integration-api#tag/Audiences/operation/createAudienceV2). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      GetAudiences200Response result = apiInstance.getAudiences(pageSize, skip, sort, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAudiences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |

### Return type

[**GetAudiences200Response**](GetAudiences200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAudiencesAnalytics"></a>
# **getAudiencesAnalytics**
> GetAudiencesAnalytics200Response getAudiencesAnalytics(audienceIds, sort)

List audience analytics

Get a list of audience IDs and their member count. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String audienceIds = "audienceIds_example"; // String | The IDs of one or more audiences, separated by commas, by which to filter results.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetAudiencesAnalytics200Response result = apiInstance.getAudiencesAnalytics(audienceIds, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAudiencesAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceIds** | **String**| The IDs of one or more audiences, separated by commas, by which to filter results. | |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetAudiencesAnalytics200Response**](GetAudiencesAnalytics200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaign"></a>
# **getCampaign**
> Campaign getCampaign(applicationId, campaignId)

Get campaign

Retrieve the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      Campaign result = apiInstance.getCampaign(applicationId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignAnalytics"></a>
# **getCampaignAnalytics**
> GetCampaignAnalytics200Response getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity)

Get analytics of campaigns

Retrieve statistical data about the performance of the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    String granularity = "1 hour"; // String | The time interval between the results in the returned time-series.
    try {
      GetCampaignAnalytics200Response result = apiInstance.getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **granularity** | **String**| The time interval between the results in the returned time-series. | [optional] [enum: 1 hour, 1 day, 1 week, 1 month, 1 year] |

### Return type

[**GetCampaignAnalytics200Response**](GetCampaignAnalytics200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignByAttributes"></a>
# **getCampaignByAttributes**
> GetCampaigns200Response getCampaignByAttributes(applicationId, campaignSearch, pageSize, skip, sort, campaignState)

List campaigns that match the given attributes

Get a list of all the campaigns that match a set of attributes. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CampaignSearch campaignSearch = new CampaignSearch(); // CampaignSearch | body
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String campaignState = "enabled"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. 
    try {
      GetCampaigns200Response result = apiInstance.getCampaignByAttributes(applicationId, campaignSearch, pageSize, skip, sort, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignSearch** | [**CampaignSearch**](CampaignSearch.md)| body | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived.  | [optional] [enum: enabled, disabled, archived, scheduled, running, expired, staged] |

### Return type

[**GetCampaigns200Response**](GetCampaigns200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignGroup"></a>
# **getCampaignGroup**
> CampaignGroup getCampaignGroup(campaignGroupId)

Get campaign access group

Get a campaign access group specified by its ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long campaignGroupId = 56L; // Long | The ID of the campaign access group.
    try {
      CampaignGroup result = apiInstance.getCampaignGroup(campaignGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignGroupId** | **Long**| The ID of the campaign access group. | |

### Return type

[**CampaignGroup**](CampaignGroup.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignGroups"></a>
# **getCampaignGroups**
> GetCampaignGroups200Response getCampaignGroups(pageSize, skip, sort)

List campaign access groups

List the campaign access groups in the current account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetCampaignGroups200Response result = apiInstance.getCampaignGroups(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetCampaignGroups200Response**](GetCampaignGroups200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignTemplates"></a>
# **getCampaignTemplates**
> GetCampaignTemplates200Response getCampaignTemplates(pageSize, skip, sort, state, name, tags, userId)

List campaign templates

Retrieve a list of campaign templates.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String state = "draft"; // String | Filter results by the state of the campaign template.
    String name = "name_example"; // String | Filter results performing case-insensitive matching against the name of the campaign template.
    String tags = "tags_example"; // String | Filter results performing case-insensitive matching against the tags of the campaign template. When used in conjunction with the \"name\" query parameter, a logical OR will be performed to search both tags and name for the provided values. 
    Long userId = 56L; // Long | Filter results by user ID.
    try {
      GetCampaignTemplates200Response result = apiInstance.getCampaignTemplates(pageSize, skip, sort, state, name, tags, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **state** | **String**| Filter results by the state of the campaign template. | [optional] [enum: draft, enabled, disabled] |
| **name** | **String**| Filter results performing case-insensitive matching against the name of the campaign template. | [optional] |
| **tags** | **String**| Filter results performing case-insensitive matching against the tags of the campaign template. When used in conjunction with the \&quot;name\&quot; query parameter, a logical OR will be performed to search both tags and name for the provided values.  | [optional] |
| **userId** | **Long**| Filter results by user ID. | [optional] |

### Return type

[**GetCampaignTemplates200Response**](GetCampaignTemplates200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaigns"></a>
# **getCampaigns**
> GetCampaigns200Response getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter, campaignGroupId, templateId, storeId)

List campaigns

List the campaigns of the specified application that match your filter criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String campaignState = "enabled"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. 
    String name = "name_example"; // String | Filter results performing case-insensitive matching against the name of the campaign.
    String tags = "tags_example"; // String | Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \"name\" query parameter, a logical OR will be performed to search both tags and name for the provided values 
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    Long campaignGroupId = 56L; // Long | Filter results to campaigns owned by the specified campaign access group ID.
    Long templateId = 56L; // Long | The ID of the campaign template this campaign was created from.
    Long storeId = 56L; // Long | Filter results to campaigns linked to the specified store ID.
    try {
      GetCampaigns200Response result = apiInstance.getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter, campaignGroupId, templateId, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived.  | [optional] [enum: enabled, disabled, archived, scheduled, running, expired, staged] |
| **name** | **String**| Filter results performing case-insensitive matching against the name of the campaign. | [optional] |
| **tags** | **String**| Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \&quot;name\&quot; query parameter, a logical OR will be performed to search both tags and name for the provided values  | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **campaignGroupId** | **Long**| Filter results to campaigns owned by the specified campaign access group ID. | [optional] |
| **templateId** | **Long**| The ID of the campaign template this campaign was created from. | [optional] |
| **storeId** | **Long**| Filter results to campaigns linked to the specified store ID. | [optional] |

### Return type

[**GetCampaigns200Response**](GetCampaigns200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |

<a id="getChanges"></a>
# **getChanges**
> GetChanges200Response getChanges(pageSize, skip, sort, applicationId, entityPath, userId, createdBefore, createdAfter, withTotalResultSize, managementKeyId, includeOld)

Get audit logs for an account

Retrieve the audit logs displayed in **Accounts &gt; Audit logs**. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    BigDecimal applicationId = new BigDecimal(78); // BigDecimal | Filter results by Application ID.
    String entityPath = "entityPath_example"; // String | Filter results on a case insensitive matching of the url path of the entity
    Long userId = 56L; // Long | Filter results by user ID.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    Long managementKeyId = 56L; // Long | Filter results that match the given management key ID.
    Boolean includeOld = true; // Boolean | When this flag is set to false, the state without the change will not be returned. The default value is true.
    try {
      GetChanges200Response result = apiInstance.getChanges(pageSize, skip, sort, applicationId, entityPath, userId, createdBefore, createdAfter, withTotalResultSize, managementKeyId, includeOld);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getChanges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional] |
| **entityPath** | **String**| Filter results on a case insensitive matching of the url path of the entity | [optional] |
| **userId** | **Long**| Filter results by user ID. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **managementKeyId** | **Long**| Filter results that match the given management key ID. | [optional] |
| **includeOld** | **Boolean**| When this flag is set to false, the state without the change will not be returned. The default value is true. | [optional] |

### Return type

[**GetChanges200Response**](GetChanges200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCollection"></a>
# **getCollection**
> Collection getCollection(applicationId, campaignId, collectionId)

Get campaign-level collection

Retrieve a given campaign-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint.
    try {
      Collection result = apiInstance.getCollection(applicationId, campaignId, collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint. | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="getCollectionItems"></a>
# **getCollectionItems**
> GetCollectionItems200Response getCollectionItems(collectionId, pageSize, skip)

Get collection items

Retrieve items from a given collection.  You can retrieve items from both account-level collections and campaign-level collections using this endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    try {
      GetCollectionItems200Response result = apiInstance.getCollectionItems(collectionId, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCollectionItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |

### Return type

[**GetCollectionItems200Response**](GetCollectionItems200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="getCouponsWithoutTotalCount"></a>
# **getCouponsWithoutTotalCount**
> GetCouponsWithoutTotalCount200Response getCouponsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, redeemed, referralId, recipientIntegrationId, batchId, exactMatch, expiresBefore, expiresAfter, startsBefore, startsAfter, valuesOnly)

List coupons

List all the coupons matching the specified criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "true"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    String redeemed = "true"; // String | - `true`: only coupons where `usageCounter > 0` will be returned. - `false`: only coupons where `usageCounter = 0` will be returned. - This field cannot be used in conjunction with the `usable` query parameter. 
    Long referralId = 56L; // Long | Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile ID specified in the coupon's RecipientIntegrationId field.
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code.
    OffsetDateTime expiresBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime expiresAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime startsBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime startsAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    Boolean valuesOnly = false; // Boolean | Filter results to only return the coupon codes (`value` column) without the associated coupon data.
    try {
      GetCouponsWithoutTotalCount200Response result = apiInstance.getCouponsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, redeemed, referralId, recipientIntegrationId, batchId, exactMatch, expiresBefore, expiresAfter, startsBefore, startsAfter, valuesOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCouponsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false] |
| **redeemed** | **String**| - &#x60;true&#x60;: only coupons where &#x60;usageCounter &gt; 0&#x60; will be returned. - &#x60;false&#x60;: only coupons where &#x60;usageCounter &#x3D; 0&#x60; will be returned. - This field cannot be used in conjunction with the &#x60;usable&#x60; query parameter.  | [optional] [enum: true, false] |
| **referralId** | **Long**| Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code. | [optional] |
| **recipientIntegrationId** | **String**| Filter results by match with a profile ID specified in the coupon&#39;s RecipientIntegrationId field. | [optional] |
| **batchId** | **String**| Filter results by batches of coupons | [optional] |
| **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code. | [optional] [default to false] |
| **expiresBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **expiresAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon expiration date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **startsBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **startsAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon start date timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valuesOnly** | **Boolean**| Filter results to only return the coupon codes (&#x60;value&#x60; column) without the associated coupon data. | [optional] [default to false] |

### Return type

[**GetCouponsWithoutTotalCount200Response**](GetCouponsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomerActivityReport"></a>
# **getCustomerActivityReport**
> CustomerActivityReport getCustomerActivityReport(rangeStart, rangeEnd, applicationId, customerId, pageSize, skip)

Get customer&#39;s activity report

Fetch the summary report of a given customer in the given application, in a time range.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long customerId = 56L; // Long | The value of the `id` property of a customer profile. Get it with the [List Application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    try {
      CustomerActivityReport result = apiInstance.getCustomerActivityReport(rangeStart, rangeEnd, applicationId, customerId, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerActivityReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **customerId** | **Long**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List Application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |

### Return type

[**CustomerActivityReport**](CustomerActivityReport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomerActivityReportsWithoutTotalCount"></a>
# **getCustomerActivityReportsWithoutTotalCount**
> GetCustomerActivityReportsWithoutTotalCount200Response getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName)

Get Activity Reports for Application Customers

Fetch summary reports for all application customers based on a time range. Instead of having the total number of results in the response, this endpoint only mentions whether there are more results. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String name = "name_example"; // String | Only return reports matching the customer name.
    String integrationId = "integrationId_example"; // String | Filter results performing an exact matching against the profile integration identifier.
    String campaignName = "campaignName_example"; // String | Only return reports matching the campaign name.
    String advocateName = "advocateName_example"; // String | Only return reports matching the current customer referrer name.
    try {
      GetCustomerActivityReportsWithoutTotalCount200Response result = apiInstance.getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerActivityReportsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **name** | **String**| Only return reports matching the customer name. | [optional] |
| **integrationId** | **String**| Filter results performing an exact matching against the profile integration identifier. | [optional] |
| **campaignName** | **String**| Only return reports matching the campaign name. | [optional] |
| **advocateName** | **String**| Only return reports matching the current customer referrer name. | [optional] |

### Return type

[**GetCustomerActivityReportsWithoutTotalCount200Response**](GetCustomerActivityReportsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomerAnalytics"></a>
# **getCustomerAnalytics**
> CustomerAnalytics getCustomerAnalytics(applicationId, customerId, pageSize, skip, sort)

Get customer&#39;s analytics report

Fetch analytics for a given customer in the given application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long customerId = 56L; // Long | The value of the `id` property of a customer profile. Get it with the [List Application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      CustomerAnalytics result = apiInstance.getCustomerAnalytics(applicationId, customerId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **customerId** | **Long**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List Application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**CustomerAnalytics**](CustomerAnalytics.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomerProfile"></a>
# **getCustomerProfile**
> CustomerProfile getCustomerProfile(customerId)

Get customer profile

Return the details of the specified customer profile.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    You can retrieve the same information via the Integration API, which can save you extra API requests. consider these options:    - Request the customer profile to be part of the response content using     [Update Customer Session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2).   - Send an empty update with the [Update Customer Profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint with &#x60;runRuleEngine&#x3D;false&#x60;. &lt;/div&gt; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long customerId = 56L; // Long | The value of the `id` property of a customer profile. Get it with the [List Application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
    try {
      CustomerProfile result = apiInstance.getCustomerProfile(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **Long**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List Application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  | |

### Return type

[**CustomerProfile**](CustomerProfile.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomerProfileAchievementProgress"></a>
# **getCustomerProfileAchievementProgress**
> GetCustomerProfileAchievementProgress200Response getCustomerProfileAchievementProgress(applicationId, integrationId, pageSize, skip, achievementId, title)

List customer achievements

For the given customer profile, list all the achievements that match your filter criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
    Long pageSize = 50L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Long achievementId = 56L; // Long | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint.
    String title = "title_example"; // String | Filter results by the `title` of an achievement.
    try {
      GetCustomerProfileAchievementProgress200Response result = apiInstance.getCustomerProfileAchievementProgress(applicationId, integrationId, pageSize, skip, achievementId, title);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerProfileAchievementProgress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **achievementId** | **Long**| The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint. | [optional] |
| **title** | **String**| Filter results by the &#x60;title&#x60; of an achievement. | [optional] |

### Return type

[**GetCustomerProfileAchievementProgress200Response**](GetCustomerProfileAchievementProgress200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="getCustomerProfiles"></a>
# **getCustomerProfiles**
> GetCustomerProfiles200Response getCustomerProfiles(pageSize, skip, sandbox)

List customer profiles

List all customer profiles.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Boolean sandbox = false; // Boolean | Indicates whether you are pointing to a sandbox or live customer.
    try {
      GetCustomerProfiles200Response result = apiInstance.getCustomerProfiles(pageSize, skip, sandbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerProfiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sandbox** | **Boolean**| Indicates whether you are pointing to a sandbox or live customer. | [optional] [default to false] |

### Return type

[**GetCustomerProfiles200Response**](GetCustomerProfiles200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomersByAttributes"></a>
# **getCustomersByAttributes**
> GetCustomersByAttributes200Response getCustomersByAttributes(customerProfileSearchQuery, pageSize, skip, sandbox)

List customer profiles matching the given attributes

Get a list of the customer profiles matching the provided criteria.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    CustomerProfileSearchQuery customerProfileSearchQuery = new CustomerProfileSearchQuery(); // CustomerProfileSearchQuery | body
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Boolean sandbox = false; // Boolean | Indicates whether you are pointing to a sandbox or live customer.
    try {
      GetCustomersByAttributes200Response result = apiInstance.getCustomersByAttributes(customerProfileSearchQuery, pageSize, skip, sandbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomersByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileSearchQuery** | [**CustomerProfileSearchQuery**](CustomerProfileSearchQuery.md)| body | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sandbox** | **Boolean**| Indicates whether you are pointing to a sandbox or live customer. | [optional] [default to false] |

### Return type

[**GetCustomersByAttributes200Response**](GetCustomersByAttributes200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDashboardStatistics"></a>
# **getDashboardStatistics**
> GetDashboardStatistics200Response getDashboardStatistics(loyaltyProgramId, rangeStart, rangeEnd, subledgerId)

Get statistics for loyalty dashboard

Retrieve the statistics displayed on the specified loyalty program&#39;s dashboard, such as the total active points, pending points, spent points, and expired points.  **Important:** The returned data does not include the current day. All statistics are updated daily at 11:59 PM in the loyalty program time zone. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    OffsetDateTime rangeStart = OffsetDateTime.now(); // OffsetDateTime | Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime rangeEnd = OffsetDateTime.now(); // OffsetDateTime | Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
    try {
      GetDashboardStatistics200Response result = apiInstance.getDashboardStatistics(loyaltyProgramId, rangeStart, rangeEnd, subledgerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getDashboardStatistics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp.  **Note:** - This must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | |
| **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional] |

### Return type

[**GetDashboardStatistics200Response**](GetDashboardStatistics200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEventTypes"></a>
# **getEventTypes**
> GetEventTypes200Response getEventTypes(name, includeOldVersions, pageSize, skip, sort)

List event types

Fetch all event type definitions for your account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String name = "name_example"; // String | Filter results to event types with the given name. This parameter implies `includeOldVersions`.
    Boolean includeOldVersions = false; // Boolean | Include all versions of every event type.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetEventTypes200Response result = apiInstance.getEventTypes(name, includeOldVersions, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getEventTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Filter results to event types with the given name. This parameter implies &#x60;includeOldVersions&#x60;. | [optional] |
| **includeOldVersions** | **Boolean**| Include all versions of every event type. | [optional] [default to false] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetEventTypes200Response**](GetEventTypes200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getExports"></a>
# **getExports**
> GetExports200Response getExports(pageSize, skip, applicationId, campaignId, entity)

Get exports

List all past exports 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    BigDecimal applicationId = new BigDecimal(78); // BigDecimal | Filter results by Application ID.
    Long campaignId = 56L; // Long | Filter by the campaign ID on which the limit counters are used.
    String entity = "Coupon"; // String | The name of the entity type that was exported.
    try {
      GetExports200Response result = apiInstance.getExports(pageSize, skip, applicationId, campaignId, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getExports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional] |
| **campaignId** | **Long**| Filter by the campaign ID on which the limit counters are used. | [optional] |
| **entity** | **String**| The name of the entity type that was exported. | [optional] [enum: Coupon, Referral, Effect, CustomerSession, LoyaltyLedger, LoyaltyLedgerLog, Collection, AudienceMembership] |

### Return type

[**GetExports200Response**](GetExports200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLoyaltyCard"></a>
# **getLoyaltyCard**
> LoyaltyCard getLoyaltyCard(loyaltyProgramId, loyaltyCardId)

Get loyalty card

Get the given loyalty card.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    try {
      LoyaltyCard result = apiInstance.getLoyaltyCard(loyaltyProgramId, loyaltyCardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |

### Return type

[**LoyaltyCard**](LoyaltyCard.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="getLoyaltyCardTransactionLogs"></a>
# **getLoyaltyCardTransactionLogs**
> GetLoyaltyCardTransactionLogs200Response getLoyaltyCardTransactionLogs(loyaltyProgramId, loyaltyCardId, startDate, endDate, pageSize, skip, subledgerId, customerSessionIDs, transactionUUIDs)

List card&#39;s transactions

Retrieve the transaction logs for the given [loyalty card](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview) within the specified [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types) with filtering options applied. If no filtering options are applied, the last 50 loyalty transactions for the given loyalty card are returned. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
    List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.   To include multiple IDs, repeat the parameter for each one, for example,  `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
    List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example,  `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
    try {
      GetLoyaltyCardTransactionLogs200Response result = apiInstance.getLoyaltyCardTransactionLogs(loyaltyProgramId, loyaltyCardId, startDate, endDate, pageSize, skip, subledgerId, customerSessionIDs, transactionUUIDs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyCardTransactionLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |
| **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional] |
| **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.   To include multiple IDs, repeat the parameter for each one, for example,  &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional] |
| **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example,  &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional] |

### Return type

[**GetLoyaltyCardTransactionLogs200Response**](GetLoyaltyCardTransactionLogs200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="getLoyaltyCards"></a>
# **getLoyaltyCards**
> GetLoyaltyCards200Response getLoyaltyCards(loyaltyProgramId, pageSize, skip, sort, identifier, profileId, batchId)

List loyalty cards

For the given card-based loyalty program, list the loyalty cards that match your filter criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String identifier = "identifier_example"; // String | The card code by which to filter loyalty cards in the response.
    Long profileId = 56L; // Long | Filter results by customer profile ID.
    String batchId = "batchId_example"; // String | Filter results by loyalty card batch ID.
    try {
      GetLoyaltyCards200Response result = apiInstance.getLoyaltyCards(loyaltyProgramId, pageSize, skip, sort, identifier, profileId, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyCards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **identifier** | **String**| The card code by which to filter loyalty cards in the response. | [optional] |
| **profileId** | **Long**| Filter results by customer profile ID. | [optional] |
| **batchId** | **String**| Filter results by loyalty card batch ID. | [optional] |

### Return type

[**GetLoyaltyCards200Response**](GetLoyaltyCards200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="getLoyaltyPoints"></a>
# **getLoyaltyPoints**
> LoyaltyLedger getLoyaltyPoints(loyaltyProgramId, integrationId)

Get customer&#39;s full loyalty ledger

Get the loyalty ledger for this profile integration ID.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint.  **Important:** To get loyalty transaction logs for a given Integration ID in a loyalty program, we recommend using the Integration API&#39;s [Get customer&#39;s loyalty logs](https://docs.talon.one/integration-api#tag/Loyalty/operation/getLoyaltyProgramProfileTransactions). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
    try {
      LoyaltyLedger result = apiInstance.getLoyaltyPoints(loyaltyProgramId, integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  | |

### Return type

[**LoyaltyLedger**](LoyaltyLedger.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLoyaltyProgram"></a>
# **getLoyaltyProgram**
> LoyaltyProgram getLoyaltyProgram(loyaltyProgramId)

Get loyalty program

Get the specified [loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview). To list all loyalty programs in your Application, use [List loyalty programs](#operation/getLoyaltyPrograms).  To list the loyalty programs that a customer profile is part of, use the [List customer data](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/getCustomerInventory) 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    try {
      LoyaltyProgram result = apiInstance.getLoyaltyProgram(loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyProgram");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |

### Return type

[**LoyaltyProgram**](LoyaltyProgram.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLoyaltyProgramTransactions"></a>
# **getLoyaltyProgramTransactions**
> GetLoyaltyProgramTransactions200Response getLoyaltyProgramTransactions(loyaltyProgramId, loyaltyTransactionType, subledgerId, customerSessionIDs, transactionUUIDs, startDate, endDate, pageSize, skip)

List loyalty program transactions

Retrieve loyalty program transaction logs in a given loyalty program with filtering options applied. Manual and imported transactions are also included. **Note:** If no filters are applied, the last 50 loyalty transactions for the given loyalty program are returned.  **Important:** To get loyalty transaction logs for a given Integration ID in a loyalty program, we recommend using the Integration API&#39;s [Get customer&#39;s loyalty logs](https://docs.talon.one/integration-api#tag/Loyalty/operation/getLoyaltyProgramProfileTransactions). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyTransactionType = "manual"; // String | Filter results by loyalty transaction type: - `manual`: Loyalty transaction that was done manually. - `session`: Loyalty transaction that resulted from a customer session. - `import`: Loyalty transaction that was imported from a CSV file. 
    String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
    List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.   To include multiple IDs, repeat the parameter for each one, for example,  `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
    List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example,  `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
    Long pageSize = 50L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    try {
      GetLoyaltyProgramTransactions200Response result = apiInstance.getLoyaltyProgramTransactions(loyaltyProgramId, loyaltyTransactionType, subledgerId, customerSessionIDs, transactionUUIDs, startDate, endDate, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyProgramTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyTransactionType** | **String**| Filter results by loyalty transaction type: - &#x60;manual&#x60;: Loyalty transaction that was done manually. - &#x60;session&#x60;: Loyalty transaction that resulted from a customer session. - &#x60;import&#x60;: Loyalty transaction that was imported from a CSV file.  | [optional] [enum: manual, session, import] |
| **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional] |
| **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.   To include multiple IDs, repeat the parameter for each one, for example,  &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional] |
| **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example,  &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional] |
| **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |
| **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |

### Return type

[**GetLoyaltyProgramTransactions200Response**](GetLoyaltyProgramTransactions200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="getLoyaltyPrograms"></a>
# **getLoyaltyPrograms**
> GetLoyaltyPrograms200Response getLoyaltyPrograms()

List loyalty programs

List the loyalty programs of the account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      GetLoyaltyPrograms200Response result = apiInstance.getLoyaltyPrograms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyPrograms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLoyaltyPrograms200Response**](GetLoyaltyPrograms200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLoyaltyStatistics"></a>
# **getLoyaltyStatistics**
> LoyaltyDashboardData getLoyaltyStatistics(loyaltyProgramId)

Get loyalty program statistics

⚠️ Deprecation notice: Support for requests to this endpoint will end soon. To retrieve statistics for a loyalty program, use the [Get statistics for loyalty dashboard](/management-api#tag/Loyalty/operation/getDashboardStatistics) endpoint.  Retrieve the statistics of the specified loyalty program, such as the total active points, pending points, spent points, and expired points. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    try {
      LoyaltyDashboardData result = apiInstance.getLoyaltyStatistics(loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyStatistics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |

### Return type

[**LoyaltyDashboardData**](LoyaltyDashboardData.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMessageLogs"></a>
# **getMessageLogs**
> MessageLogEntries getMessageLogs(entityType, messageID, changeType, notificationIDs, createdBefore, createdAfter, cursor, period, isSuccessful, applicationId, campaignId, loyaltyProgramId, responseCode, webhookIDs)

List message log entries

Retrieve all message log entries.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String entityType = "application"; // String | The entity type the log is related to. 
    String messageID = "messageID_example"; // String | Filter results by message ID.
    String changeType = "CampaignEvaluationTreeChanged"; // String | Filter results by change type.
    String notificationIDs = "notificationIDs_example"; // String | Filter results by notification ID (include up to 30 values, separated by a comma).
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string. Use UTC time.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. Use UTC time.
    byte[] cursor = null; // byte[] | A specific unique value in the database. If this value is not given, the server fetches results starting with the first record. 
    String period = "15m"; // String | Filter results by time period. Choose between the available relative time frames. 
    Boolean isSuccessful = true; // Boolean | Indicates whether to return log entries with either successful or unsuccessful HTTP response codes. When set to`true`, only log entries with `2xx` response codes are returned. When set to `false`, only log entries with `4xx` and `5xx` response codes are returned. 
    BigDecimal applicationId = new BigDecimal(78); // BigDecimal | Filter results by Application ID.
    BigDecimal campaignId = new BigDecimal(78); // BigDecimal | Filter results by campaign ID.
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program.
    Long responseCode = 56L; // Long | Filter results by response status code.
    String webhookIDs = "webhookIDs_example"; // String | Filter results by webhook ID (include up to 30 values, separated by a comma).
    try {
      MessageLogEntries result = apiInstance.getMessageLogs(entityType, messageID, changeType, notificationIDs, createdBefore, createdAfter, cursor, period, isSuccessful, applicationId, campaignId, loyaltyProgramId, responseCode, webhookIDs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getMessageLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| The entity type the log is related to.  | [enum: application, loyalty_program, webhook] |
| **messageID** | **String**| Filter results by message ID. | [optional] |
| **changeType** | **String**| Filter results by change type. | [optional] [enum: CampaignEvaluationTreeChanged, CampaignNotification, CouponCreated, CouponUpdated, CouponDeleted, AsyncCouponsCreated, CouponsDeleted, CouponsUpdated, CouponCodeExpiring, StrikethroughPrice, LoyaltyPointsAdded, LoyaltyPointsDeducted, LoyaltyPointsExpiring, LoyaltyPointsPendingToActive, LoyaltyAddedDeductedPointsBalances, LoyaltyCardAddedDeductedPointsBalances, TierWillDowngrade, TierUpgrade, TierDowngrade, LoyaltyCardPointsAdded, LoyaltyCardPointsDeducted, LoyaltyCardPointsExpiring] |
| **notificationIDs** | **String**| Filter results by notification ID (include up to 30 values, separated by a comma). | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string. Use UTC time. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. Use UTC time. | [optional] |
| **cursor** | **byte[]**| A specific unique value in the database. If this value is not given, the server fetches results starting with the first record.  | [optional] |
| **period** | **String**| Filter results by time period. Choose between the available relative time frames.  | [optional] [enum: 15m, 30m, 1h, 4h, 1d, 2d] |
| **isSuccessful** | **Boolean**| Indicates whether to return log entries with either successful or unsuccessful HTTP response codes. When set to&#x60;true&#x60;, only log entries with &#x60;2xx&#x60; response codes are returned. When set to &#x60;false&#x60;, only log entries with &#x60;4xx&#x60; and &#x60;5xx&#x60; response codes are returned.  | [optional] |
| **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional] |
| **campaignId** | **BigDecimal**| Filter results by campaign ID. | [optional] |
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. | [optional] |
| **responseCode** | **Long**| Filter results by response status code. | [optional] |
| **webhookIDs** | **String**| Filter results by webhook ID (include up to 30 values, separated by a comma). | [optional] |

### Return type

[**MessageLogEntries**](MessageLogEntries.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getReferralsWithoutTotalCount"></a>
# **getReferralsWithoutTotalCount**
> GetReferralsWithoutTotalCount200Response getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate)

List referrals

List all referrals of the specified campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String code = "code_example"; // String | Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches referrals in which the expiration date is set and in the past. The second matches referrals in which start date is null or in the past and expiration date is null or in the future, the third matches referrals in which start date is set and in the future. 
    String usable = "true"; // String | Either \"true\" or \"false\". If \"true\", only referrals where `usageCounter < usageLimit` will be returned, \"false\" will return only referrals where `usageCounter >= usageLimit`. 
    String advocate = "advocate_example"; // String | Filter results by match with a profile ID specified in the referral's AdvocateProfileIntegrationId field.
    try {
      GetReferralsWithoutTotalCount200Response result = apiInstance.getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getReferralsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **code** | **String**| Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches referrals in which the expiration date is set and in the past. The second matches referrals in which start date is null or in the past and expiration date is null or in the future, the third matches referrals in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only referrals where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only referrals where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false] |
| **advocate** | **String**| Filter results by match with a profile ID specified in the referral&#39;s AdvocateProfileIntegrationId field. | [optional] |

### Return type

[**GetReferralsWithoutTotalCount200Response**](GetReferralsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRoleV2"></a>
# **getRoleV2**
> RoleV2 getRoleV2(roleId)

Get role

Get the details of a specific role. To see all the roles, use the [List roles](/management-api#tag/Roles/operation/listAllRolesV2) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long roleId = 56L; // Long | The ID of role.  **Note**: To find the ID of a role, use the [List roles](/management-api#tag/Roles/operation/listAllRolesV2) endpoint. 
    try {
      RoleV2 result = apiInstance.getRoleV2(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRoleV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **Long**| The ID of role.  **Note**: To find the ID of a role, use the [List roles](/management-api#tag/Roles/operation/listAllRolesV2) endpoint.  | |

### Return type

[**RoleV2**](RoleV2.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRuleset"></a>
# **getRuleset**
> Ruleset getRuleset(applicationId, campaignId, rulesetId)

Get ruleset

Retrieve the specified ruleset.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long rulesetId = 56L; // Long | The ID of the ruleset.
    try {
      Ruleset result = apiInstance.getRuleset(applicationId, campaignId, rulesetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **rulesetId** | **Long**| The ID of the ruleset. | |

### Return type

[**Ruleset**](Ruleset.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRulesets"></a>
# **getRulesets**
> GetRulesets200Response getRulesets(applicationId, campaignId, pageSize, skip, sort)

List campaign rulesets

List all rulesets of this campaign. A ruleset is a revision of the rules of a campaign. **Important:** The response also includes deleted rules. You should only consider the latest revision of the returned rulesets. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetRulesets200Response result = apiInstance.getRulesets(applicationId, campaignId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetRulesets200Response**](GetRulesets200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getStore"></a>
# **getStore**
> Store getStore(applicationId, storeId)

Get store

Get store details for a specific store ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String storeId = "storeId_example"; // String | The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint. 
    try {
      Store result = apiInstance.getStore(applicationId, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **storeId** | **String**| The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint.  | |

### Return type

[**Store**](Store.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="getUser"></a>
# **getUser**
> User getUser(userId)

Get user

Retrieve the data (including an invitation code) for a user. Non-admin users can only get their own profile. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    try {
      User result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |

### Return type

[**User**](User.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUsers"></a>
# **getUsers**
> GetUsers200Response getUsers(pageSize, skip, sort)

List users in account

Retrieve all users in your account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    try {
      GetUsers200Response result = apiInstance.getUsers(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |

### Return type

[**GetUsers200Response**](GetUsers200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWebhook"></a>
# **getWebhook**
> Webhook getWebhook(webhookId)

Get webhook

Returns a webhook by its id.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long webhookId = 56L; // Long | The ID of the webhook. You can find the ID in the Campaign Manager's URL when you display the details of the webhook in **Account** > **Webhooks**. 
    try {
      Webhook result = apiInstance.getWebhook(webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookId** | **Long**| The ID of the webhook. You can find the ID in the Campaign Manager&#39;s URL when you display the details of the webhook in **Account** &gt; **Webhooks**.  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWebhooks"></a>
# **getWebhooks**
> GetWebhooks200Response getWebhooks(applicationIds, sort, pageSize, skip, creationType, visibility, outgoingIntegrationsTypeId, title)

List webhooks

List all webhooks.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String applicationIds = "applicationIds_example"; // String | Checks if the given catalog or its attributes are referenced in the specified Application ID.  **Note**: If no Application ID is provided, we check for all connected Applications. 
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String creationType = "templateWebhooks"; // String | Filter results by creation type.
    String visibility = "visible"; // String | Filter results by visibility.
    Long outgoingIntegrationsTypeId = 56L; // Long | Filter results by outgoing integration type ID.
    String title = "title_example"; // String | Filter results performing case-insensitive matching against the webhook title.
    try {
      GetWebhooks200Response result = apiInstance.getWebhooks(applicationIds, sort, pageSize, skip, creationType, visibility, outgoingIntegrationsTypeId, title);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationIds** | **String**| Checks if the given catalog or its attributes are referenced in the specified Application ID.  **Note**: If no Application ID is provided, we check for all connected Applications.  | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **creationType** | **String**| Filter results by creation type. | [optional] [enum: templateWebhooks, webhooks] |
| **visibility** | **String**| Filter results by visibility. | [optional] [enum: visible, hidden] |
| **outgoingIntegrationsTypeId** | **Long**| Filter results by outgoing integration type ID. | [optional] |
| **title** | **String**| Filter results performing case-insensitive matching against the webhook title. | [optional] |

### Return type

[**GetWebhooks200Response**](GetWebhooks200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="importAccountCollection"></a>
# **importAccountCollection**
> ModelImport importAccountCollection(collectionId, upFile)

Import data into existing account-level collection

Upload a CSV file containing the collection of string values that should be attached as payload for collection. The file should be sent as multipart data.  The import **replaces** the initial content of the collection.  The CSV file **must** only contain the following column:  - &#x60;item&#x60;: the values in your collection.  A collection is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60; item Addidas Nike Asics &#x60;&#x60;&#x60;  **Note:** Before sending a request to this endpoint, ensure the data in the CSV to import is different from the data currently stored in the collection. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importAccountCollection(collectionId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="importAllowedList"></a>
# **importAllowedList**
> ModelImport importAllowedList(attributeId, upFile)

Import allowed values for attribute

Upload a CSV file containing a list of [picklist values](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes#picklist-values) for the specified attribute.  The file should be sent as multipart data.  The import **replaces** the previous list of allowed values for this attribute, if any.  The CSV file **must** only contain the following column: - &#x60;item&#x60; (required): the values in your allowed list, for example a list of SKU&#39;s.  An allowed list is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60;text item CS-VG-04032021-UP-50D-10 CS-DV-04042021-UP-49D-12 CS-DG-02082021-UP-50G-07 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long attributeId = 56L; // Long | The ID of the attribute. You can find the ID in the Campaign Manager's URL when you display the details of an attribute in **Account** > **Tools** > **Attributes**.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importAllowedList(attributeId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importAllowedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributeId** | **Long**| The ID of the attribute. You can find the ID in the Campaign Manager&#39;s URL when you display the details of an attribute in **Account** &gt; **Tools** &gt; **Attributes**. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="importAudiencesMemberships"></a>
# **importAudiencesMemberships**
> ModelImport importAudiencesMemberships(audienceId, upFile)

Import audience members

Upload a CSV file containing the integration IDs of the members you want to add to an audience.  The file should be sent as multipart data and should contain only the following column (required): - &#x60;profileintegrationid&#x60;: The integration ID of the customer profile.  The import **replaces** the previous list of audience members.  **Note:** We recommend limiting your file size to 500MB.  Example:  &#x60;&#x60;&#x60;text profileintegrationid charles alexa &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long audienceId = 56L; // Long | The ID of the audience.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importAudiencesMemberships(audienceId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importAudiencesMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceId** | **Long**| The ID of the audience. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="importCampaignStoreBudget"></a>
# **importCampaignStoreBudget**
> ModelImport importCampaignStoreBudget(applicationId, campaignId, action, period, upFile)

Import campaign store budgets

Upload a CSV file containing store budgets for a given campaign.  Send the file as multipart data.  The CSV file **must** only contain the following columns: - &#x60;store_integration_id&#x60;: The identifier of the store. - &#x60;limit&#x60;: The budget limit for the store.  The import **replaces** the previous list of store budgets. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String action = "setDiscount"; // String | The action that this budget is limiting.
    String period = "overall"; // String | The period to which the limit applies.  **Note**: For budgets with no period, set this to `overall`. 
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importCampaignStoreBudget(applicationId, campaignId, action, period, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCampaignStoreBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **action** | **String**| The action that this budget is limiting. | [optional] [enum: setDiscount] |
| **period** | **String**| The period to which the limit applies.  **Note**: For budgets with no period, set this to &#x60;overall&#x60;.  | [optional] [enum: overall, daily, weekly, monthly, yearly] |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |

<a id="importCampaignStores"></a>
# **importCampaignStores**
> ModelImport importCampaignStores(applicationId, campaignId, upFile)

Import stores

Upload a CSV file containing the stores you want to link to a specific campaign.  Send the file as multipart data.  The CSV file **must** only contain the following column: - &#x60;store_integration_id&#x60;: The identifier of the store.  The import **replaces** the previous list of stores linked to the campaign. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importCampaignStores(applicationId, campaignId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCampaignStores");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="importCollection"></a>
# **importCollection**
> ModelImport importCollection(applicationId, campaignId, collectionId, upFile)

Import data into existing campaign-level collection

Upload a CSV file containing the collection of string values that should be attached as payload for collection. The file should be sent as multipart data.  The import **replaces** the initial content of the collection.  The CSV file **must** only contain the following column:  - &#x60;item&#x60;: the values in your collection.  A collection is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60; item Addidas Nike Asics &#x60;&#x60;&#x60;  **Note:** Before sending a request to this endpoint, ensure the data in the CSV to import is different from the data currently stored in the collection. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importCollection(applicationId, campaignId, collectionId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

<a id="importCoupons"></a>
# **importCoupons**
> ModelImport importCoupons(applicationId, campaignId, skipDuplicates, upFile)

Import coupons

Upload a CSV file containing the coupons that should be created. The file should be sent as multipart data.  The CSV file contains the following columns:  - &#x60;value&#x60; (required): The coupon code. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;recipientintegrationid&#x60;: The integration ID of the recipient of the coupon.   Only the customer with this integration ID can redeem this code. Available only for personal codes. - &#x60;limitval&#x60;: The maximum number of redemptions of this code. For unlimited redemptions, use &#x60;0&#x60;. Defaults to &#x60;1&#x60; when not provided. - &#x60;discountlimit&#x60;: The total discount value that the code can give. This is typically used to represent a gift card value. - &#x60;attributes&#x60;: A JSON object describing _custom_ coupon attribute names and their values, enclosed with double quotation marks.    For example, if you created a [custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;category&#x60; associated with the coupon entity, the object in the CSV file, when opened in a text editor, must be: &#x60;\&quot;{\&quot;category\&quot;: \&quot;10_off\&quot;}\&quot;&#x60;.  You can use the time zone of your choice. It is converted to UTC internally by Talon.One.  **Note:** We recommend limiting your file size to 500MB.  **Example:**  &#x60;&#x60;&#x60;text \&quot;value\&quot;,\&quot;expirydate\&quot;,\&quot;startdate\&quot;,\&quot;recipientintegrationid\&quot;,\&quot;limitval\&quot;,\&quot;attributes\&quot;,\&quot;discountlimit\&quot; COUP1,2018-07-01T04:00:00Z,2018-05-01T04:00:00Z,cust123,1,\&quot;{\&quot;\&quot;Category\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot;,2.4 &#x60;&#x60;&#x60;  Once imported, you can find the &#x60;batchId&#x60; in the Campaign Manager or by using [List coupons](#tag/Coupons/operation/getCouponsWithoutTotalCount). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Boolean skipDuplicates = true; // Boolean | An indicator of whether to skip duplicate coupon values instead of causing an error. Duplicate values are ignored when `skipDuplicates=true`. 
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importCoupons(applicationId, campaignId, skipDuplicates, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **skipDuplicates** | **Boolean**| An indicator of whether to skip duplicate coupon values instead of causing an error. Duplicate values are ignored when &#x60;skipDuplicates&#x3D;true&#x60;.  | [optional] |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="importLoyaltyCards"></a>
# **importLoyaltyCards**
> ModelImport importLoyaltyCards(loyaltyProgramId, upFile)

Import loyalty cards

Upload a CSV file containing the loyalty cards that you want to use in your card-based loyalty program. Send the file as multipart data.  It contains the following columns for each card:  - &#x60;identifier&#x60; (required): The alphanumeric identifier of the loyalty card. - &#x60;state&#x60; (required): The state of the loyalty card. It can be &#x60;active&#x60; or &#x60;inactive&#x60;. - &#x60;customerprofileids&#x60; (optional): An array of strings representing the identifiers of the customer profiles linked to the loyalty card. The identifiers should be separated with a semicolon (;).  **Note:** We recommend limiting your file size to 500MB.  **Example:**  &#x60;&#x60;&#x60;csv identifier,state,customerprofileids 123-456-789AT,active,Alexa001;UserA &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importLoyaltyCards(loyaltyProgramId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importLoyaltyCards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="importLoyaltyCustomersTiers"></a>
# **importLoyaltyCustomersTiers**
> ModelImport importLoyaltyCustomersTiers(loyaltyProgramId, upFile)

Import customers into loyalty tiers

Upload a CSV file containing existing customers to be assigned to existing tiers. Send the file as multipart data.  **Important:** This endpoint only works with loyalty programs with advanced tiers (with expiration and downgrade policy) feature enabled.  The CSV file should contain the following columns: - &#x60;subledgerid&#x60; (optional): The ID of the subledger. If this field is empty, the main ledger will be used. - &#x60;customerprofileid&#x60;: The integration ID of the customer profile to whom the tier should be assigned. - &#x60;tiername&#x60;: The name of an existing tier to assign to the customer. - &#x60;expirydate&#x60;: The expiration date of the tier when the tier is reevaluated. It should be a future date.  About customer assignment to a tier: - If the customer isn&#39;t already in a tier, the customer is assigned to the specified tier during the tier import. - If the customer is already in the tier that&#39;s specified in the CSV file, only the expiration date is updated.  **Note:** We recommend not using this endpoint to update the tier of a customer. To update a customer&#39;s tier, you can [add](/management-api#tag/Loyalty/operation/addLoyaltyPoints) or [deduct](/management-api#tag/Loyalty/operation/removeLoyaltyPoints) their loyalty points.  You can use the time zone of your choice. It is converted to UTC internally by Talon.One.  **Note:** We recommend limiting your file size to 500MB.  **Example:** &#x60;&#x60;&#x60;csv subledgerid,customerprofileid,tiername,expirydate SUB1,alexa,Gold,2024-03-21T07:32:14Z ,george,Silver,2025-04-16T21:12:37Z SUB2,avocado,Bronze,2026-05-03T11:47:01Z &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importLoyaltyCustomersTiers(loyaltyProgramId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importLoyaltyCustomersTiers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="importLoyaltyPoints"></a>
# **importLoyaltyPoints**
> ModelImport importLoyaltyPoints(loyaltyProgramId, notificationsEnabled, upFile)

Import loyalty points

Upload a CSV file containing the loyalty points you want to import into a given loyalty program. Send the file as multipart data.  Depending on the type of loyalty program, you can import points into a given customer profile or loyalty card.  The CSV file contains the following columns:  - &#x60;customerprofileid&#x60; (optional): For profile-based loyalty programs, the integration ID of the customer profile where the loyalty points are imported.    **Note**: If the customer profile does not exist, it will be created. The profile will not be visible in any Application   until a session or profile update is received for that profile. - &#x60;identifier&#x60; (optional): For card-based loyalty programs, the identifier of the loyalty card where the loyalty points are imported. - &#x60;amount&#x60;: The amount of points to award to the customer profile. - &#x60;startdate&#x60; (optional): The earliest date when the points can be redeemed. The points are &#x60;active&#x60; from this date until the expiration date.    **Note**: It must be an RFC3339 timestamp string or string &#x60;immediate&#x60;. Empty or missing values are considered &#x60;immediate&#x60;. - &#x60;expirydate&#x60; (optional): The latest date when the points can be redeemed. The points are &#x60;expired&#x60; after this date.    **Note**: It must be an RFC3339 timestamp string or string &#x60;unlimited&#x60;. Empty or missing values are considered &#x60;unlimited&#x60;. - &#x60;subledgerid&#x60; (optional): The ID of the subledger that should received the points. - &#x60;reason&#x60; (optional): The reason why these points are awarded.  You can use the time zone of your choice. It is converted to UTC internally by Talon.One.  **Note:** For existing customer profiles and loyalty cards, the imported points are added to any previous active or pending points, depending on the value provided for &#x60;startdate&#x60;. If &#x60;startdate&#x60; matches the current date, the imported points are _active_. If it is later, the points are _pending_ until the date provided for &#x60;startdate&#x60; is reached.  **Note:** We recommend limiting your file size to 500MB.  **Example for profile-based programs:**  &#x60;&#x60;&#x60;text customerprofileid,amount,startdate,expirydate,subledgerid,reason URNGV8294NV,100,2009-11-10T23:00:00Z,2009-11-11T23:00:00Z,subledger1,appeasement &#x60;&#x60;&#x60;  **Example for card-based programs:**  &#x60;&#x60;&#x60;text identifier,amount,startdate,expirydate,subledgerid,reason summer-loyalty-card-0543,100,2009-11-10T23:00:00Z,2009-11-11T23:00:00Z,subledger1,appeasement &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    Boolean notificationsEnabled = true; // Boolean | Indicates whether the points import triggers notifications about its effects. For example, a notification is sent if the import upgrades a customer's tier or offsets their negative points balance.  This parameter is optional and defaults to `true`. 
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importLoyaltyPoints(loyaltyProgramId, notificationsEnabled, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **notificationsEnabled** | **Boolean**| Indicates whether the points import triggers notifications about its effects. For example, a notification is sent if the import upgrades a customer&#39;s tier or offsets their negative points balance.  This parameter is optional and defaults to &#x60;true&#x60;.  | [optional] |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="importPoolGiveaways"></a>
# **importPoolGiveaways**
> ModelImport importPoolGiveaways(poolId, upFile)

Import giveaway codes into a giveaway pool

Upload a CSV file containing the giveaway codes that should be created. Send the file as multipart data.  The CSV file contains the following columns: - &#x60;code&#x60; (required): The code of your giveaway, for instance, a gift card redemption code. - &#x60;startdate&#x60;:  The start date in RFC3339 of the code redemption period. - &#x60;enddate&#x60;: The last date in RFC3339 of the code redemption period. - &#x60;attributes&#x60;: A JSON object describing _custom_ giveaway attribute names and their values, enclosed with double quotation marks.    For example, if you created a [custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;provider&#x60; associated with the giveaway entity, the object in the CSV file, when opened in a text editor, must be: &#x60;\&quot;{\&quot;provider\&quot;: \&quot;myPartnerCompany\&quot;}\&quot;&#x60;.  The &#x60;startdate&#x60; and &#x60;enddate&#x60; have nothing to do with the _validity_ of the codes. They are only used by the Rule Engine to award the codes or not. You can use the time zone setting of your choice. The values are converted to UTC internally by Talon.One.  **Note:**  - We recommend limiting your file size to 500MB. - You can import the same code multiple times. Duplicate codes are treated and distributed to customers as unique codes.  **Example:**  &#x60;&#x60;&#x60;text code,startdate,enddate,attributes GIVEAWAY1,2020-11-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Amazon\&quot;\&quot;}\&quot; GIVEAWAY2,2020-11-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Amazon\&quot;\&quot;}\&quot; GIVEAWAY3,2021-01-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Aliexpress\&quot;\&quot;}\&quot; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long poolId = 56L; // Long | The ID of the pool. You can find it in the Campaign Manager, in the **Giveaways** section.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importPoolGiveaways(poolId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importPoolGiveaways");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolId** | **Long**| The ID of the pool. You can find it in the Campaign Manager, in the **Giveaways** section. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="importReferrals"></a>
# **importReferrals**
> ModelImport importReferrals(applicationId, campaignId, upFile)

Import referrals

Upload a CSV file containing the referrals that should be created. The file should be sent as multipart data.  The CSV file contains the following columns:  - &#x60;code&#x60; (required): The referral code. - &#x60;advocateprofileintegrationid&#x60; (required): The profile ID of the advocate. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;limitval&#x60;: The maximum number of redemptions of this code. Defaults to &#x60;1&#x60; when left blank. - &#x60;attributes&#x60;: A JSON object describing _custom_ referral attribute names and their values, enclosed with double quotation marks.    For example, if you created a [custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;category&#x60; associated with the referral entity, the object in the CSV file, when opened in a text editor, must be: &#x60;\&quot;{\&quot;category\&quot;: \&quot;10_off\&quot;}\&quot;&#x60;.  You can use the time zone of your choice. It is converted to UTC internally by Talon.One.  **Important:** When you import a CSV file with referrals, a [customer profile](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles) is **not** automatically created for each &#x60;advocateprofileintegrationid&#x60; column value. Use the [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint or the [Update multiple customer profiles](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfilesV2) endpoint to create the customer profiles.  **Note:** We recommend limiting your file size to 500MB.  **Example:**  &#x60;&#x60;&#x60;text code,startdate,expirydate,advocateprofileintegrationid,limitval,attributes REFERRAL_CODE1,2020-11-10T23:00:00Z,2021-11-11T23:00:00Z,integid_4,1,\&quot;{\&quot;\&quot;my_attribute\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot; REFERRAL_CODE2,2020-11-10T23:00:00Z,2021-11-11T23:00:00Z,integid1,1,\&quot;{\&quot;\&quot;my_attribute\&quot;\&quot;: \&quot;\&quot;20_off\&quot;\&quot;}\&quot; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String upFile = "upFile_example"; // String | The file containing the data that is being imported.
    try {
      ModelImport result = apiInstance.importReferrals(applicationId, campaignId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importReferrals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **upFile** | **String**| The file containing the data that is being imported. | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="inviteUserExternal"></a>
# **inviteUserExternal**
> inviteUserExternal(newExternalInvitation)

Invite user from identity provider

[Invite a user](https://docs.talon.one/docs/product/account/account-settings/managing-users#inviting-a-user) from an external identity provider to Talon.One by sending an invitation to their email address. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewExternalInvitation newExternalInvitation = new NewExternalInvitation(); // NewExternalInvitation | body
    try {
      apiInstance.inviteUserExternal(newExternalInvitation);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#inviteUserExternal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newExternalInvitation** | [**NewExternalInvitation**](NewExternalInvitation.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Invitation email sent |  -  |

<a id="listAccountCollections"></a>
# **listAccountCollections**
> ListAccountCollections200Response listAccountCollections(pageSize, skip, sort, withTotalResultSize, name)

List collections in account

List account-level collections in the account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by collection name.
    try {
      ListAccountCollections200Response result = apiInstance.listAccountCollections(pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listAccountCollections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **name** | **String**| Filter by collection name. | [optional] |

### Return type

[**ListAccountCollections200Response**](ListAccountCollections200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="listAchievements"></a>
# **listAchievements**
> ListAchievements200Response listAchievements(applicationId, campaignId, pageSize, skip, title)

List achievements

List all the achievements for a specific campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long pageSize = 50L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String title = "title_example"; // String | Filter by the display name for the achievement in the campaign manager.  **Note**: If no `title` is provided, all the achievements from the campaign are returned. 
    try {
      ListAchievements200Response result = apiInstance.listAchievements(applicationId, campaignId, pageSize, skip, title);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listAchievements");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **title** | **String**| Filter by the display name for the achievement in the campaign manager.  **Note**: If no &#x60;title&#x60; is provided, all the achievements from the campaign are returned.  | [optional] |

### Return type

[**ListAchievements200Response**](ListAchievements200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listAllRolesV2"></a>
# **listAllRolesV2**
> ListAllRolesV2200Response listAllRolesV2()

List roles

List all roles.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ListAllRolesV2200Response result = apiInstance.listAllRolesV2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listAllRolesV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListAllRolesV2200Response**](ListAllRolesV2200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCampaignStoreBudgetLimits"></a>
# **listCampaignStoreBudgetLimits**
> ListCampaignStoreBudgetLimits200Response listCampaignStoreBudgetLimits(applicationId, campaignId, action, period)

List campaign store budget limits

Return the store budget limits for a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String action = "setDiscount"; // String | The action that this budget is limiting.
    String period = "overall"; // String | The period to which the limit applies.  **Note**: For budgets with no period, set this to `overall`. 
    try {
      ListCampaignStoreBudgetLimits200Response result = apiInstance.listCampaignStoreBudgetLimits(applicationId, campaignId, action, period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCampaignStoreBudgetLimits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **action** | **String**| The action that this budget is limiting. | [optional] [enum: setDiscount] |
| **period** | **String**| The period to which the limit applies.  **Note**: For budgets with no period, set this to &#x60;overall&#x60;.  | [optional] [enum: overall, daily, weekly, monthly, yearly] |

### Return type

[**ListCampaignStoreBudgetLimits200Response**](ListCampaignStoreBudgetLimits200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="listCatalogItems"></a>
# **listCatalogItems**
> ListCatalogItems200Response listCatalogItems(catalogId, pageSize, skip, withTotalResultSize, sku, productNames)

List items in a catalog

Return a paginated list of cart items in the given catalog. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long catalogId = 56L; // Long | The ID of the catalog. You can find the ID in the Campaign Manager in **Account** > **Tools** > **Cart item catalogs**.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    List<String> sku = Arrays.asList(); // List<String> | Filter results by one or more SKUs. Must be exact match.
    List<String> productNames = Arrays.asList(); // List<String> | Filter results by one or more product names. Must be exact match.
    try {
      ListCatalogItems200Response result = apiInstance.listCatalogItems(catalogId, pageSize, skip, withTotalResultSize, sku, productNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCatalogItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Long**| The ID of the catalog. You can find the ID in the Campaign Manager in **Account** &gt; **Tools** &gt; **Cart item catalogs**. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **sku** | [**List&lt;String&gt;**](String.md)| Filter results by one or more SKUs. Must be exact match. | [optional] |
| **productNames** | [**List&lt;String&gt;**](String.md)| Filter results by one or more product names. Must be exact match. | [optional] |

### Return type

[**ListCatalogItems200Response**](ListCatalogItems200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCollections"></a>
# **listCollections**
> ListAccountCollections200Response listCollections(applicationId, campaignId, pageSize, skip, sort, withTotalResultSize, name)

List collections in campaign

List collections in a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by collection name.
    try {
      ListAccountCollections200Response result = apiInstance.listCollections(applicationId, campaignId, pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCollections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **name** | **String**| Filter by collection name. | [optional] |

### Return type

[**ListAccountCollections200Response**](ListAccountCollections200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="listCollectionsInApplication"></a>
# **listCollectionsInApplication**
> ListAccountCollections200Response listCollectionsInApplication(applicationId, pageSize, skip, sort, withTotalResultSize, name)

List collections in Application

List campaign-level collections from all campaigns in a given Application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by collection name.
    try {
      ListAccountCollections200Response result = apiInstance.listCollectionsInApplication(applicationId, pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCollectionsInApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **name** | **String**| Filter by collection name. | [optional] |

### Return type

[**ListAccountCollections200Response**](ListAccountCollections200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="listStores"></a>
# **listStores**
> ListStores200Response listStores(applicationId, pageSize, skip, sort, withTotalResultSize, campaignId, name, integrationId, query)

List stores

List all stores for a specific Application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    BigDecimal campaignId = new BigDecimal(78); // BigDecimal | Filter results by campaign ID.
    String name = "name_example"; // String | The name of the store.
    String integrationId = "integrationId_example"; // String | The integration ID of the store.
    String query = "query_example"; // String | Filter results by `name` or `integrationId`.
    try {
      ListStores200Response result = apiInstance.listStores(applicationId, pageSize, skip, sort, withTotalResultSize, campaignId, name, integrationId, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listStores");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional] |
| **campaignId** | **BigDecimal**| Filter results by campaign ID. | [optional] |
| **name** | **String**| The name of the store. | [optional] |
| **integrationId** | **String**| The integration ID of the store. | [optional] |
| **query** | **String**| Filter results by &#x60;name&#x60; or &#x60;integrationId&#x60;. | [optional] |

### Return type

[**ListStores200Response**](ListStores200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="oktaEventHandlerChallenge"></a>
# **oktaEventHandlerChallenge**
> oktaEventHandlerChallenge()

Validate Okta API ownership

Validate the ownership of the API through a challenge-response mechanism.  This challenger endpoint is used by Okta to confirm that communication between Talon.One and Okta is correctly configured and accessible for provisioning and deprovisioning of Talon.One users, and that only Talon.One can receive and respond to events from Okta. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      apiInstance.oktaEventHandlerChallenge();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#oktaEventHandlerChallenge");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeLoyaltyPoints"></a>
# **removeLoyaltyPoints**
> removeLoyaltyPoints(loyaltyProgramId, integrationId, deductLoyaltyPoints)

Deduct points from customer profile

Deduct points from the specified loyalty program and specified customer profile.  **Important:** - Only active points can be deducted. - Only pending points are rolled back when a session is cancelled or reopened.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
    DeductLoyaltyPoints deductLoyaltyPoints = new DeductLoyaltyPoints(); // DeductLoyaltyPoints | body
    try {
      apiInstance.removeLoyaltyPoints(loyaltyProgramId, integrationId, deductLoyaltyPoints);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#removeLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **String**| The identifier for the loyalty program. | |
| **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  | |
| **deductLoyaltyPoints** | [**DeductLoyaltyPoints**](DeductLoyaltyPoints.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="resetPassword"></a>
# **resetPassword**
> NewPassword resetPassword(newPassword)

Reset password

Consumes the supplied password reset token and updates the password for the associated account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewPassword newPassword = new NewPassword(); // NewPassword | body
    try {
      NewPassword result = apiInstance.resetPassword(newPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#resetPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newPassword** | [**NewPassword**](NewPassword.md)| body | |

### Return type

[**NewPassword**](NewPassword.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Created |  -  |

<a id="scimCreateGroup"></a>
# **scimCreateGroup**
> ScimGroup scimCreateGroup(scimBaseGroup)

Create SCIM group

Create a new Talon.One group using the SCIM Group provisioning protocol with an identity provider, for example, Microsoft Entra ID, and assign members from the payload to the new group. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ScimBaseGroup scimBaseGroup = new ScimBaseGroup(); // ScimBaseGroup | body
    try {
      ScimGroup result = apiInstance.scimCreateGroup(scimBaseGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimCreateGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scimBaseGroup** | [**ScimBaseGroup**](ScimBaseGroup.md)| body | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="scimCreateUser"></a>
# **scimCreateUser**
> ScimUser scimCreateUser(scimNewUser)

Create SCIM user

Create a new Talon.One user using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ScimNewUser scimNewUser = new ScimNewUser(); // ScimNewUser | body
    try {
      ScimUser result = apiInstance.scimCreateUser(scimNewUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimCreateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scimNewUser** | [**ScimNewUser**](ScimNewUser.md)| body | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="scimDeleteGroup"></a>
# **scimDeleteGroup**
> scimDeleteGroup(groupId)

Delete SCIM group

Delete a specific group created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long groupId = 56L; // Long | The ID of the group.
    try {
      apiInstance.scimDeleteGroup(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimDeleteGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Long**| The ID of the group. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="scimDeleteUser"></a>
# **scimDeleteUser**
> scimDeleteUser(userId)

Delete SCIM user

Delete a specific Talon.One user created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    try {
      apiInstance.scimDeleteUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimDeleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="scimGetGroup"></a>
# **scimGetGroup**
> ScimGroup scimGetGroup(groupId)

Get SCIM group

Retrieve data for a specific group created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long groupId = 56L; // Long | The ID of the group.
    try {
      ScimGroup result = apiInstance.scimGetGroup(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Long**| The ID of the group. | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group details |  -  |

<a id="scimGetGroups"></a>
# **scimGetGroups**
> ScimGroupsListResponse scimGetGroups()

List SCIM groups

Retrieve a paginated list of groups created using the SCIM protocol with an identity provider, for example, Microsoft Entra ID. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ScimGroupsListResponse result = apiInstance.scimGetGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimGroupsListResponse**](ScimGroupsListResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of SCIM groups |  -  |

<a id="scimGetResourceTypes"></a>
# **scimGetResourceTypes**
> ScimResourceTypesListResponse scimGetResourceTypes()

List supported SCIM resource types

Retrieve a list of resource types supported by the SCIM provisioning protocol.  Resource types define the various kinds of resources that can be managed via the SCIM API, such as users, groups, or custom-defined resources. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ScimResourceTypesListResponse result = apiInstance.scimGetResourceTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetResourceTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimResourceTypesListResponse**](ScimResourceTypesListResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of resource types |  -  |

<a id="scimGetSchemas"></a>
# **scimGetSchemas**
> ScimSchemasListResponse scimGetSchemas()

List supported SCIM schemas

Retrieve a list of schemas supported by the SCIM provisioning protocol.  Schemas define the structure and attributes of the different resources that can be managed via the SCIM API, such as users, groups, and any custom-defined resources. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ScimSchemasListResponse result = apiInstance.scimGetSchemas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetSchemas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimSchemasListResponse**](ScimSchemasListResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of schemas supported by the SCIM provisioning protocol |  -  |

<a id="scimGetServiceProviderConfig"></a>
# **scimGetServiceProviderConfig**
> ScimServiceProviderConfigResponse scimGetServiceProviderConfig()

Get SCIM service provider configuration

Retrieve the configuration settings of the SCIM service provider. It provides details about the features and capabilities supported by the SCIM API, such as the different operation settings. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ScimServiceProviderConfigResponse result = apiInstance.scimGetServiceProviderConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetServiceProviderConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimServiceProviderConfigResponse**](ScimServiceProviderConfigResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service configuration |  -  |

<a id="scimGetUser"></a>
# **scimGetUser**
> ScimUser scimGetUser(userId)

Get SCIM user

Retrieve data for a specific Talon.One user created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    try {
      ScimUser result = apiInstance.scimGetUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User details |  -  |

<a id="scimGetUsers"></a>
# **scimGetUsers**
> ScimUsersListResponse scimGetUsers()

List SCIM users

Retrieve a paginated list of users that have been provisioned using the SCIM protocol with an identity provider, for example, Microsoft Entra ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ScimUsersListResponse result = apiInstance.scimGetUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimGetUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimUsersListResponse**](ScimUsersListResponse.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of SCIM users |  -  |

<a id="scimPatchGroup"></a>
# **scimPatchGroup**
> ScimGroup scimPatchGroup(groupId, scimPatchRequest)

Update SCIM group attributes

Update certain attributes of a group created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID. This endpoint allows for selective adding, removing, or replacing of specific group attributes while other attributes remain unchanged. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long groupId = 56L; // Long | The ID of the group.
    ScimPatchRequest scimPatchRequest = new ScimPatchRequest(); // ScimPatchRequest | body
    try {
      ScimGroup result = apiInstance.scimPatchGroup(groupId, scimPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimPatchGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Long**| The ID of the group. | |
| **scimPatchRequest** | [**ScimPatchRequest**](ScimPatchRequest.md)| body | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group details |  -  |

<a id="scimPatchUser"></a>
# **scimPatchUser**
> ScimUser scimPatchUser(userId, scimPatchRequest)

Update SCIM user attributes

Update certain attributes of a specific Talon.One user created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID.  This endpoint allows for selective adding, removing, or replacing specific attributes while leaving other attributes unchanged. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    ScimPatchRequest scimPatchRequest = new ScimPatchRequest(); // ScimPatchRequest | body
    try {
      ScimUser result = apiInstance.scimPatchUser(userId, scimPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimPatchUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |
| **scimPatchRequest** | [**ScimPatchRequest**](ScimPatchRequest.md)| body | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User details |  -  |

<a id="scimReplaceGroupAttributes"></a>
# **scimReplaceGroupAttributes**
> ScimGroup scimReplaceGroupAttributes(groupId, scimBaseGroup)

Update SCIM group

Update the details of a specific group created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID. This endpoint replaces all attributes of the given group with the attributes provided in the request payload. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long groupId = 56L; // Long | The ID of the group.
    ScimBaseGroup scimBaseGroup = new ScimBaseGroup(); // ScimBaseGroup | body
    try {
      ScimGroup result = apiInstance.scimReplaceGroupAttributes(groupId, scimBaseGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimReplaceGroupAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Long**| The ID of the group. | |
| **scimBaseGroup** | [**ScimBaseGroup**](ScimBaseGroup.md)| body | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group details |  -  |

<a id="scimReplaceUserAttributes"></a>
# **scimReplaceUserAttributes**
> ScimUser scimReplaceUserAttributes(userId, scimNewUser)

Update SCIM user

Update the details of a specific Talon.One user created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID.  This endpoint replaces all attributes of the specific user with the attributes provided in the request payload. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    ScimNewUser scimNewUser = new ScimNewUser(); // ScimNewUser | body
    try {
      ScimUser result = apiInstance.scimReplaceUserAttributes(userId, scimNewUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#scimReplaceUserAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |
| **scimNewUser** | [**ScimNewUser**](ScimNewUser.md)| body | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User details |  -  |

<a id="searchCouponsAdvancedApplicationWideWithoutTotalCount"></a>
# **searchCouponsAdvancedApplicationWideWithoutTotalCount**
> GetCouponsWithoutTotalCount200Response searchCouponsAdvancedApplicationWideWithoutTotalCount(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState)

List coupons that match the given attributes (without total count)

List the coupons whose attributes match the query criteria in all the campaigns of the given Application.  The match is successful if all the attributes of the request are found in a coupon, even if the coupon has more attributes that are not present on the request.  **Note:** The total count is not included in the response. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Object body = null; // Object | body
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "true"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Long referralId = 56L; // Long | Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile ID specified in the coupon's RecipientIntegrationId field.
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code.
    String campaignState = "enabled"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. 
    try {
      GetCouponsWithoutTotalCount200Response result = apiInstance.searchCouponsAdvancedApplicationWideWithoutTotalCount(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvancedApplicationWideWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **body** | **Object**| body | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false] |
| **referralId** | **Long**| Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code. | [optional] |
| **recipientIntegrationId** | **String**| Filter results by match with a profile ID specified in the coupon&#39;s RecipientIntegrationId field. | [optional] |
| **batchId** | **String**| Filter results by batches of coupons | [optional] |
| **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code. | [optional] [default to false] |
| **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived.  | [optional] [enum: enabled, disabled, archived, scheduled, running, expired, staged] |

### Return type

[**GetCouponsWithoutTotalCount200Response**](GetCouponsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchCouponsAdvancedWithoutTotalCount"></a>
# **searchCouponsAdvancedWithoutTotalCount**
> GetCouponsWithoutTotalCount200Response searchCouponsAdvancedWithoutTotalCount(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId)

List coupons that match the given attributes in campaign (without total count)

List the coupons whose attributes match the query criteria in the given campaign.  The match is successful if all the attributes of the request are found in a coupon, even if the coupon has more attributes that are not present on the request.  **Note:** The total count is not included in the response. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Object body = null; // Object | body
    Long pageSize = 1000L; // Long | The number of items in the response.
    Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations. 
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally.
    String valid = "expired"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "true"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Long referralId = 56L; // Long | Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile ID specified in the coupon's RecipientIntegrationId field.
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code.
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    try {
      GetCouponsWithoutTotalCount200Response result = apiInstance.searchCouponsAdvancedWithoutTotalCount(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvancedWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **body** | **Object**| body | |
| **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000] |
| **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional] |
| **sort** | **String**| The field by which results should be sorted. By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You may not be able to use all fields for sorting. This is due to performance limitations.  | [optional] |
| **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional] |
| **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any time zone setting. Talon.One will convert to UTC internally. | [optional] |
| **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiration date is set and in the past. The second matches coupons in which start date is null or in the past and expiration date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture] |
| **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false] |
| **referralId** | **Long**| Filter the results by matching them with the ID of a referral. This filter shows the coupons created by redeeming a referral code. | [optional] |
| **recipientIntegrationId** | **String**| Filter results by match with a profile ID specified in the coupon&#39;s RecipientIntegrationId field. | [optional] |
| **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code. | [optional] [default to false] |
| **batchId** | **String**| Filter results by batches of coupons | [optional] |

### Return type

[**GetCouponsWithoutTotalCount200Response**](GetCouponsWithoutTotalCount200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="summarizeCampaignStoreBudget"></a>
# **summarizeCampaignStoreBudget**
> SummarizeCampaignStoreBudget200Response summarizeCampaignStoreBudget(applicationId, campaignId)

Get summary of campaign store budgets

Fetch a summary of all store budget information for a given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      SummarizeCampaignStoreBudget200Response result = apiInstance.summarizeCampaignStoreBudget(applicationId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#summarizeCampaignStoreBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |

### Return type

[**SummarizeCampaignStoreBudget200Response**](SummarizeCampaignStoreBudget200Response.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |

<a id="transferLoyaltyCard"></a>
# **transferLoyaltyCard**
> transferLoyaltyCard(loyaltyProgramId, loyaltyCardId, transferLoyaltyCard)

Transfer card data

Transfer loyalty card data, such as linked customers, loyalty balances and transactions, from a given loyalty card to a new, automatically created loyalty card.  **Important:**  - The original card is automatically blocked once the new card is created, and it cannot be activated again. - The default status of the new card is _active_. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    TransferLoyaltyCard transferLoyaltyCard = new TransferLoyaltyCard(); // TransferLoyaltyCard | body
    try {
      apiInstance.transferLoyaltyCard(loyaltyProgramId, loyaltyCardId, transferLoyaltyCard);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#transferLoyaltyCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **transferLoyaltyCard** | [**TransferLoyaltyCard**](TransferLoyaltyCard.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="updateAccountCollection"></a>
# **updateAccountCollection**
> Collection updateAccountCollection(collectionId, updateCollection)

Update account-level collection

Edit the description of a given account-level collection and enable or disable the collection in the specified Applications.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint.
    UpdateCollection updateCollection = new UpdateCollection(); // UpdateCollection | body
    try {
      Collection result = apiInstance.updateAccountCollection(collectionId, updateCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in account](#operation/listAccountCollections) endpoint. | |
| **updateCollection** | [**UpdateCollection**](UpdateCollection.md)| body | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **409** | Conflict. A collection with this name already exists. |  -  |

<a id="updateAchievement"></a>
# **updateAchievement**
> Achievement updateAchievement(applicationId, campaignId, achievementId, updateAchievement)

Update achievement

Update the details of a specific achievement.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long achievementId = 56L; // Long | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint.
    UpdateAchievement updateAchievement = new UpdateAchievement(); // UpdateAchievement | body
    try {
      Achievement result = apiInstance.updateAchievement(applicationId, campaignId, achievementId, updateAchievement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAchievement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **achievementId** | **Long**| The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievements) endpoint. | |
| **updateAchievement** | [**UpdateAchievement**](UpdateAchievement.md)| body | |

### Return type

[**Achievement**](Achievement.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="updateAdditionalCost"></a>
# **updateAdditionalCost**
> AccountAdditionalCost updateAdditionalCost(additionalCostId, newAdditionalCost)

Update additional cost

Updates an existing additional cost. Once created, the only property of an additional cost that cannot be changed is the &#x60;name&#x60; property (or **API name** in the Campaign Manager). This restriction is in place to prevent accidentally breaking live integrations. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long additionalCostId = 56L; // Long | The ID of the additional cost. You can find the ID the the Campaign Manager's URL when you display the details of the cost in **Account** > **Tools** > **Additional costs**. 
    NewAdditionalCost newAdditionalCost = new NewAdditionalCost(); // NewAdditionalCost | body
    try {
      AccountAdditionalCost result = apiInstance.updateAdditionalCost(additionalCostId, newAdditionalCost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **additionalCostId** | **Long**| The ID of the additional cost. You can find the ID the the Campaign Manager&#39;s URL when you display the details of the cost in **Account** &gt; **Tools** &gt; **Additional costs**.  | |
| **newAdditionalCost** | [**NewAdditionalCost**](NewAdditionalCost.md)| body | |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAttribute"></a>
# **updateAttribute**
> Attribute updateAttribute(attributeId, newAttribute)

Update custom attribute

Update an existing custom attribute. Once created, the only property of a custom attribute that can be changed is the description.  To change the &#x60;type&#x60; or &#x60;name&#x60; property of a custom attribute, create a new attribute and update any relevant integrations and rules to use the new attribute. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long attributeId = 56L; // Long | The ID of the attribute. You can find the ID in the Campaign Manager's URL when you display the details of an attribute in **Account** > **Tools** > **Attributes**.
    NewAttribute newAttribute = new NewAttribute(); // NewAttribute | body
    try {
      Attribute result = apiInstance.updateAttribute(attributeId, newAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributeId** | **Long**| The ID of the attribute. You can find the ID in the Campaign Manager&#39;s URL when you display the details of an attribute in **Account** &gt; **Tools** &gt; **Attributes**. | |
| **newAttribute** | [**NewAttribute**](NewAttribute.md)| body | |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCampaign"></a>
# **updateCampaign**
> Campaign updateCampaign(applicationId, campaignId, updateCampaign)

Update campaign

Update the given campaign.  **Important:** You cannot use this endpoint to update campaigns if [campaign staging and revisions](https://docs.talon.one/docs/product/applications/managing-general-settings#campaign-staging-and-revisions) is enabled for your Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    UpdateCampaign updateCampaign = new UpdateCampaign(); // UpdateCampaign | body
    try {
      Campaign result = apiInstance.updateCampaign(applicationId, campaignId, updateCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **updateCampaign** | [**UpdateCampaign**](UpdateCampaign.md)| body | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCollection"></a>
# **updateCollection**
> Collection updateCollection(applicationId, campaignId, collectionId, updateCampaignCollection)

Update campaign-level collection&#39;s description

Edit the description of a given campaign-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Long collectionId = 56L; // Long | The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint.
    UpdateCampaignCollection updateCampaignCollection = new UpdateCampaignCollection(); // UpdateCampaignCollection | body
    try {
      Collection result = apiInstance.updateCollection(applicationId, campaignId, collectionId, updateCampaignCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **collectionId** | **Long**| The ID of the collection. You can get it with the [List collections in Application](#operation/listCollectionsInApplication) endpoint. | |
| **updateCampaignCollection** | [**UpdateCampaignCollection**](UpdateCampaignCollection.md)| body | |

### Return type

[**Collection**](Collection.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

<a id="updateCoupon"></a>
# **updateCoupon**
> Coupon updateCoupon(applicationId, campaignId, couponId, updateCoupon)

Update coupon

Update the specified coupon.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Important&lt;/p&gt;    &lt;p&gt;With this &lt;code&gt;PUT&lt;/code&gt; endpoint, if you do not explicitly set a value for the &lt;code&gt;startDate&lt;/code&gt;, &lt;code&gt;expiryDate&lt;/code&gt;, and &lt;code&gt;recipientIntegrationId&lt;/code&gt; properties in your request, it is automatically set to &lt;code&gt;null&lt;/code&gt;.&lt;/p&gt;  &lt;/div&gt; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String couponId = "couponId_example"; // String | The internal ID of the coupon code. You can find this value in the `id` property from the [List coupons](https://docs.talon.one/management-api#tag/Coupons/operation/getCouponsWithoutTotalCount) endpoint response. 
    UpdateCoupon updateCoupon = new UpdateCoupon(); // UpdateCoupon | body
    try {
      Coupon result = apiInstance.updateCoupon(applicationId, campaignId, couponId, updateCoupon);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **couponId** | **String**| The internal ID of the coupon code. You can find this value in the &#x60;id&#x60; property from the [List coupons](https://docs.talon.one/management-api#tag/Coupons/operation/getCouponsWithoutTotalCount) endpoint response.  | |
| **updateCoupon** | [**UpdateCoupon**](UpdateCoupon.md)| body | |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCouponBatch"></a>
# **updateCouponBatch**
> updateCouponBatch(applicationId, campaignId, updateCouponBatch)

Update coupons

Update all coupons or a specific batch of coupons in the given campaign. You can find the &#x60;batchId&#x60; on the **Coupons** page of your campaign in the Campaign Manager, or you can use [List coupons](#operation/getCouponsWithoutTotalCount).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Important&lt;/p&gt;    &lt;ul&gt;     &lt;li&gt;Only send sequential requests to this endpoint.&lt;/li&gt;     &lt;li&gt;Requests to this endpoint time out after 30 minutes. If you hit a timeout, contact our support team.&lt;/li&gt;     &lt;li&gt;With this &lt;code&gt;PUT&lt;/code&gt; endpoint, if you do not explicitly set a value for the &lt;code&gt;startDate&lt;/code&gt; and &lt;code&gt;expiryDate&lt;/code&gt; properties in your request, it is automatically set to &lt;code&gt;null&lt;/code&gt;.&lt;/li&gt;   &lt;/ul&gt;  &lt;/div&gt;  To update a specific coupon, use [Update coupon](#operation/updateCoupon). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    UpdateCouponBatch updateCouponBatch = new UpdateCouponBatch(); // UpdateCouponBatch | body
    try {
      apiInstance.updateCouponBatch(applicationId, campaignId, updateCouponBatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCouponBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **updateCouponBatch** | [**UpdateCouponBatch**](UpdateCouponBatch.md)| body | |

### Return type

null (empty response body)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="updateLoyaltyCard"></a>
# **updateLoyaltyCard**
> LoyaltyCard updateLoyaltyCard(loyaltyProgramId, loyaltyCardId, updateLoyaltyCard)

Update loyalty card status

Update the status of the given loyalty card. A card can be _active_ or _inactive_.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
    String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
    UpdateLoyaltyCard updateLoyaltyCard = new UpdateLoyaltyCard(); // UpdateLoyaltyCard | body
    try {
      LoyaltyCard result = apiInstance.updateLoyaltyCard(loyaltyProgramId, loyaltyCardId, updateLoyaltyCard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateLoyaltyCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  | |
| **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  | |
| **updateLoyaltyCard** | [**UpdateLoyaltyCard**](UpdateLoyaltyCard.md)| body | |

### Return type

[**LoyaltyCard**](LoyaltyCard.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |

<a id="updateReferral"></a>
# **updateReferral**
> Referral updateReferral(applicationId, campaignId, referralId, updateReferral)

Update referral

Update the specified referral.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Long campaignId = 56L; // Long | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String referralId = "referralId_example"; // String | The ID of the referral code.
    UpdateReferral updateReferral = new UpdateReferral(); // UpdateReferral | body
    try {
      Referral result = apiInstance.updateReferral(applicationId, campaignId, referralId, updateReferral);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateReferral");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **campaignId** | **Long**| The ID of the campaign. It is displayed in your Talon.One deployment URL. | |
| **referralId** | **String**| The ID of the referral code. | |
| **updateReferral** | [**UpdateReferral**](UpdateReferral.md)| body | |

### Return type

[**Referral**](Referral.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRoleV2"></a>
# **updateRoleV2**
> RoleV2 updateRoleV2(roleId, roleV2Base)

Update role

Update a specific role.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long roleId = 56L; // Long | The ID of role.  **Note**: To find the ID of a role, use the [List roles](/management-api#tag/Roles/operation/listAllRolesV2) endpoint. 
    RoleV2Base roleV2Base = new RoleV2Base(); // RoleV2Base | body
    try {
      RoleV2 result = apiInstance.updateRoleV2(roleId, roleV2Base);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateRoleV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **Long**| The ID of role.  **Note**: To find the ID of a role, use the [List roles](/management-api#tag/Roles/operation/listAllRolesV2) endpoint.  | |
| **roleV2Base** | [**RoleV2Base**](RoleV2Base.md)| body | |

### Return type

[**RoleV2**](RoleV2.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateStore"></a>
# **updateStore**
> Store updateStore(applicationId, storeId, newStore)

Update store

Update store details for a specific store ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long applicationId = 56L; // Long | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String storeId = "storeId_example"; // String | The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint. 
    NewStore newStore = new NewStore(); // NewStore | body
    try {
      Store result = apiInstance.updateStore(applicationId, storeId, newStore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **Long**| The ID of the Application. It is displayed in your Talon.One deployment URL. | |
| **storeId** | **String**| The ID of the store. You can get this ID with the [List stores](#tag/Stores/operation/listStores) endpoint.  | |
| **newStore** | [**NewStore**](NewStore.md)| body | |

### Return type

[**Store**](Store.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |

<a id="updateUser"></a>
# **updateUser**
> User updateUser(userId, updateUser)

Update user

Update the details of a specific user.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://yourbaseurl.talon.one");
    
    // Configure API key authorization: management_key
    ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
    management_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //management_key.setApiKeyPrefix("Token");

    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long userId = 56L; // Long | The ID of the user.
    UpdateUser updateUser = new UpdateUser(); // UpdateUser | body
    try {
      User result = apiInstance.updateUser(userId, updateUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Long**| The ID of the user. | |
| **updateUser** | [**UpdateUser**](UpdateUser.md)| body | |

### Return type

[**User**](User.md)

### Authorization

[management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth), [api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

