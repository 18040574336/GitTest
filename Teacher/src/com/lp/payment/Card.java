package com.lp.payment;

public   abstract   class Card implements Pay {

    @Override
    public void pay(int count){
        System.out.println("支付："+count);
    }

    public abstract void   doPay();

    public abstract int   getType();


}
