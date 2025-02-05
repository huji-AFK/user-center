package com.biao.usercenter.service;

import com.biao.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author HP
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-23 21:55:18
*/
public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 二次密码
     * @return 用户ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    User doLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User originUser);

    int logout(HttpServletRequest request);
}
