package com.example.beans.factory.support;

import com.example.beans.factory.config.AutowireCapableBeanFactory;
import com.example.beans.factory.config.BeanDefinition;

public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {
    @Override
    public Object applyBeanPostProcessorsAfterInitialization(Object bean, String name) {
        return null;
    }

    @Override
    public Object applyBeanPostProcessorsBeforeInitialization(Object bean, String name) {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return null;
    }
}
