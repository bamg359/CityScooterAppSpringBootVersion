package com.cesde.cityscooterapp.application.inpurport;

import com.cesde.cityscooterapp.domain.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee UpdateEmployee(Employee employee);

    Employee getEmployeeById(int id);




}
