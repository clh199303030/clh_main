package com.clh.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/13$ 13:18$
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("test");
        concretePrototypeA.setAge(6);
        List hb = new ArrayList<String>();
        hb.add("1111");
        concretePrototypeA.setHobbies(hb);
        System.out.println(concretePrototypeA);
        System.out.println(concretePrototypeA.getHobbies().toString());


        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClon(concretePrototypeA);
        System.out.println(copy);
        System.out.println(copy.getHobbies().toString());
        copy.getHobbies().add("2222");
        System.out.println(copy.getHobbies().toString());
        System.out.println(concretePrototypeA.getHobbies().toString());
        System.out.println("克隆对象中的引用类型地址值：" + copy.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较："+(copy.getHobbies() == concretePrototypeA.getHobbies()));
    }
}
