.class public final Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;
.super Ljava/lang/Object;
.source "UpsightMarketingExtension_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector",
        "<",
        "Lcom/upsight/android/UpsightMarketingExtension;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final mBillboardManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightBillboardManager;",
            ">;"
        }
    .end annotation
.end field

.field private final mDefaultContentMediatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;",
            ">;"
        }
    .end annotation
.end field

.field private final mMarketingContentFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final mMarketingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;"
        }
    .end annotation
.end field

.field private final supertypeInjector:Ldagger/MembersInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/MembersInjector",
            "<",
            "Lcom/upsight/android/UpsightExtension",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingComponent;",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ldagger/MembersInjector;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/MembersInjector",
            "<",
            "Lcom/upsight/android/UpsightExtension",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingComponent;",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;>;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightBillboardManager;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 20
    .local p1, "supertypeInjector":Ldagger/MembersInjector;, "Ldagger/MembersInjector<Lcom/upsight/android/UpsightExtension<Lcom/upsight/android/marketing/UpsightMarketingComponent;Lcom/upsight/android/marketing/UpsightMarketingApi;>;>;"
    .local p2, "mMarketingProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/UpsightMarketingApi;>;"
    .local p3, "mMarketingContentFactoryProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;>;"
    .local p4, "mBillboardManagerProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/UpsightBillboardManager;>;"
    .local p5, "mDefaultContentMediatorProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 22
    :cond_0
    iput-object p1, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->supertypeInjector:Ldagger/MembersInjector;

    .line 23
    sget-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 24
    :cond_1
    iput-object p2, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mMarketingProvider:Ljavax/inject/Provider;

    .line 25
    sget-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 26
    :cond_2
    iput-object p3, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mMarketingContentFactoryProvider:Ljavax/inject/Provider;

    .line 27
    sget-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    if-nez v0, :cond_3

    if-nez p4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 28
    :cond_3
    iput-object p4, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mBillboardManagerProvider:Ljavax/inject/Provider;

    .line 29
    sget-boolean v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->$assertionsDisabled:Z

    if-nez v0, :cond_4

    if-nez p5, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 30
    :cond_4
    iput-object p5, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mDefaultContentMediatorProvider:Ljavax/inject/Provider;

    .line 31
    return-void
.end method

.method public static create(Ldagger/MembersInjector;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/MembersInjector",
            "<",
            "Lcom/upsight/android/UpsightExtension",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingComponent;",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;>;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightMarketingApi;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/UpsightBillboardManager;",
            ">;",
            "Ljavax/inject/Provider",
            "<",
            "Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;",
            ">;)",
            "Ldagger/MembersInjector",
            "<",
            "Lcom/upsight/android/UpsightMarketingExtension;",
            ">;"
        }
    .end annotation

    .prologue
    .line 46
    .local p0, "supertypeInjector":Ldagger/MembersInjector;, "Ldagger/MembersInjector<Lcom/upsight/android/UpsightExtension<Lcom/upsight/android/marketing/UpsightMarketingComponent;Lcom/upsight/android/marketing/UpsightMarketingApi;>;>;"
    .local p1, "mMarketingProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/UpsightMarketingApi;>;"
    .local p2, "mMarketingContentFactoryProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;>;"
    .local p3, "mBillboardManagerProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/UpsightBillboardManager;>;"
    .local p4, "mDefaultContentMediatorProvider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;>;"
    new-instance v0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;-><init>(Ldagger/MembersInjector;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public injectMembers(Lcom/upsight/android/UpsightMarketingExtension;)V
    .locals 2
    .param p1, "instance"    # Lcom/upsight/android/UpsightMarketingExtension;

    .prologue
    .line 35
    if-nez p1, :cond_0

    .line 36
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->supertypeInjector:Ldagger/MembersInjector;

    invoke-interface {v0, p1}, Ldagger/MembersInjector;->injectMembers(Ljava/lang/Object;)V

    .line 39
    iget-object v0, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mMarketingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/upsight/android/marketing/UpsightMarketingApi;

    iput-object v0, p1, Lcom/upsight/android/UpsightMarketingExtension;->mMarketing:Lcom/upsight/android/marketing/UpsightMarketingApi;

    .line 40
    iget-object v0, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mMarketingContentFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;

    iput-object v0, p1, Lcom/upsight/android/UpsightMarketingExtension;->mMarketingContentFactory:Lcom/upsight/android/marketing/internal/content/MarketingContentFactory;

    .line 41
    iget-object v0, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mBillboardManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/upsight/android/marketing/UpsightBillboardManager;

    iput-object v0, p1, Lcom/upsight/android/UpsightMarketingExtension;->mBillboardManager:Lcom/upsight/android/marketing/UpsightBillboardManager;

    .line 42
    iget-object v0, p0, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->mDefaultContentMediatorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;

    iput-object v0, p1, Lcom/upsight/android/UpsightMarketingExtension;->mDefaultContentMediator:Lcom/upsight/android/marketing/internal/content/DefaultContentMediator;

    .line 43
    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 12
    check-cast p1, Lcom/upsight/android/UpsightMarketingExtension;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/upsight/android/UpsightMarketingExtension_MembersInjector;->injectMembers(Lcom/upsight/android/UpsightMarketingExtension;)V

    return-void
.end method
