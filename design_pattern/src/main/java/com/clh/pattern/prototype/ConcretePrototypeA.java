package com.clh.pattern.prototype;

import java.util.Date;
import java.util.List;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/13$ 13:06$
 */
public class ConcretePrototypeA implements Prototype {
    private String name;
    private int  age;
    private List hobbies;

    @Override
    public ConcretePrototypeA clone() {
        ConcretePrototypeA cncretePrototypeA  = new ConcretePrototypeA();
        cncretePrototypeA.setAge(this.age);
        cncretePrototypeA.setName(this.name);
        cncretePrototypeA.setHobbies(this.hobbies);
        return cncretePrototypeA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
