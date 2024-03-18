package com.example.beans.factory.support;

import com.example.beans.factory.BeanFactory;
import com.example.beans.factory.BeansException;
import com.example.beans.factory.config.BeanDefinition;
import com.example.beans.factory.config.BeanPostProcessor;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    private List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    /**
     * 根据名称获取Bean
     * @param name
     * @return
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        // TODO FactoryBean需要调用getObject方法
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        // TODO FactoryBean
        return createBean(beanDefinition);
    }

    /**
     * 确认是否包含bean
     * @param beanName
     * @return
     */
    @Override
    public boolean containsBean(String beanName) {
        return containsBeanDefinition(beanName);
    }

    /**
     * 创建一个Bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object createBean(BeanDefinition beanDefinition);

    protected abstract boolean containsBeanDefinition(String beanName);


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 添加后置处理器
     * 进行防重处理
     * @param beanPostProcessor
     */
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * 获取所有后置处理器
     * @return
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

}
