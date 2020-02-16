package com.github.structure.facade;

/**
 * 外观类
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        // 实例化属性，可以用单例模式实例化
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void draw(){
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
