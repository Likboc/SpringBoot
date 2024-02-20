package com.example.aop;

/**
 * Joinpoint's description, only support method's level
 */
public interface Pointcut {
    ClassFilter getClassFilter();
}
