package com.training.spring.aspects;

public class EmployeeManager
{
    public EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new EmployeeDTO();
    }
    
    public EmployeeDTO createEmployee(Integer employeeId) {
        System.out.println("Method createEmployee() called");
        return new EmployeeDTO();
    }
}