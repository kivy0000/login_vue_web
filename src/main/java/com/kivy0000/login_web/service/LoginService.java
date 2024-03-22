package com.kivy0000.login_web.service;

import com.kivy0000.login_web.beans.Msg;
import com.kivy0000.login_web.beans.User;
import com.kivy0000.login_web.beans.UserMsg;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kivy0000
 * @version 1.0
 * 登录相关业务逻辑
 */
public interface LoginService {

    //实际登陆
    UserMsg userLogin(User user,HttpServletRequest hsr);

    //重置密码
    Msg resetPassword(User user, String expireTime, String vcode, HttpServletRequest hsr);
}
