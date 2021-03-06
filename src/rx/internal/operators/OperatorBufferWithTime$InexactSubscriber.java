package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Scheduler.Worker;
import rx.Subscriber;
import rx.functions.Action0;

final class OperatorBufferWithTime$InexactSubscriber
  extends Subscriber<T>
{
  final Subscriber<? super List<T>> child;
  final List<List<T>> chunks;
  boolean done;
  final Scheduler.Worker inner;
  
  public OperatorBufferWithTime$InexactSubscriber(Subscriber<? super List<T>> paramSubscriber, Scheduler.Worker paramWorker)
  {
    child = paramWorker;
    Scheduler.Worker localWorker;
    inner = localWorker;
    chunks = new LinkedList();
  }
  
  void emitChunk(List<T> paramList)
  {
    int j = 0;
    try
    {
      if (done) {
        return;
      }
      Iterator localIterator = chunks.iterator();
      do
      {
        i = j;
        if (!localIterator.hasNext()) {
          break;
        }
      } while ((List)localIterator.next() != paramList);
      localIterator.remove();
      int i = 1;
      if (i != 0) {
        try
        {
          child.onNext(paramList);
          return;
        }
        catch (Throwable paramList)
        {
          onError(paramList);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void onCompleted()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 49	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:done	Z
    //   6: ifeq +6 -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 49	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:done	Z
    //   17: new 37	java/util/LinkedList
    //   20: dup
    //   21: aload_0
    //   22: getfield 40	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:chunks	Ljava/util/List;
    //   25: invokespecial 81	java/util/LinkedList:<init>	(Ljava/util/Collection;)V
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 40	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:chunks	Ljava/util/List;
    //   33: invokeinterface 84 1 0
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: invokeinterface 55 1 0
    //   46: astore_1
    //   47: aload_1
    //   48: invokeinterface 61 1 0
    //   53: ifeq +39 -> 92
    //   56: aload_1
    //   57: invokeinterface 65 1 0
    //   62: checkcast 51	java/util/List
    //   65: astore_2
    //   66: aload_0
    //   67: getfield 33	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:child	Lrx/Subscriber;
    //   70: aload_2
    //   71: invokevirtual 72	rx/Subscriber:onNext	(Ljava/lang/Object;)V
    //   74: goto -27 -> 47
    //   77: astore_1
    //   78: aload_0
    //   79: getfield 33	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:child	Lrx/Subscriber;
    //   82: aload_1
    //   83: invokevirtual 85	rx/Subscriber:onError	(Ljava/lang/Throwable;)V
    //   86: return
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    //   92: aload_0
    //   93: getfield 33	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:child	Lrx/Subscriber;
    //   96: invokevirtual 87	rx/Subscriber:onCompleted	()V
    //   99: aload_0
    //   100: invokevirtual 90	rx/internal/operators/OperatorBufferWithTime$InexactSubscriber:unsubscribe	()V
    //   103: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	InexactSubscriber
    //   28	29	1	localObject1	Object
    //   77	6	1	localThrowable	Throwable
    //   87	4	1	localObject2	Object
    //   65	6	2	localList	List
    // Exception table:
    //   from	to	target	type
    //   0	2	77	java/lang/Throwable
    //   40	47	77	java/lang/Throwable
    //   47	74	77	java/lang/Throwable
    //   90	92	77	java/lang/Throwable
    //   2	11	87	finally
    //   12	40	87	finally
    //   88	90	87	finally
  }
  
  public void onError(Throwable paramThrowable)
  {
    try
    {
      if (done) {
        return;
      }
      done = true;
      chunks.clear();
      child.onError(paramThrowable);
      unsubscribe();
      return;
    }
    finally {}
  }
  
  public void onNext(T paramT)
  {
    Object localObject;
    for (;;)
    {
      Iterator localIterator;
      List localList;
      try
      {
        if (done) {
          return;
        }
        localIterator = chunks.iterator();
        localObject = null;
      }
      finally {}
      try
      {
        if (!localIterator.hasNext()) {
          continue;
        }
        localList = (List)localIterator.next();
        localList.add(paramT);
        if (localList.size() != this$0.count) {
          break label156;
        }
        localIterator.remove();
        if (localObject != null) {
          break label153;
        }
        localObject = new LinkedList();
      }
      finally
      {
        continue;
        continue;
        continue;
      }
      ((List)localObject).add(localList);
    }
    if (localObject != null)
    {
      paramT = ((List)localObject).iterator();
      while (paramT.hasNext())
      {
        localObject = (List)paramT.next();
        child.onNext(localObject);
      }
    }
  }
  
  void scheduleChunk()
  {
    inner.schedulePeriodically(new Action0()
    {
      public void call()
      {
        startNewChunk();
      }
    }, this$0.timeshift, this$0.timeshift, this$0.unit);
  }
  
  void startNewChunk()
  {
    final ArrayList localArrayList = new ArrayList();
    try
    {
      if (done) {
        return;
      }
      chunks.add(localArrayList);
      inner.schedule(new Action0()
      {
        public void call()
        {
          emitChunk(localArrayList);
        }
      }, this$0.timespan, this$0.unit);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     rx.internal.operators.OperatorBufferWithTime.InexactSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */