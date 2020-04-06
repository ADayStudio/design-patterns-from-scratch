package com.github.action.responsibilitychain;

/**
 * 自定义请求
 */
public class MyRequest {

    private String host;

    private int port;

    private int id;

    public int getPort() {
        return port;
    }

    public MyRequest(String host, int port, int id) {
        this.host = host;
        this.port = port;
        this.id = id;
    }
}
