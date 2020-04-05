package com.github.action.interpreter;

public class VarExpression implements Expression {

    private String value;

    public VarExpression(String value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return Integer.valueOf(this.value);
    }
}
