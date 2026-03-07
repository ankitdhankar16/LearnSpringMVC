package com.dhankar.LearnSpringMVC.controller;

import com.dhankar.LearnSpringMVC.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

    @GetMapping()
    public String getAllEmployees(@RequestParam(required = false) String sortBy , @RequestParam (required = false)String filter){
        return "All Employees" + sortBy + filter;
    }

    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable Long id){
        return "Employee id is "+ id;
    }
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(10000L);
        return inputEmployee;
    }

}
