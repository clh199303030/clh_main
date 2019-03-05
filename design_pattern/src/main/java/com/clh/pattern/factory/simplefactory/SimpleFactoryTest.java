package com.clh.pattern.factory.simplefactory;

import com.clh.pattern.factory.Milk;

/**
 * @Description: $测试简单工厂模式
 * @author: clh
 * @Date: 2019/3/5$ 9:58$
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("蒙牛"));
        System.out.println(factory.getMilk("1111"));
    }
}
