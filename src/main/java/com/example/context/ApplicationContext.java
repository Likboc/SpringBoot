package com.example.context;

import com.example.beans.factory.HierarchicalBeanFactory;
import com.example.beans.factory.ListableBeanFactory;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ApplicationEventPublisher{
}
