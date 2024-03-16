package com.example.beans.factory.config;

import lombok.Data;
import lombok.Getter;

/**
 * bean 的相关信息类
 */

@Data
public class BeanDefinition {

    public static String SCOPE_SINGLETON = "singleton";
    public static String SCOPE_PROTOTYPE = "prototype";
    private Class<?> beanClass;
    private String initMethodName;
    private String destroyMethodName;
    private String scope = SCOPE_SINGLETON;
    private boolean singleton = true;
    private boolean prototype = false;
    private boolean lazyInit = false;

    /**
     * 设置Bean的作用域
     */
    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

}
