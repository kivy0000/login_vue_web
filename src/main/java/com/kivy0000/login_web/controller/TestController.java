package com.kivy0000.login_web.controller;

import com.kivy0000.login_web.utils.MailUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author kivy0000
 * @version 1.0
 * THIS CLASS PROMPTS FOR INITIALIZATION
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        String defaultPassword = MailUtil.getDefaultPassword();
        String defaultSender = MailUtil.getDefaultSender();
        System.out.println(defaultSender + defaultPassword);
        return defaultSender != null && defaultPassword != null && !defaultSender.equals("") && !defaultPassword.equals("")
                ? "初始化完成，你的验证码默认发件人为" + defaultSender + "，默认发件人授权码" + defaultPassword
                : "初始化失败，请检查application.yml文件";
    }

}
