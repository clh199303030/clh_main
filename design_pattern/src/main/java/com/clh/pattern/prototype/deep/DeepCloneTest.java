package com.clh.pattern.prototype.deep;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/13$ 13:50$
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTIanDaSheng q1 = new QiTIanDaSheng();

        try{
            QiTIanDaSheng q2 = (QiTIanDaSheng)q1.clone();
            System.out.println("深度克隆"+(q2.jinGuBang == q1.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTIanDaSheng q3 = new QiTIanDaSheng();
        QiTIanDaSheng q4 = q3.shallowClone(q3);
        System.out.println("弱克隆" + (q3.jinGuBang == q4.jinGuBang) );
    }
}
