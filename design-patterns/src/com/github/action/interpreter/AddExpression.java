package com.github.action.interpreter;

public class AddExpression extends OperatorExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return left.getValue() + right.getValue();
    }
}
