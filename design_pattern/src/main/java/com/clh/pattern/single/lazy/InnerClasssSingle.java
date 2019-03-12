package com.clh.pattern.single.lazy;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/12$ 13:51$
 */
public class InnerClasssSingle {

    private  InnerClasssSingle(){
        /**
         * 防止反射创建实例
         */
        if(null != LazyHolder.INNER_CLASSS_SINGLE){
            throw new RuntimeException ("不能创建多个实例");
        }
    };

    public static final InnerClasssSingle getInstance(){
        return  LazyHolder.INNER_CLASSS_SINGLE;
    }

    /**
     * 内部类实现单例
     */
    public static class  LazyHolder{
        private static final InnerClasssSingle INNER_CLASSS_SINGLE = new InnerClasssSingle();

        /**
         * 防止序列化破坏单例
         * @return
         */
        private Object readResolve(){
            return INNER_CLASSS_SINGLE;
        }
    }


}
