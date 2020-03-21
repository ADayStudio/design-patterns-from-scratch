package com.github.action.visitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure client = new ObjectStructure();
        client.attach(new Man("Ming"));
        client.attach(new Women("Hong"));

        Success success = new Success();
        client.disPlay(success);

        Fail fail = new Fail();
        client.disPlay(fail);
    }
}
