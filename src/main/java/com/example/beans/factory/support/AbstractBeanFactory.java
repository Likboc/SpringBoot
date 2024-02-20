package com.example.beans.factory.support;

import com.example.beans.factory.BeanFactory;
import com.example.beans.factory.config.BeanDefinition;
import com.example.beans.factory.config.BeanPostProcessor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBeanFactory implements BeanFactory {

    private List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    @Override
    public Object getBean(String name) {
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return null;
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName);

    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        //有则覆盖
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

}
