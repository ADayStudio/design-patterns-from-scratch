package com.github.create.prototype;

/**
 * Mail
 * Cloneable用于标记可拷贝，无实现方法
 */
public class Mail implements Cloneable{

    /**
     * 默认是浅拷贝
     * @return
     */
    @Override
    protected Object clone(){
        Mail mail = null;
        try{
            mail = (Mail)super.clone();
        }catch (CloneNotSupportedException e){

        }
        return mail;
    }
}
