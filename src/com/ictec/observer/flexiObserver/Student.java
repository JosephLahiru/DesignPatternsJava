package com.ictec.observer.flexiObserver;

public class Student implements MyObserver{
    String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("I am " + this.name + ". I got the message " + message);
    }
}
