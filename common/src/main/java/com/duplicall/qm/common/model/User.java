package com.duplicall.qm.common.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Administrator on 2017/2/7.
 */
@XmlRootElement(name = "user")
public class User {
    private int id;
    private String loginId, password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
