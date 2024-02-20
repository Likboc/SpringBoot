package com.example.beans.factory.support;

public interface FactoryBean<T> {

    T getObject();

    boolean isSingleton();
}
