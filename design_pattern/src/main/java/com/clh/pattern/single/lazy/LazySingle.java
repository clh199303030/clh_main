package com.clh.pattern.single.lazy;
/**
 * @Description: $懒汉式单例
 * @author: clh
 * @Date: 2019/3/12$ 11:32$
 */
public class LazySingle {
    /**
     * 私有构造
     */
    private LazySingle(){};

    /**
     * 声明对象
     */
    private static  LazySingle lazy = null;

    /**
     * 获取实例
     * @return
     */
    public static LazySingle getInstance(){
        if(null == lazy){
            lazy = new LazySingle();
        }
        return  lazy;
    }
}
