package com.github.action.template;

public class OrderHandler extends AbstractHandler<MessageTypeEnum> {

    @Override
    protected String process(String message) {
        System.out.println(message);
        return "Y";
    }

    @Override
    protected boolean match(MessageTypeEnum type) {
        return MessageTypeEnum.ORDER == type;
    }
}
