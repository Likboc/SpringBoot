package com.example.beans.factory;

/**
 * the most basic IOC 容器，由于功能分割，目前仅提供获取，查询功能。
 */
public interface BeanFactory {

    Object getBean(String name);
    boolean containsBean(String name);
}
