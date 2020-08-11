package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Employee;
import com.qf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/hrms")
public class EmployeeController {
@Autowired
     private EmployeeService employeeService;
    @RequestMapping("/emp/getEmpList")
    public ModelAndView getEmpList(@RequestParam(defaultValue = "1") Integer pageNo){
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNo,5);
        List<Employee> all = employeeService.findAll();
        PageInfo pageInfo = new PageInfo<>(all);
        List list = pageInfo.getList();
        for (Object o : list) {
            System.out.println(o);
        }

        modelAndView.setViewName("employeePage");
        modelAndView.addObject("employees",list)
                .addObject("totalItems",pageInfo.getTotal())
                .addObject("totalPages",pageInfo.getPages())
                .addObject("curPage",pageNo);
        System.out.println(pageInfo.getTotal());
        return modelAndView;
    }
}
