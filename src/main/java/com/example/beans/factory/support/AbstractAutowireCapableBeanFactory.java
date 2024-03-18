package com.example.beans.factory.support;

import com.example.beans.PropertyValue;
import com.example.beans.factory.config.AutowireCapableBeanFactory;
import com.example.beans.factory.config.BeanDefinition;
import com.example.beans.factory.config.BeanPostProcessor;
import lombok.Data;

import java.lang.reflect.Field;

/**
 * 引入实例化类，
 * autowire自动注入,负责bean的创建，后置处理器的调用。
 */
@Data
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(BeanDefinition beanDefinition) {
        Object bean;
        try {
            bean = getInstantiationStrategy().instantiate(beanDefinition);
            // TODO 遍历属性进行赋值
            // TODO 后置器逻辑相关
//            applyPropertyValues(beanDefinition,bean);
            return bean;
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return null;
    }

    @Override
    public Object applyBeanPostProcessorsAfterInitialization(Object bean, String name) {
        return null;
    }

    @Override
    public Object applyBeanPostProcessorsBeforeInitialization(Object bean, String name) {
        return null;
    }

    /**
     * 填充属性
     */
    public void applyPropertyValues(BeanDefinition beanDefinition, Object bean) throws IllegalAccessException {
        Class<?> clazz = bean.getClass();
        for(PropertyValue pv : beanDefinition.getPropertyValues().getPropertyValueList()){
            for ( Field field : clazz.getDeclaredFields()) {
                if(pv.getName() == field.getName()) {
                    field.set(bean,pv.getValue());
                }
            }
        }
    }
}
