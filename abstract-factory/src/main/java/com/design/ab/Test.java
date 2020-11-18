package com.design.ab;


import com.design.pc.Pc;
import com.design.phone.Phone;

/**
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class Test {

    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Phone huaWeiPhone = huaWeiFactory.makePhone();
        huaWeiPhone.make();

        Pc huaWeiPc = huaWeiFactory.makePc();
        huaWeiPc.makePc();
    }
}
