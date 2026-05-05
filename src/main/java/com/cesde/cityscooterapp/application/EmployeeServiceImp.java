package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inpurport.EmployeeService;
import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.infrastructure.out.adapter.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepositoryImpl;

    public EmployeeServiceImp(EmployeeRepositoryImpl employeeRepositoryImpl) {
        this.employeeRepositoryImpl = employeeRepositoryImpl;
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
