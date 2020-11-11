package com.design.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class LoginServiceTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void testLogin() {
        loginService.userAccountLogin();
        loginService.phoneNumberLogin();
        loginService.weChatLogin();
    }

}
