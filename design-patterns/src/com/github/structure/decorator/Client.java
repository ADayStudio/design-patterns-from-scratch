package com.github.structure.decorator;

public class Client {

    public static void main(String args[]){
        Drink order = new Espresso();
        System.out.println(order.cost());
        System.out.println(order.getDesc());
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());
    }
}
