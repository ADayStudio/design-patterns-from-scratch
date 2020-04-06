package com.github.action.responsibilitychain;

public class ConcreteFilterB extends AbstractFilter{

    public ConcreteFilterB(String name) {
        super(name);
    }

    @Override
    public void handler(MyRequest request) {
        if (request.getPort() == 4000){
            System.out.println("FilterB handler");
        }else {
            if (null == filter){
                filter = new ConcreteFilterB("FilterA");
            }
            filter.handler(request);
        }
    }
}
