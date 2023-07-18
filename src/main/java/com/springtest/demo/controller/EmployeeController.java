package com.springtest.demo.controller;

import com.springtest.demo.entity.Employee;
import com.springtest.demo.model.RequestEmployeeDetails;
import com.springtest.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployeeDetails")
    public List<Employee> getEmployeeDetails() {

        return employeeService.getEmpInfo();
    }


    @PostMapping("/addEmployeeDetails")

    public Employee addEmployeeDetails(@RequestBody RequestEmployeeDetails requestEmployeeDetails) {
        return employeeService.addEmployeeDetails(requestEmployeeDetails);
    }

    @DeleteMapping("/deleteEmployeeDetails/{id}")
    public String deleteEmployeeDetails(@PathVariable int id) {
        return employeeService.deleteEmployeeDetails(id);
    }
}
