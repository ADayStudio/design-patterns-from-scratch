package com.github.action.interpreter;

public class SubExpression extends OperatorExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return left.getValue() - right.getValue();
    }
}
