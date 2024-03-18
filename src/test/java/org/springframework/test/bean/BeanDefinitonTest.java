package org.springframework.test.bean;

import com.example.beans.factory.BeanFactory;
import com.example.beans.factory.BeansException;
import com.example.beans.factory.config.BeanDefinition;
import com.example.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class BeanDefinitonTest {

    @Test
    public void test() throws BeansException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(BeanDefinitonTest.class);
        beanFactory.registerBeanDefinition("Hello",beanDefinition);
        BeanDefinitonTest hello = (BeanDefinitonTest) beanFactory.getBean("Hello");
        hello.sayHi();
    }

    public void sayHi(){
        System.out.println("hi");
    }

}
