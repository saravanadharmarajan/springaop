package com.training.spring.aspects;

import org.aspectj.lang.JoinPoint;



public class MessageLogger {
	
	
	
	public void writeLogBefore(JoinPoint jp) throws Throwable
	{
		 System.out.println("****Logger called before invocation of "+jp.getSignature().getName());
	}
	
	public void writeLogAfter(JoinPoint jp) throws Throwable
	{
		 System.out.println("****Logger called after invocation of  "+jp.getSignature().getName());
	}
	
	
}
