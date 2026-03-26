package com.cesde.cityscooterapp.services;


import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }
}
