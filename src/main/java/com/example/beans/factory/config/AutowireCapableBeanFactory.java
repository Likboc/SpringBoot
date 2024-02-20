package com.example.beans.factory.config;

import com.example.beans.factory.BeanFactory;

/**
 * BeanFactory improvement
 * provide new method : postProcessor supported
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    Object applyBeanPostProcessorsBeforeInitialization(Object bean,String name);
    Object applyBeanPostProcessorsAfterInitialization(Object bean,String name);
}
