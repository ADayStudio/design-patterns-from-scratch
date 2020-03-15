package com.github.action.template;

public class WareHouseHandler extends AbstractHandler<MessageTypeEnum> {

    @Override
    protected String process(String message) {
        System.out.println(message);
        return "Y";
    }

    @Override
    protected boolean match(MessageTypeEnum type) {
        return MessageTypeEnum.WAREHOUSE == type;
    }
}
