package com.example.beans.factory.config;

import com.example.beans.factory.BeanFactory;

public interface BeanFactoryPostProcessor {
    /**
     * beandefinition loaded completed, but before the bean initialization
     * @param beanFactory
     */
    void postProcessBeanFactory(BeanFactory beanFactory);
}
