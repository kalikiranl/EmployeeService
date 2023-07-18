package com.springtest.demo.repository;

import com.springtest.demo.entity.Employee;
import com.springtest.demo.model.RequestEmployeeDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class EmpRepoImpl {
    @Autowired
    private EmpRepo empRepo;

    public List<Employee> getEmployee(){
       return  empRepo.findAll();
    }


    public Employee saveEmployeeDetails(RequestEmployeeDetails requestEmployeeDetails) {
        Employee employee = Employee.builder().id(requestEmployeeDetails.getId()).name(requestEmployeeDetails.getName())
                .address(requestEmployeeDetails.getAddress()).build();
        return empRepo.save(employee);
    }

    public String deleteEmployeeDetails(int id){
        Employee employee2 = Employee.builder().id(id).build();
        int count=0;
        try {
        count = empRepo.deleteEmployeeDetails(id);
        }
        catch (Exception e){
            log.error("Exception is found" + e.getCause());
        }
        return "No of Employee records deleted : " + count ;
    }
}
