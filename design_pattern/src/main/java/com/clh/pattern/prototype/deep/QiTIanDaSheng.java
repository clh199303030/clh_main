package com.clh.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/13$ 13:29$
 */
public class QiTIanDaSheng extends Monkey implements Cloneable, Serializable {

    public  JinGuBang jinGuBang;

    public QiTIanDaSheng(){
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    /**
     * 重写克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return  this.deepClone();
    }

    /**
     * 自定义克隆返回
     * @return
     */
    public  Object deepClone(){
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream objectOutput = new ObjectOutputStream(bout);
            objectOutput.writeObject(this);

            ByteArrayInputStream binput = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(binput);
            QiTIanDaSheng qiTIanDaSheng = (QiTIanDaSheng) objectInputStream.readObject();
            qiTIanDaSheng.birthday = new Date();
            return  qiTIanDaSheng;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 弱克隆
     * @param target
     * @return
     */
    public QiTIanDaSheng shallowClone(QiTIanDaSheng target){
        QiTIanDaSheng qiTianDaSheng = new QiTIanDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }

}
