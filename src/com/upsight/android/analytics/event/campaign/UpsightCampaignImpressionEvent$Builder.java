package com.upsight.android.analytics.event.campaign;

import com.upsight.android.analytics.event.UpsightPublisherData.Builder;
import com.upsight.android.analytics.internal.AnalyticsEvent.Builder;

public class UpsightCampaignImpressionEvent$Builder
  extends AnalyticsEvent.Builder<UpsightCampaignImpressionEvent, UpsightCampaignImpressionEvent.UpsightData>
{
  private Integer adGameId;
  private Integer adTypeId;
  private Integer campaignId;
  private Integer contentId;
  private Integer contentTypeId;
  private Integer creativeId;
  private Integer ordinal;
  private String scope;
  private String streamId;
  private String streamStartTs;
  
  protected UpsightCampaignImpressionEvent$Builder(String paramString, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3)
  {
    streamId = paramString;
    campaignId = paramInteger1;
    creativeId = paramInteger2;
    contentId = paramInteger3;
  }
  
  protected UpsightCampaignImpressionEvent build()
  {
    return new UpsightCampaignImpressionEvent("upsight.campaign.impression", new UpsightCampaignImpressionEvent.UpsightData(this), mPublisherDataBuilder.build());
  }
  
  public Builder setAdGameId(Integer paramInteger)
  {
    adGameId = paramInteger;
    return this;
  }
  
  public Builder setAdTypeId(Integer paramInteger)
  {
    adTypeId = paramInteger;
    return this;
  }
  
  public Builder setContentTypeId(Integer paramInteger)
  {
    contentTypeId = paramInteger;
    return this;
  }
  
  public Builder setOrdinal(Integer paramInteger)
  {
    ordinal = paramInteger;
    return this;
  }
  
  public Builder setScope(String paramString)
  {
    scope = paramString;
    return this;
  }
  
  public Builder setStreamStartTs(String paramString)
  {
    streamStartTs = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.upsight.android.analytics.event.campaign.UpsightCampaignImpressionEvent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */