package com.example.HWLibraries.HWLibraries.service;

import com.example.HWLibraries.HWLibraries.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> employeeList();
    Employee addEmployee(Employee employee) throws Exception;

    Employee removeEmployee(Employee employee) throws Exception;

    Employee findEmployee(Employee employee) throws Exception;

}
