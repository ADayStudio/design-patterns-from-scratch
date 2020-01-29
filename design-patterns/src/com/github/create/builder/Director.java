package com.github.create.builder;

/**
 * 指挥者
 */
public class Director {

    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }
}
