package com.example.beans.factory;

/**
 * 顶级接口实现IOC基础功能
 * 工厂设计模式
 */
public interface BeanFactory {

    Object getBean(String name);
    boolean containsBean(String name);
}
