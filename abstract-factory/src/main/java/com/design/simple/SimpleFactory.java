package com.design.simple;


import com.design.phone.HuaWeiPhone;
import com.design.phone.Phone;
import com.design.phone.XiaoMiPhone;

/**
 * 简单工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class SimpleFactory {

    public <T extends Phone> T create(Class<T> c) throws Exception {
        return c.newInstance();
    }

    public static void main(String[] args) throws Exception {
        SimpleFactory simpleFactory = new SimpleFactory();
        XiaoMiPhone xiaoMiPhone = simpleFactory.create(XiaoMiPhone.class);
        xiaoMiPhone.make();

        HuaWeiPhone huaWeiPhone = simpleFactory.create(HuaWeiPhone.class);
        huaWeiPhone.make();
    }
}
