package com.guiying.module.news.service;

/**
 * Created by mac on 2018/4/25.
 */

public class MainClass {
    public static void main(String[] args) {
        NewService invoker=(NewService)new Invoker().getInstance(NewService.class);
        invoker.getNews();
    }
}
