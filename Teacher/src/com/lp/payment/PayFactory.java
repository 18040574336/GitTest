package com.lp.payment;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class PayFactory {

    public static  Pay getPayMethod(int type) throws Exception {
        switch (type){
            case Constant.jjk:
               return new JjkCard();
            case Constant.cjk:
                return new CjkCard();
            case Constant.djk:
                return new DjkCard();
              default:
                  throw new Exception("not find ");

        }


    }
}
