package com.clh.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @Description: $
 * @author: clh
 * @Date: 2019/3/13$ 13:27$
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
