package com.example.beans.factory.support;

import com.example.beans.factory.config.BeanDefinition;

/**
 *  use for generate bean, include default constructor & cglib
 */
public interface InstantiationStrategy {
    Object instantiate (BeanDefinition beanDefinition) throws Exception;
}
