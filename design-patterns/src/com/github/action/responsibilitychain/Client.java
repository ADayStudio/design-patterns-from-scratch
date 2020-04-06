package com.github.action.responsibilitychain;

public class Client {

    public static void main(String[] args) {
        MyRequest request1 = new MyRequest("127.0.0.1", 80, 0);
        MyRequest request2 = new MyRequest("127.0.0.1", 4000, 1);

        AbstractFilter filter = new ConcreteFilterA("FilterA");

        filter.handler(request1);
        filter.handler(request2);

    }
}
