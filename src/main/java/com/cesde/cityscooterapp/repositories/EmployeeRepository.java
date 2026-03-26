package com.cesde.cityscooterapp.repositories;
import com.cesde.cityscooterapp.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository

public class EmployeeRepository {


    List<Employee> employees = new ArrayList<>(

            new ArrayList<>()

    );


    public Employee save(Employee employee){
        employees.add(employee);
        return employee;
    }



}
