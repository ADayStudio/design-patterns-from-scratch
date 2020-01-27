package com.github.bridge;


public class Client {

    public static void main(String[] args){
        Phone foledPhone = new FoledPhone(new Iphone());
        foledPhone.open();
        foledPhone.close();
        foledPhone.call();

        Phone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.close();
        upRightPhone.call();
    }
}
