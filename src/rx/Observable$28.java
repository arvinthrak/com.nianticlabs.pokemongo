package rx;

import rx.functions.Func1;

class Observable$28
  implements Func1<Observable<? extends Notification<?>>, Observable<?>>
{
  Observable$28(Observable paramObservable, Func1 paramFunc1) {}
  
  public Observable<?> call(Observable<? extends Notification<?>> paramObservable)
  {
    (Observable)val$notificationHandler.call(paramObservable.map(new Func1()
    {
      public Throwable call(Notification<?> paramAnonymousNotification)
      {
        return paramAnonymousNotification.getThrowable();
      }
    }));
  }
}

/* Location:
 * Qualified Name:     rx.Observable.28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */