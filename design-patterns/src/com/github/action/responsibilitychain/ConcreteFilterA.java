package com.github.action.responsibilitychain;

public class ConcreteFilterA extends AbstractFilter{

    public ConcreteFilterA(String name) {
        super(name);
    }

    @Override
    public void handler(MyRequest request) {
        if (request.getPort() == 80){
            System.out.println("FilterA handler");
        }else {
            if (null == filter){
                filter = new ConcreteFilterB("FilterB");
            }
            filter.handler(request);
        }
    }
}
