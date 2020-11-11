package com.design.login;

import com.design.constant.LoginType;
import org.springframework.stereotype.Service;

/**
 * 手机号登录
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Service
public class PhoneNumberLogin extends AbstractLogin {

    @Override
    public void verifyParam() {
        System.out.println("手机号登录-参数验证。。。");
    }

    @Override
    public void verifyUser() {
        System.out.println("手机号登录-用户验证。。。");
    }

    @Override
    public void joinUserData() {
        System.out.println("手机号登录-用户数据关联。。。");
    }

    @Override
    public boolean check(LoginType loginType) {
        return LoginType.PHONE_NUMBER.equals(loginType);
    }
}
