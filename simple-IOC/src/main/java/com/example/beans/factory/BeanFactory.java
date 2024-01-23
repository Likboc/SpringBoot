package com.example.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * simplest ioc container,Map<String,BeanDefinition> is the mainly content
 */
public class BeanFactory {
    // simplest bean container
    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name,Object bean) {
        beanMap.put(name,bean);
    }
    public Object getBean(String name){
        return beanMap.get(name);
    }
}
