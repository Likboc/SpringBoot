package com.example.beans.factory.Impl;

import com.example.beans.factory.BeanFactory;
import java.util.HashMap;
import java.util.Map;


public class BeanFactoryImpl implements BeanFactory {

    // 存储 Bean 的Singleton实例
    Map<String,Object> simpleBeanMap = new HashMap<>();

    @Override
    public boolean containsBean(String name) {
        return simpleBeanMap.containsKey(name);
    }

    @Override
    public Object getBean(String name) {
        return simpleBeanMap.get(name);
    }

}
