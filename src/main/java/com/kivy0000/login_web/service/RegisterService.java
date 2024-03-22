package com.kivy0000.login_web.service;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kivy0000
 * @version 1.0
 * 注册相关业务逻辑
 */
public interface RegisterService {

    //注册方法
    public Msg registerUser(User user, String vcode, HttpServletRequest hsr, String expireTime);
}
