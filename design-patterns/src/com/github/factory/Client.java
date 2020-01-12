package com.github.factory;


public class Client {

    public static void main(String args[]){
        Creator creator = new ConcreateCreator();
        Product product1= creator.createProduct(ConcreateProduct1.class);
        Product product2= creator.createProduct(ConcreateProduct2.class);
    }
}
