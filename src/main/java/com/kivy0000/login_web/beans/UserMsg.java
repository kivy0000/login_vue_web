package com.kivy0000.login_web.beans;
import java.io.Serializable;
import java.util.List;

/**
 * @author kivy0000
 * @version 1.0
 */

public class UserMsg implements Serializable {
    private Integer code;
    private String vcode;
    private String text;
    private List<User> info;

    public UserMsg() {
    }

    public UserMsg(Integer code, String vcode, String text, List<User> info) {
        this.code = code;
        this.vcode = vcode;
        this.text = text;
        this.info = info;
    }

    public UserMsg(Integer code, String vcode, String text) {
        this.code = code;
        this.vcode = vcode;
        this.text = text;
    }

    public UserMsg(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<User> getInfo() {
        return info;
    }

    public void setInfo(List<User> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", vcode='" + vcode + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public static UserMsg buildMsg(Integer code, String vcode, String text) {
        return new UserMsg(code, vcode, text);
    }

    public static UserMsg buildSimpleMsg(Integer code, String text) {
        return new UserMsg(code, text);
    }

    public static UserMsg buildAllMsg(Integer code, String vcode, String text, List<User> info) {
        return new UserMsg(code, vcode, text, info);
    }
}
