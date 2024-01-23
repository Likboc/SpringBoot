package com.example.beans.factory.support;

import com.example.beans.factory.config.BeanDefinition;

import javax.swing.text.html.ObjectView;

/**
 *  use for generate bean, include default constructor & cglib
 */
public interface InstantiationStrategy {
    Object instantiate (BeanDefinition beanDefinition) throws Exception;
}
