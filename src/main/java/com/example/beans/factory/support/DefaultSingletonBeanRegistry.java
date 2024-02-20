package com.example.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

/**
 * features: 3 layers cache implemented to improve the performance
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{
    private Map<String,Object> beanMap = new HashMap<>(256);
    @Override
    public void addSingleton(String beanName, Object singletonObject) {
        beanMap.put(beanName,singletonObject);
    }

    @Override
    public Object getSingleton(String beanName) {
        return beanMap.get(beanName);
    }
}
