package com.github.other.nullobject;

public class Client {

    public static void main(String[] args) {

        Command[] commands = new Command[2];
        for (int i = 0; i < commands.length; i++) {
            // 默认值，减少了空的判断
            commands[i] = new NullObjectCommand();
        }

    }
}
