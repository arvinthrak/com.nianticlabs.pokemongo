package rx.subjects;

import rx.functions.Action1;

final class ReplaySubject$1
  implements Action1<SubjectSubscriptionManager.SubjectObserver<T>>
{
  ReplaySubject$1(ReplaySubject.UnboundedReplayState paramUnboundedReplayState) {}
  
  public void call(SubjectSubscriptionManager.SubjectObserver<T> paramSubjectObserver)
  {
    paramSubjectObserver.index(Integer.valueOf(val$state.replayObserverFromIndex(Integer.valueOf(0), paramSubjectObserver).intValue()));
  }
}

/* Location:
 * Qualified Name:     rx.subjects.ReplaySubject.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */