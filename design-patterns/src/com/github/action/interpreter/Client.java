package com.github.action.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) throws IOException {
        String context = getExpStr();
        ExpressionParser expressionParser = new ExpressionParser();
        Expression result = expressionParser.parseExpression(context);
        println(result.getValue());

    }

    public static String getExpStr() throws IOException{
        System.out.println("interpreter version 0.0.1");
        System.out.print(">>");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        return new BufferedReader(inputStreamReader).readLine();
    }

    public static void println(int result){
        System.out.print(">>");
        System.out.println(result);
    }
}
