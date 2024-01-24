package com.example.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * IOC's basic interface, provide simple get method of bean;
 */
public interface BeanFactory {
    Object getBean(String name);
    boolean containsBean(String name);
}
