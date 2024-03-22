package com.kivy0000.login_web.controller;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;
import com.kivy0000.login_web.service.RegisterService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author kivy0000
 * @version 1.0
 */

@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    /**
     * 注册方法
     *
     * @param user 前端 注册数据
     * @return 200/400的成功，失败数据
     */
    @RequestMapping("/register/{vcode}/{expireTime}")
    public Msg registerUser(@RequestBody User user, @PathVariable String vcode, HttpServletRequest hsr, @PathVariable String expireTime) {
        return registerService.registerUser(user, vcode, hsr, expireTime);
    }
}
