package org.springframework.test.bean;

import com.example.beans.PropertyValue;
import com.example.beans.PropertyValues;
import com.example.beans.factory.BeansException;
import com.example.beans.factory.config.BeanDefinition;
import com.example.beans.factory.support.DefaultListableBeanFactory;
import lombok.Getter;
import org.junit.Test;

public class PopulateBeanWithPvTest {

    @Getter
    private String name;

    @Test
    public void test() throws BeansException {
        PropertyValues propertyValues = new PropertyValues();
        PropertyValue propertyValue = new PropertyValue("name","mike");
        propertyValues.addPropertyValue(propertyValue);
        BeanDefinition beanDefiniton = new BeanDefinition(PopulateBeanWithPvTest.class,propertyValues);
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerBeanDefinition("test",beanDefiniton);
        PopulateBeanWithPvTest bean = (PopulateBeanWithPvTest) defaultListableBeanFactory.getBean("test");
        // TODO 实例化后反射设置属性
        System.out.println(bean.getName());
    }
}
