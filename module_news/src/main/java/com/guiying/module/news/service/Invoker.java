package com.guiying.module.news.service;

import java.lang.reflect.Proxy;

public class Invoker {
    
   
    public Object getInstance(Class<?> cls){        
        MethodProxy invocationHandler = new MethodProxy();        
        Object newProxyInstance = Proxy.newProxyInstance(
                cls.getClassLoader(),  
                new Class[] { cls }, 
                invocationHandler); 
        return (Object)newProxyInstance;
    }
}