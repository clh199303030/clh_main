package com.clh.pattern.factory.funcfactory;

import com.clh.pattern.factory.MengNiu;
import com.clh.pattern.factory.Milk;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/5$ 10:30$
 */
public class MengNiuFactory implements FuncFactory {
    @Override
    public Milk getMilk() {
        return  new MengNiu();
    }
}
