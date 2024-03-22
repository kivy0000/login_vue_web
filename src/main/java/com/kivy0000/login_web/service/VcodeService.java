package com.kivy0000.login_web.service;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kivy0000
 * @version 1.0
 * vcode相关业务逻辑
 */

public interface VcodeService {

    //获取注册验证码
    Msg getRegisterVcode(User user, HttpServletRequest httpServletRequest);

    //获取重置验证码
    Msg getResetVcode(User user, HttpServletRequest httpServletRequest);
}
