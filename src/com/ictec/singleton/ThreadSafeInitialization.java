package com.ictec.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization threadSafeInitialization;
    private ThreadSafeInitialization(){}

    public static synchronized ThreadSafeInitialization getInstance(){
        if(threadSafeInitialization==null){
            threadSafeInitialization = new ThreadSafeInitialization();
        }
        return threadSafeInitialization;
    }

    public void sayHello() {
        System.out.println("Hello from ThreadSafeInitialization!");
    }
}