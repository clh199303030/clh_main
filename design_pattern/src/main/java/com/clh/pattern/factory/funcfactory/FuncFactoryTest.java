package com.clh.pattern.factory.funcfactory;

/**
 * @Description: $方法工厂测试
 * @author: clh
 * @Date: 2019/3/5$ 10:35$
 */
public class FuncFactoryTest {
    public static void main(String[] args) {
        FuncFactory factory = new MengNiuFactory();
        System.out.println(factory.getMilk());
    }
}
