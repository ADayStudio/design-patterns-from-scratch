package com.github.action.template;

public abstract class AbstractHandler<T> {

    /**
     * 模板方法
     */
    public final String process(T type, String message){
        if (match(type)){
            process(message);
            return "Y";
        }else if (match()){
            process(message);
            return "Y";
        }else {
            System.out.println("unknow type");

        }
        return "N";
    }

    protected abstract String process(String message);

    protected abstract boolean match(T type);

    /**
     * 钩子方法
     * @return
     */
    public boolean match(){
        return false;
    }
}
