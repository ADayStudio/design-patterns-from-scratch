package com.github.action.template;

public class Client {

    public static void main(String[] args) {
        AbstractHandler<MessageTypeEnum> order = new OrderHandler();
        order.process(MessageTypeEnum.ORDER, "order");

        AbstractHandler<MessageTypeEnum> warehousse = new WareHouseHandler();
        warehousse.process(MessageTypeEnum.WAREHOUSE, "warehousse");
    }
}
