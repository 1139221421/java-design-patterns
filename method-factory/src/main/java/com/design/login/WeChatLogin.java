package com.design.login;

import org.springframework.stereotype.Service;

/**
 * 微信账号登录
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Service
public class WeChatLogin extends AbstractLogin {

    @Override
    public void verifyParam() {
        System.out.println("微信账号-参数验证。。。");
    }

    @Override
    public void verifyUser() {
        System.out.println("微信账号-用户验证。。。");
    }

    @Override
    public void joinUserData() {
        System.out.println("微信账号-用户数据关联。。。");
    }

}
