package com.biao.usercenter.service;

import com.biao.usercenter.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * 用户服务测试
 *
 * @author biao
 */
@SpringBootTest
class UserServiceTest {

    @Resource
     private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("test");
        user  .setUserAccount("1234");
        user.setAvatarUrl("dsfgsdfgdf");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("234");
        user.setEmail("234");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String  userAccount = "huhu";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        long l = userService.userRegister(userAccount, userPassword, checkPassword);
        System.out.println(l);

    }
}