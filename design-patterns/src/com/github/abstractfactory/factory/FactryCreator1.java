package com.github.abstractfactory.factory;


public class FactryCreator1 extends AbstractFactryCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
