package com.example.aop.aspectj;

import com.example.aop.Advice;
import lombok.Data;

@Data
public class AspectJExpressionPointcutAdvisor {

    private AspectJExpressionPointcut pointcut;

    private Advice advice;

    private String expression;

}
