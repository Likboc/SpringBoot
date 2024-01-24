package com.example.beans.factory.config;

/**
 * bean attribute value, include class type & field
 */
public class BeanDefinition {

    public static String SCOPE_SINGLETON = "singleton";
    public static String SCOPE_PROTOTYPE = "prototype";
    //bean class type
     private Class<?> beanClass;
     // constructor method name of bean;
     private String initMethodName;
     // destroy method name of bean;
     private String destroyMethodName;
     // bean default scope
     private String scope = SCOPE_SINGLETON;
     private boolean singleton = true;
     private boolean prototype = false;
     private boolean lazyInit = false;

    /**
     * set bean scope
     */
    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public Class<?> getBeanClass(){
        return this.beanClass;
    }

}
