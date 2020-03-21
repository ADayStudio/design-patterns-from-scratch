package com.github.action.observer;

import java.util.ArrayList;
import java.util.List;

public class WetherData implements Subject{

    private Wether wether;

    private List<Observer> observers = new ArrayList<>();

    public WetherData(Wether wether) {
        this.wether = wether;
    }

    /**
     * 更新时通知
     * @param wether
     */
    public void update(Wether wether){
        this.wether = wether;
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(wether);
        });
    }
}
