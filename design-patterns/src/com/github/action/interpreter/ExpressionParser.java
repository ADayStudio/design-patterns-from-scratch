package com.github.action.interpreter;

import java.util.Stack;

public class ExpressionParser {

    private Expression expression;

    public Expression parseExpression(String expStr){
        Stack<Expression> stack = new Stack<>();
        // 拆分表达式
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        // 1+3-2
        for (int i = 0; i < charArray.length; i++){
            switch (charArray[i]){
                case OperatorConstant.ADD :
                    // 先取出左边
                    left = stack.pop();
                    // 取出右边
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    // 运算后push
                    stack.push(new AddExpression(left, right));
                    break;
                case OperatorConstant.SUB :
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default :
                    // 如果是变量，就创建VarExpression对象，并push
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 当遍历完整个charArray后，stack最后得到的Expression
        this.expression = stack.pop();
        return expression;
    }
}
