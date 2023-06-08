package com.ictec.observer.flexiObserver;

public interface MySubject {
    public void registerObserver(MyObserver observer);
    public void removeObserver(MyObserver observer);
    public void notifyObservers();
}
