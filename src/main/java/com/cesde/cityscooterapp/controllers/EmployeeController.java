package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.services.EmployeeService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}


    @PostMapping("/create")
    Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee) ;
    }



}
