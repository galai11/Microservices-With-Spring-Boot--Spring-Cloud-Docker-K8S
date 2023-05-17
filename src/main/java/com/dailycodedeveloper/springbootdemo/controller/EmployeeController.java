package com.dailycodedeveloper.springbootdemo.controller;


import com.dailycodedeveloper.springbootdemo.model.Employee;
import com.dailycodedeveloper.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

    @Qualifier("employeeServiceImpl")
    @Autowired
    private EmployeeService employeeService;

    // CREATE EMPLOYEE
    @PostMapping
    public Employee save(@RequestBody  Employee employee){
        return employeeService.save(employee);
    }
    // GET EMPLOYEE
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    //GET EMPLOYEE BY ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }
    //DELETE EMPLOYEE BY ID
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id){
        return employeeService.deleteEmployeeById(id);
    }



}
