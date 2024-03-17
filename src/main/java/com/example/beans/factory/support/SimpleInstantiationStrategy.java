package com.example.beans.factory.support;

import com.example.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 基于反射实现Bean的创建
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws Exception {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?> constructor = beanClass.getDeclaredConstructor();
        return constructor.newInstance();
    }
}
