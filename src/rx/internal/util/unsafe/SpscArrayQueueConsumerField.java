package rx.internal.util.unsafe;

import sun.misc.Unsafe;

abstract class SpscArrayQueueConsumerField<E>
  extends SpscArrayQueueL2Pad<E>
{
  protected static final long C_INDEX_OFFSET;
  protected long consumerIndex;
  
  static
  {
    try
    {
      C_INDEX_OFFSET = UnsafeAccess.UNSAFE.objectFieldOffset(SpscArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      throw new RuntimeException(localNoSuchFieldException);
    }
  }
  
  public SpscArrayQueueConsumerField(int paramInt)
  {
    super(paramInt);
  }
}

/* Location:
 * Qualified Name:     rx.internal.util.unsafe.SpscArrayQueueConsumerField
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */