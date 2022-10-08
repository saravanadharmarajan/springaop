package com.training.spring.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
  
        ApplicationContext context = new ClassPathXmlApplicationContext
                  ("Beans.xml");
 
        EmployeeManager manager = context.getBean(EmployeeManager.class);
  
        manager.getEmployeeById(1);
        manager.createEmployee(1);
    }
}