package com.design.method;


import com.design.phone.Phone;

/**
 * 工厂方法
 *
 * @author lixiaolong@tinman.cn
 * @date 2020/11/18
 **/
public abstract class MethodFactory {

    /**
     * 生产手机
     *
     * @return
     */
    public abstract Phone create();
}
