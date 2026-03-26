package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee UpdateEmployee(Employee employee);

    Employee getEmployeeById(int id);



}
