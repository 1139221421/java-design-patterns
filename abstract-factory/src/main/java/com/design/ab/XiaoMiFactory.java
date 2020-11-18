package com.design.ab;


import com.design.pc.Pc;
import com.design.pc.XiaoMiPc;
import com.design.phone.Phone;
import com.design.phone.XiaoMiPhone;

/**
 * 小米工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class XiaoMiFactory extends AbstractFactory {

    @Override
    public Phone makePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Pc makePc() {
        return new XiaoMiPc();
    }
}
