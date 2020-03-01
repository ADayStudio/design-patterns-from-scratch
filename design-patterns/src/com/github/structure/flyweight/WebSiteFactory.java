package com.github.structure.flyweight;

import java.util.HashMap;

/**
 * 享元池
 */
public class WebSiteFactory {

    private HashMap<String, ConcreateWebSite> pool = new HashMap<>();

    /**
     * 在享元池中取，如果没有则创建
     * @param type
     * @return
     */
    public WebSite getWebSiteByType(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreateWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSitePoolSize(){
        return pool.size();
    }

}
