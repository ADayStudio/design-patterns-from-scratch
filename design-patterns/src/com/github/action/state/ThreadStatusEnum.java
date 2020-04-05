package com.github.action.state;

public enum ThreadStatusEnum {

    START("新建状态", 0),
    RUNNABLE("就绪状态", 1),
    RUNNING("运行状态", 2),
    BLOCKED("阻塞状态", 3),
    DEAD("死亡状态", 4);

    private String name;
    private int status;

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    ThreadStatusEnum(String name, int status) {
        this.name = name;
        this.status = status;
    }
}
