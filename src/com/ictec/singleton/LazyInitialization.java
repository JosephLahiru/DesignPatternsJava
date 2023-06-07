package com.ictec.singleton;

public class LazyInitialization {
    private static LazyInitialization lazyInitialization;
    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if(lazyInitialization==null){
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }

    public void sayHello() {
        System.out.println("Hello from LazyInitialization!");
    }
}