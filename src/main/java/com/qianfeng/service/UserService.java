package com.qianfeng.service;

import com.qianfeng.vo.LoginInfoVO;

import javax.servlet.http.HttpSession;

public interface UserService {
    String login(LoginInfoVO loginInfoVO, HttpSession session);
    String  register(LoginInfoVO loginInfoVO);
}
