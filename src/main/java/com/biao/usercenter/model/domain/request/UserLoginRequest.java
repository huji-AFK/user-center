package com.biao.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author biao
 */
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userAccount;
    private String userPassword;

    // Getter 方法
    public String getUserAccount() {
        return userAccount;
    }

    // Setter 方法
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    // Getter 方法
    public String getUserPassword() {
        return userPassword;
    }

    // Setter 方法
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
