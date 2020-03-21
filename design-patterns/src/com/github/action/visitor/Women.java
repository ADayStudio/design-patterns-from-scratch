package com.github.action.visitor;

public class Women extends Person {

    public Women(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getResultWomen(this);
    }
}
