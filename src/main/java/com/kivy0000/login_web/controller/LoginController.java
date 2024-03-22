package com.kivy0000.login_web.controller;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;
import com.kivy0000.login_web.beans.UserMsg;
import com.kivy0000.login_web.service.LoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author kivy0000
 * @version 1.0
 * This class is used to provide registration login and related captCHA services
 * -
 * 这个类用于提供注册/登陆以及相关的验证码服务
 */
@RestController
public class LoginController {


    @Resource
    private LoginService loginService;

    @PostMapping("/login")
    public UserMsg userLogin(@RequestBody User user, HttpServletRequest httpServletRequest) {
        return loginService.userLogin(user, httpServletRequest);
    }

    @RequestMapping("/resetPassword/{vcode}/{expireTime}")
    public Msg resetPassword(@RequestBody User user, @PathVariable String expireTime,
                             @PathVariable String vcode, HttpServletRequest hsr) {
       return loginService.resetPassword(user, expireTime, vcode, hsr);
    }
}
