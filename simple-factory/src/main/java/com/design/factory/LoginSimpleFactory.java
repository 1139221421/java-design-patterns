package com.design.factory;

import com.design.constant.LoginType;
import com.design.login.AbstractLogin;
import com.design.login.PhoneNumberLogin;
import com.design.login.UserAccountLogin;
import com.design.login.WeChatLogin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 简单工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/12
 **/
@Service
public class LoginSimpleFactory {

    @Autowired
    private UserAccountLogin userAccountLogin;

    @Autowired
    private PhoneNumberLogin phoneNumberLogin;

    @Autowired
    private WeChatLogin weChatLogin;

    @Autowired
    private List<AbstractLogin> abstractLoginList;

    /**
     * 工厂创建具体的对象
     *
     * @param loginType
     * @return
     */
    public AbstractLogin getService(LoginType loginType) {
        if (LoginType.USER_ACCOUNT.equals(loginType)) {
            return userAccountLogin;
        } else if (LoginType.PHONE_NUMBER.equals(loginType)) {
            return phoneNumberLogin;
        } else if (LoginType.WE_CHAT.equals(loginType)) {
            return weChatLogin;
        } else {
            throw new IllegalArgumentException("login type not exist");
        }

//        // 优化方式
//        AbstractLogin abstractLogin = abstractLoginList.stream().filter(login -> login.check(loginType)).findFirst()
//            .orElse(null);
//        if (null == abstractLogin) {
//            throw new IllegalArgumentException("login type not exist");
//        }
//        return abstractLogin;
    }

}
