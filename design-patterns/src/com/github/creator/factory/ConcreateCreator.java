package com.github.creator.factory;


public class ConcreateCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product)clazz.forName(clazz.getName()).newInstance();
        }catch (ClassNotFoundException e){
        }catch (IllegalAccessException e){
        }catch (InstantiationException e){
        }
        return (T)product;
    }
}
