package com.clh.pattern.factory.abstr;

import com.clh.pattern.factory.Milk;

/**
 * @Description: $抽象工厂类
 * @author: clh
 * @Date: 2019/3/5$ 10:39$
 */
public abstract class AbstrFactory {
    /**
     * 获取蒙牛
     * @return
     */
    public  abstract Milk getMengNiu();

    /**
     * 获取伊利
     * @return
     */
    public  abstract Milk getYiLi();
}
