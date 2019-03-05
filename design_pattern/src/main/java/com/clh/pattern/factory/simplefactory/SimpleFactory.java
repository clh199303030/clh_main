package com.clh.pattern.factory.simplefactory;

import com.clh.pattern.factory.MengNiu;
import com.clh.pattern.factory.Milk;
import com.clh.pattern.factory.YiLi;

/**
 * @author clh
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 简单工厂模式
 * @date 2019/3/59:50
 */
public class SimpleFactory {

   public  Milk getMilk(String name){
       switch (name){
           case "蒙牛":
               return  new MengNiu();
           case "伊利":
                return new YiLi();
            default:
                System.out.println("没有对应产品不能生产！！！！");
                return null;
       }
   };

}
