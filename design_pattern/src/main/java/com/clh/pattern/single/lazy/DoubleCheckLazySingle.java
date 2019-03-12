package com.clh.pattern.single.lazy;
/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/12$ 13:38$
 */
public class DoubleCheckLazySingle {

    private DoubleCheckLazySingle(){};

    private volatile  static  DoubleCheckLazySingle  doubleCheck ;

    public static DoubleCheckLazySingle getInstance(){
        if(null == doubleCheck){
            synchronized (DoubleCheckLazySingle.class){
                if(null == doubleCheck){
                    doubleCheck =  new DoubleCheckLazySingle();
                }
            }
        }
        return  doubleCheck;
    }


}
