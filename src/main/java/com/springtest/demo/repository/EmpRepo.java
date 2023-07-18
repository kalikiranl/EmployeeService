package com.springtest.demo.repository;

import com.springtest.demo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
    @Modifying
    @Transactional
    @Query(value = "delete from Employee  where id=:id")
    int deleteEmployeeDetails(int id);
}
