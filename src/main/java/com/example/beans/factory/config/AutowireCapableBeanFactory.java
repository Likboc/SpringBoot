package com.example.beans.factory.config;

import com.example.beans.factory.BeanFactory;

/**
 * 后置器处理接口
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    Object applyBeanPostProcessorsBeforeInitialization(Object bean,String name);
    Object applyBeanPostProcessorsAfterInitialization(Object bean,String name);
}
