package com.github.structure.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        webSiteFactory.getWebSiteByType("news");
        System.out.println(webSiteFactory.getWebSitePoolSize());
        webSiteFactory.getWebSiteByType("blog");
        System.out.println(webSiteFactory.getWebSitePoolSize());
        webSiteFactory.getWebSiteByType("shop");
        System.out.println(webSiteFactory.getWebSitePoolSize());

        WebSite news = webSiteFactory.getWebSiteByType("news");
        news.used(new User("A"));
        System.out.println(webSiteFactory.getWebSitePoolSize());


    }
}
