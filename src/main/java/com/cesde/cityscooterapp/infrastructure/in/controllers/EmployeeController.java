package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.application.inpurport.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
