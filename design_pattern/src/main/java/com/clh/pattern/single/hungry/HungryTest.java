package com.clh.pattern.single.hungry;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: $饿汉式单例
 * @author: clh
 * @Date: 2019/3/5$ 13:40$
 */
public class HungryTest {
    public static void main(String[] args) {
        int count =100;
        CountDownLatch lath  = new CountDownLatch(count);

        for (int i = 0 ; i < count; i++){
            new Thread() {
                @Override
                public void run() {
                    try {
                        HungrySingle.getInstance();
                        lath.await();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
            lath.countDown();
        }
    }
}
