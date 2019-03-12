package com.clh.pattern.single.hungry;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/5$ 13:46$
 */
public class HungrySingle {

    private HungrySingle(){};

    private static final HungrySingle HUNGRY_SINGLE = new HungrySingle();

    public  static HungrySingle getInstance(){
        System.out.println(System.currentTimeMillis()+":"+ HUNGRY_SINGLE);
        return HUNGRY_SINGLE;
    }
}
