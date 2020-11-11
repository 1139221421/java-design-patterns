package com.design.service;

import com.design.constant.LoginType;
import com.design.factory.LoginSimpleFactory;
import com.design.login.AbstractLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登陆实现
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Service
public class LoginService {

    @Autowired
    private LoginSimpleFactory loginSimpleFactory;

    /**
     * 模拟账号登陆
     */
    public void userAccountLogin() {
        System.out.println("====================账号登陆模拟开始====================");
        AbstractLogin login = loginSimpleFactory.getService(LoginType.USER_ACCOUNT);
        login(login);
    }

    public void phoneNumberLogin() {
        System.out.println("====================手机号登录模拟开始====================");
        AbstractLogin login = loginSimpleFactory.getService(LoginType.PHONE_NUMBER);
        login(login);
    }

    public void weChatLogin() {
        System.out.println("====================微信登录模拟开始====================");
        AbstractLogin login = loginSimpleFactory.getService(LoginType.WE_CHAT);
        login(login);
    }

    /**
     * 模拟登陆实心
     *
     * @param login
     */
    private void login(AbstractLogin login) {
        login.verifyParam();
        login.verifyUser();
        login.joinUserData();
    }

}
