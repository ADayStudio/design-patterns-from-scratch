package com.github.create.abstractfactory;


public class Client {

    public static void main(String args[]){
        AbstractFactryCreator creator1 = new FactryCreator1();
        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductB productB1 = creator1.createProductB();

        AbstractFactryCreator creator2 = new FactryCreator2();
        AbstractProductA productA2 = creator2.createProductA();
        AbstractProductB productB2 = creator2.createProductB();
    }
}
