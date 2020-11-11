package com.design.constant;

import lombok.Getter;

/**
 * 登录类型
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Getter
public enum LoginType {
    /**
     * 普通登录
     */
    USER_ACCOUNT("USER_ACCOUNT"),
    /**
     * 手机号登录
     */
    PHONE_NUMBER("PHONE_NUMBER"),
    /**
     * 微信登录
     */
    WE_CHAT("WE_CHAT");

    LoginType(String type) {
        this.type = type;
    }

    private final String type;
}
