package com.clh.pattern.single.hungry;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/5$ 13:46$
 */
public class HungryStaticSingle {

    private HungryStaticSingle(){};

    private static final HungryStaticSingle HUNGRY_SINGLE ;

    static {
        HUNGRY_SINGLE = new HungryStaticSingle();
    }

    public  static HungryStaticSingle getInstance(){
        System.out.println(System.currentTimeMillis()+":"+ HUNGRY_SINGLE);
        return HUNGRY_SINGLE;
    }
}
