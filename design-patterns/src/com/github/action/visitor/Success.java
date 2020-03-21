package com.github.action.visitor;


public class Success extends Action{
    @Override
    public void getResultMan(Person person) {
        System.out.println(person.getName() + "success");
    }

    @Override
    public void getResultWomen(Person person) {
        System.out.println(person.getName() + "success");
    }
}
