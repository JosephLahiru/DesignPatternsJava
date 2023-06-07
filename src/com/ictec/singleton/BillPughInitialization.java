package com.ictec.singleton;

public class BillPughInitialization {
    private BillPughInitialization(){}

    private static class SingletonHelper{
        private static final BillPughInitialization billPughInitialization = new BillPughInitialization();
    }

    public static BillPughInitialization getInstance(){
        return SingletonHelper.billPughInitialization;
    }

    public void sayHello() {
        System.out.println("Hello from BillPughInitialization!");
    }
}