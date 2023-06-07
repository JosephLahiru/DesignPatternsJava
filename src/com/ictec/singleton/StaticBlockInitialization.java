package com.ictec.singleton;

public class StaticBlockInitialization {
    private static final StaticBlockInitialization staticBlockInitialization;

    static {
        staticBlockInitialization = new StaticBlockInitialization();
    }

    private StaticBlockInitialization(){

    }

    public static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }

    public void sayHello() {
        System.out.println("Hello from StaticBlockInitialization!");
    }
}