.class public Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent;
.super Lcom/upsight/android/analytics/internal/AnalyticsEvent;
.source "UpsightCommUnregisterEvent.java"


# annotations
.annotation runtime Lcom/upsight/android/persistence/annotation/UpsightStorableType;
    value = "upsight.comm.unregister"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$Builder;,
        Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$UpsightData;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/upsight/android/analytics/internal/AnalyticsEvent",
        "<",
        "Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$UpsightData;",
        ">;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/upsight/android/analytics/internal/AnalyticsEvent;-><init>()V

    .line 68
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$UpsightData;Lcom/upsight/android/analytics/event/UpsightPublisherData;)V
    .locals 0
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "upsightData"    # Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$UpsightData;
    .param p3, "publisherData"    # Lcom/upsight/android/analytics/event/UpsightPublisherData;

    .prologue
    .line 63
    invoke-direct {p0, p1, p2, p3}, Lcom/upsight/android/analytics/internal/AnalyticsEvent;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/upsight/android/analytics/event/UpsightPublisherData;)V

    .line 64
    return-void
.end method

.method public static createBuilder()Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$Builder;
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$Builder;

    invoke-direct {v0}, Lcom/upsight/android/analytics/event/comm/UpsightCommUnregisterEvent$Builder;-><init>()V

    return-object v0
.end method
