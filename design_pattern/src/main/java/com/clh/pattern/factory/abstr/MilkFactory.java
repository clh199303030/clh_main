package com.clh.pattern.factory.abstr;

import com.clh.pattern.factory.MengNiu;
import com.clh.pattern.factory.Milk;
import com.clh.pattern.factory.YiLi;

/**
 * @Description: $牛奶工厂
 * @author: clh
 * @Date: 2019/3/5$ 10:42$
 */
public class MilkFactory extends AbstrFactory {
    @Override
    public Milk getMengNiu() {
        return new MengNiu();
    }

    @Override
    public Milk getYiLi() {
        return new YiLi();
    }
}
