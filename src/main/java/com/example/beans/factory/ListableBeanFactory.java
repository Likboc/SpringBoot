package com.example.beans.factory;

import java.util.List;

public interface ListableBeanFactory extends BeanFactory{
    List<Object> getBeans(String beanName);
}
