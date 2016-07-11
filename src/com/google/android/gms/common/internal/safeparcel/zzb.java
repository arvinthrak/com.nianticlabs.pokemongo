package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class zzb
{
  private static int zzG(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void zzH(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  public static void zzI(Parcel paramParcel, int paramInt)
  {
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte paramByte)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramByte);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, double paramDouble)
  {
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, float paramFloat)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, long paramLong)
  {
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean)
  {
    if (paramParcel2 == null)
    {
      if (paramBoolean) {
        zzb(paramParcel1, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel1, paramInt);
    paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
    zzH(paramParcel1, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt1, 0);
      }
      return;
    }
    paramInt1 = zzG(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    zzH(paramParcel, paramInt1);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    int i = 0;
    if (paramBoolean == null)
    {
      if (paramBoolean1) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    zzb(paramParcel, paramInt, 4);
    paramInt = i;
    if (paramBoolean.booleanValue()) {
      paramInt = 1;
    }
    paramParcel.writeInt(paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat.floatValue());
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    if (paramInteger == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    if (paramLong == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void zza(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = zzG(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    paramInt = 0;
    while (paramInt < j)
    {
      paramParcel.writeInt(((Integer)paramList.get(paramInt)).intValue());
      paramInt += 1;
    }
    zzH(paramParcel, i);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, short paramShort)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramShort);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    zzb(paramParcel, paramInt, 4);
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    if (paramArrayOfFloat == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeFloatArray(paramArrayOfFloat);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    zzH(paramParcel, paramInt);
  }
  
  public static <T extends Parcelable> void zza(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfT == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt1, 0);
      }
      return;
    }
    int i = zzG(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    paramInt1 = 0;
    if (paramInt1 < j)
    {
      T ? = paramArrayOfT[paramInt1];
      if (? == null) {
        paramParcel.writeInt(0);
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        zza(paramParcel, ?, paramInt2);
      }
    }
    zzH(paramParcel, i);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zzG(paramParcel, paramInt);
    int k = paramArrayOfByte.length;
    paramParcel.writeInt(k);
    paramInt = i;
    while (paramInt < k)
    {
      paramParcel.writeByteArray(paramArrayOfByte[paramInt]);
      paramInt += 1;
    }
    zzH(paramParcel, j);
  }
  
  private static <T extends Parcelable> void zza(Parcel paramParcel, T paramT, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  public static int zzaq(Parcel paramParcel)
  {
    return zzG(paramParcel, 20293);
  }
  
  private static void zzb(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt2 << 16 | paramInt1);
  }
  
  public static void zzb(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    zzH(paramParcel, paramInt);
  }
  
  public static void zzc(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    zzb(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static <T extends Parcelable> void zzc(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = zzG(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    paramInt = 0;
    if (paramInt < j)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      }
      for (;;)
      {
        paramInt += 1;
        break;
        zza(paramParcel, localParcelable, 0);
      }
    }
    zzH(paramParcel, i);
  }
  
  public static void zzd(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zzG(paramParcel, paramInt);
    paramParcel.writeList(paramList);
    zzH(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */