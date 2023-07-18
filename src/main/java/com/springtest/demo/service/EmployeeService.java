package com.springtest.demo.service;

import com.springtest.demo.entity.Employee;
import com.springtest.demo.model.RequestEmployeeDetails;
import com.springtest.demo.repository.EmpRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepoImpl empRepoImpl;
    public List<Employee> getEmpInfo(){

        return empRepoImpl.getEmployee();
    }

    public Employee addEmployeeDetails(RequestEmployeeDetails requestEmployeeDetails) {
      return  empRepoImpl.saveEmployeeDetails(requestEmployeeDetails);
    }

    public String deleteEmployeeDetails(int id) {
        return empRepoImpl.deleteEmployeeDetails(id);
    }
}

