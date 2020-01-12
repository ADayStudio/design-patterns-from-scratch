package com.github.abstractfactory.factory;


public class FactryCreator2 extends AbstractFactryCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
