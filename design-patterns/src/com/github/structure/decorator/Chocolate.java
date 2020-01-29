package com.github.structure.decorator;

public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3.0f);
    }
}
