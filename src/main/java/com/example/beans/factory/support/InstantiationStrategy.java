package com.example.beans.factory.support;

import com.example.beans.factory.config.BeanDefinition;

/**
 *  通过反射实现Bean的创建接口
 */
public interface InstantiationStrategy {
    Object instantiate (BeanDefinition beanDefinition) throws Exception;
}
