package com.example.beans.factory.support;

/**
 * default singleton bean registry
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
    void addSingleton(String beanName,Object singletonObject);
}
