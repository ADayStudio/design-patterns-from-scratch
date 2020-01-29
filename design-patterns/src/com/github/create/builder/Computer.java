package com.github.create.builder;

/**
 * 产品
 */
public abstract class Computer {

    protected String board;
    protected String display;
    protected String mOs;

    protected Computer(){
    }


    public void setBoard(String board){
        this.board=board;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void setOs() ;
}
