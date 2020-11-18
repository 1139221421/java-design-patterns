package com.design.method;


import com.design.phone.Phone;
import com.design.phone.XiaoMiPhone;

/**
 * 小米工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class XiaoMiPhoneFactory extends MethodFactory {

    @Override
    public Phone create() {
        return new XiaoMiPhone();
    }
}
