package com.ictec.singleton;

public class SingletonDemo {
    static EagerInitialization eagerInitialization;
    static StaticBlockInitialization staticBlockInitialization;
    static LazyInitialization lazyInitialization;
    static ThreadSafeInitialization threadSafeInitialization;
    static BillPughInitialization billPughInitialization;

    public static void main(String[] args) {
        // 1.0 Eager Initialization
        eagerInitialization = EagerInitialization.getInstance();

        // 2.0 Static Block Initialization
        staticBlockInitialization = StaticBlockInitialization.getInstance();

        //3.0 Lazy Initialization
        lazyInitialization = LazyInitialization.getInstance();

        //4.0 Thread Safe Initialization
        threadSafeInitialization = ThreadSafeInitialization.getInstance();

        //5.0 Bill Pugh Initialization
        billPughInitialization = BillPughInitialization.getInstance();

        eagerInitialization.sayHello();
        staticBlockInitialization.sayHello();
        lazyInitialization.sayHello();
        threadSafeInitialization.sayHello();
        billPughInitialization.sayHello();

    }
}
