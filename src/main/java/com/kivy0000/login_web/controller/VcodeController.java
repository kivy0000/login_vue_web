package com.kivy0000.login_web.controller;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;
import com.kivy0000.login_web.service.VcodeService;
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
public class VcodeController {


    @Resource
    private VcodeService vcodeService;

    /**
     * 注册验证码获取
     *
     * @return 200: 发送成功
     * 300: 账号/邮箱已注册，拒绝发送
     * 400: 邮箱错误，检查
     */
    @RequestMapping("/getVcode")
    public Msg sendRegisterVcode(@RequestBody User user, HttpServletRequest hsr) {
        return vcodeService.getRegisterVcode(user, hsr);
    }

    /**
     * 重置密码的验证码检查方法
     */
    @RequestMapping("/reSetVcode")
    public Msg logVcode(@RequestBody User user, HttpServletRequest hsr) {
        return vcodeService.getResetVcode(user, hsr);
    }
}
