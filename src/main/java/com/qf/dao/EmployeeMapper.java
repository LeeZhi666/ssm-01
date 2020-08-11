package com.qf.dao;

import com.qf.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeMapper {
    List<Employee> findAll();
}
