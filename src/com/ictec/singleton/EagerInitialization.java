package com.ictec.singleton;

public class EagerInitialization {
    private static final EagerInitialization eagerInitialization = new EagerInitialization();
    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return eagerInitialization;
    }

    public void sayHello() {
        System.out.println("Hello from EagerSingleton!");
    }
}