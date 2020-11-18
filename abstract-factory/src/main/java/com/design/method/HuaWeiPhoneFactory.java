package com.design.method;


import com.design.phone.HuaWeiPhone;
import com.design.phone.Phone;

/**
 * 华为工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class HuaWeiPhoneFactory extends MethodFactory {

    @Override
    public Phone create() {
        return new HuaWeiPhone();
    }
}
