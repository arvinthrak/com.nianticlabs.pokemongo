package crittercism.android;

import android.content.Context;
import android.telephony.TelephonyManager;

public final class bx$p
  implements bw
{
  public Integer a = Integer.valueOf(0);
  
  public bx$p()
  {
    bx.b();
    try
    {
      String str = ((TelephonyManager)bx.b().getSystemService("phone")).getNetworkOperator();
      if (str != null) {
        a = Integer.valueOf(Integer.parseInt(str.substring(3)));
      }
      new StringBuilder("mobileNetworkCode == ").append(a);
      dx.b();
      return;
    }
    catch (Exception localException) {}
  }
  
  public final String a()
  {
    return "mobile_network_code";
  }
}

/* Location:
 * Qualified Name:     crittercism.android.bx.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */