package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzc$3
  extends zzd<Status>
{
  zzc$3(zzc paramzzc, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzh paramzzh)
    throws RemoteException
  {
    paramzzh.zza(new zzc.zza(this), new DeleteRequest(zzSH));
  }
  
  protected Status zzd(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzc.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */