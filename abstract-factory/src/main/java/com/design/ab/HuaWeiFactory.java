package com.design.ab;


import com.design.pc.HuaWeiPc;
import com.design.pc.Pc;
import com.design.phone.HuaWeiPhone;
import com.design.phone.Phone;

/**
 * 华为工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class HuaWeiFactory extends AbstractFactory {

    @Override
    public Phone makePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Pc makePc() {
        return new HuaWeiPc();
    }
}
