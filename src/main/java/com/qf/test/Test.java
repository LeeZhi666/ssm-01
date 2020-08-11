package com.qf.test;

import com.qf.pojo.Employee;
import com.qf.service.EmployeeService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Autowired
    private EmployeeService employeeService;

    @org.junit.Test
    public void test(){
        List<Employee> all = employeeService.findAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }
    }
}
