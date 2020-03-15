package com.github.action.template;

public enum MessageTypeEnum {

    ORDER("order", "订单"),

    WAREHOUSE("warehouse", "仓库");

    private String type;

    private String desc;

    MessageTypeEnum(){}

    MessageTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
