package com.example.beans.factory.support;


import com.example.beans.factory.config.BeanDefinition;

/**
 * bean 基本接口，实现注册功能，同时提供BeanFactory接口功能。
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
    BeanDefinition getBeanDefinition(String beanName);
    boolean containsBeanDefinition(String beanName);
    String[] getBeanDefinitionNames();
}
