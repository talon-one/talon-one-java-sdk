

# CampaignEditedNotificationItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | **String** | The type of the event. Can be one of the following: [&#39;campaign_state_changed&#39;, &#39;campaign_ruleset_changed&#39;, &#39;campaign_edited&#39;, &#39;campaign_created&#39;, &#39;campaign_deleted&#39;]  |  |
|**campaign** | [**Campaign**](Campaign.md) | The campaign whose state changed. |  |
|**oldCampaign** | [**Campaign**](Campaign.md) | The campaign before the change. |  |
|**ruleset** | [**Ruleset**](Ruleset.md) | The current ruleset. |  [optional] |



