package com.dhankar.LearnSpringMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
    @GetMapping
    public String getAllEmployees(){
        return "All Employees";
    }
    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable Long id){
        return "Employee id is "+ id;
    }

}
