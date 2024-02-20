package com.example.beans.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String name);

    void addSingleton(String name,Object singletonObject);
}
