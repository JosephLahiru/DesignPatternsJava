package com.ictec.observer.flexiObserver;

import java.util.ArrayList;
import java.util.Scanner;

public class TecMisAdmin implements MySubject {
    Scanner sc = new Scanner(System.in);

    ArrayList<MyObserver> observers = new ArrayList<MyObserver>();
    String message;

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(MyObserver observer: observers){
            observer.update(message);
        }
    }

    public void sendMessage(){
        System.out.print("Please enter the message to send: ");
        this.message = sc.nextLine();
        notifyObservers();
    }

}
