package com.github.action.observer;

public class SinaObserver implements Observer {

    private Wether wether;

    @Override
    public void update(Wether wether) {
        this.wether = wether;
        display();
    }

    public void display(){
        System.out.println(wether.toString());
    }
}
