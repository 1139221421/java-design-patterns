package com.design.method;


import com.design.phone.Phone;

/**
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public class Test {

    public static void main(String[] arg) {
        MethodFactory xiaoMiFactory = new XiaoMiPhoneFactory();
        Phone xiaoMi = xiaoMiFactory.create();
        xiaoMi.make();

        MethodFactory huaWeiFactory = new HuaWeiPhoneFactory();
        Phone huaWei = huaWeiFactory.create();
        huaWei.make();
    }
}
