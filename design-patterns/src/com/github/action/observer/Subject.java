package com.github.action.observer;

public interface Subject {

    /**
     * 订阅
     */
    void registerObservers(Observer observer);

    /**
     * 取消
     */
    void removeObservers(Observer observer);

    /**
     * 通知
     */
    void notifyObservers();
}
