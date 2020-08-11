package com.qf.controller;

import com.qf.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hms")
public class LoginController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        System.out.println("yse");
        return "login";
    }
    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    @ResponseBody
    public JsonMsg dologin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(!"admin123".equals(username+""+password)){
            return JsonMsg.fail().addInfo("login_error","用户名或密码错误");
        }else
            return JsonMsg.success();
    }
    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String main(){
        return "main";
    }
}
