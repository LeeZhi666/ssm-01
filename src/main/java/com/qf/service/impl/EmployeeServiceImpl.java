package com.qf.service.impl;

import com.qf.dao.EmployeeMapper;
import com.qf.pojo.Employee;
import com.qf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
