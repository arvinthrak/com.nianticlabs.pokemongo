package rx.internal.operators;

import rx.functions.Func1;
import rx.functions.Func2;

final class OperatorSkipWhile$2
  implements Func2<T, Integer, Boolean>
{
  OperatorSkipWhile$2(Func1 paramFunc1) {}
  
  public Boolean call(T paramT, Integer paramInteger)
  {
    return (Boolean)val$predicate.call(paramT);
  }
}

/* Location:
 * Qualified Name:     rx.internal.operators.OperatorSkipWhile.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */