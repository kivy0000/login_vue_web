package com.kivy0000.login_web.configs;

import com.kivy0000.login_web.utils.MailUtil;
import com.mysql.jdbc.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kivy0000
 * @version 1.0
 * -
 * This class is used for Mail Util utility class initialization
 * 这个类用于MailUtil工具类的初始化
 */
@Configuration
@ConfigurationProperties(prefix = "mailutil")
public class MailUtilConfig {
    public String defaultSender;
    public String defaultPassword;

    @PostConstruct
    public void init() {
        MailUtil.setDefaultSender(defaultSender);
        MailUtil.setDefaultPassword(defaultPassword);
        /*Check the null pointer exception in advance to prevent service module problems*/
        if (StringUtils.isNullOrEmpty(MailUtil.getDefaultSender())
                || StringUtils.isNullOrEmpty(MailUtil.getDefaultPassword())) {
            Logger.getGlobal().log(Level.SEVERE, "ATTENTION: DefaultSender and DefaultPassword of MailUtil failed to be initialized, please check the configuration file");
            throw new RuntimeException("ATTENTION: DefaultSender and DefaultPassword of MailUtil failed to be initialized, please check the configuration file");
        }
    }

    public String getDefaultSender() {
        return defaultSender;
    }

    public void setDefaultSender(String defaultSender) {
        this.defaultSender = defaultSender;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }
}
