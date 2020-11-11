package com.design.login;

import com.design.constant.LoginType;

/**
 * 登录接口
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
public abstract class AbstractLogin {

    /**
     * 验证参数
     */
    public abstract void verifyParam();

    /**
     * 验证用户
     */
    public abstract void verifyUser();

    /**
     * 关联用户数据
     */
    public abstract void joinUserData();

    /**
     * 验证登录类型
     * @param loginType
     * @return
     */
    public abstract boolean check(LoginType loginType);

}
