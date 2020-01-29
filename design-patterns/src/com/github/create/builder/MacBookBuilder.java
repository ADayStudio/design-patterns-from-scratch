package com.github.create.builder;

public class MacBookBuilder extends Builder {

    private Computer macBook = new MacBook();

    @Override
    void buildBoard(String board) {
        macBook.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        macBook.setDisplay(display);
    }

    @Override
    void buildOs() {
        macBook.setOs();
    }

    @Override
    Computer build() {
        return macBook;
    }
}
