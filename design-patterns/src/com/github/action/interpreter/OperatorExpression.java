package com.github.action.interpreter;

public abstract class OperatorExpression implements Expression{

    // 左值
    protected Expression left;
    // 右值
    protected Expression right;

    public OperatorExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract int getValue();
}
