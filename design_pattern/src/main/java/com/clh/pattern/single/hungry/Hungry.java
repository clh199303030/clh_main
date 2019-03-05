package com.clh.pattern.single.hungry;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/5$ 13:46$
 */
public class Hungry {

    private  Hungry(){};

    private static final Hungry hungry = new Hungry();

    public  static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }
}
