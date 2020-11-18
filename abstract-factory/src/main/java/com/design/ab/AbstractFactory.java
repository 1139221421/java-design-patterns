package com.design.ab;


import com.design.pc.Pc;
import com.design.phone.Phone;

/**
 * 抽象工厂
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public abstract class AbstractFactory {

    /**
     * 生产手机(产品族概念)
     *
     * @return
     */
    public abstract Phone makePhone();

    /**
     * 生产电脑(产品族概念)
     *
     * @return
     */
    public abstract Pc makePc();
}
