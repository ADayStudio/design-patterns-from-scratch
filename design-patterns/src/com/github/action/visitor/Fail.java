package com.github.action.visitor;


public class Fail extends Action{
    @Override
    public void getResultMan(Person person) {
        System.out.println(person.getName() + "fail");
    }

    @Override
    public void getResultWomen(Person person) {
        System.out.println(person.getName() + "fail");
    }
}
