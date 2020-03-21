package com.github.action.observer;

public class Client {

    public static void main(String[] args) {
        WetherData wetherData = new WetherData(new Wether(3.2F, 4.4F, 5.6F));

        // 观察者
        SinaObserver sinaObserver = new SinaObserver();
        wetherData.registerObservers(sinaObserver);

        // 推送
        wetherData.notifyObservers();
        // 更新
        wetherData.update(new Wether(3F, 4F, 5F));
    }
}
