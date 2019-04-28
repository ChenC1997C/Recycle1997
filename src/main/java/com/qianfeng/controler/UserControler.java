package com.qianfeng.controler;

import com.qianfeng.service.ServiceImpl.UserServiceImpl;
import com.qianfeng.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserControler {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(LoginInfoVO loginInfoVO , HttpSession session){

        return  userService.login(loginInfoVO,session);
    }
    @RequestMapping("/register")
    public String register(LoginInfoVO loginInfoVO){
        return  userService.register(loginInfoVO);
    }
}
