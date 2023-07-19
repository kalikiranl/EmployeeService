package com.springtest.demo.controller

import com.springtest.demo.entity.Employee;
import com.springtest.demo.service.EmployeeService;

import spock.lang.Specification;

final class EmployeeControllerSpec extends Specification {

    private def employeeService = Mock(EmployeeService);

    private def subject = new EmployeeController(employeeService);

    def 'getEmployeeDetails Test'(){

        given:
        List<Employee> listOfEmployee= List.of(new Employee(1, 'kali','address'));
        and:
        employeeService.getEmpInfo() >>  List.of(new Employee(1, 'kali','uk'));

        expect:

        assert subject.getEmployeeDetails(), listOfEmployee;


    }




}
