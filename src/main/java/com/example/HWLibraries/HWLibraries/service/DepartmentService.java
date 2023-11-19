package com.example.HWLibraries.HWLibraries.service;

import com.example.HWLibraries.HWLibraries.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {

    String greetingsDepartments();

    Employee departmentsMinSalary(Integer department);
    Employee departmentsMaxSalary(Integer department);
    List<Employee> departmentList(Integer department);

    Map<Integer,List<Employee>> departmentsMap();
}
