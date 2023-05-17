package com.dailycodedeveloper.springbootdemo.controller;

import com.dailycodedeveloper.springbootdemo.entity.EmployeeEntity;
import com.dailycodedeveloper.springbootdemo.model.Employee;
import com.dailycodedeveloper.springbootdemo.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {

    @Qualifier("employeeV2ServiceImpl")
    @Autowired
    private EmployeeService employeeService;


    // CREATE EMPLOYEE
    @PostMapping
    public Employee save(@RequestBody Employee employee){

        return employeeService.save(employee);
    }
    // GET EMPLOYEE



}
