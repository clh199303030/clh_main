package com.clh.pattern.factory.funcfactory;

import com.clh.pattern.factory.Milk;
import com.clh.pattern.factory.YiLi;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/5$ 10:31$
 */
public class YiLiFactory implements FuncFactory {
    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
