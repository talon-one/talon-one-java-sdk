

# ExperimentSegmentInsightMetric


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | [**MetricEnum**](#MetricEnum) | The metric being measured. |  |
|**segments** | [**List&lt;ExperimentSegmentInsight&gt;**](ExperimentSegmentInsight.md) | Segments with statistically significant results for this metric. An empty array means no significant segments were found. Segments are sorted by confidence score from highest to lowest.  |  |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| AVG_SESSION_VALUE | &quot;avg_session_value&quot; |
| AVG_DISCOUNTED_SESSION_VALUE | &quot;avg_discounted_session_value&quot; |
| AVG_ITEMS_PER_SESSION | &quot;avg_items_per_session&quot; |



