package com.design.factory;

import com.design.login.AbstractLogin;
import com.design.login.PhoneNumberLogin;
import com.design.login.UserAccountLogin;
import com.design.login.WeChatLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Service
public class LoginMethodFactory {

    @Autowired
    private UserAccountLogin userAccountLogin;

    @Autowired
    private PhoneNumberLogin phoneNumberLogin;

    @Autowired
    private WeChatLogin weChatLogin;

    public AbstractLogin getUserAccountLoginService() {
        return userAccountLogin;
    }

    public AbstractLogin getPhoneNumberLoginService() {
        return phoneNumberLogin;
    }

    public AbstractLogin getWeChatLoginService() {
        return weChatLogin;
    }
}
