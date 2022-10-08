package com.training.spring.aspects;


import org.aspectj.lang.JoinPoint;
 
public class LoggingAspect {
 
    public void logAfterAllMethods(JoinPoint jp) throws Throwable 
    {
        System.out.println("****LoggingAspect.logBeforeAllMethods() " + jp.getSignature().getName());
    }
}