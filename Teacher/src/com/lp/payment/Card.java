package com.lp.payment;

public   abstract   class Card implements Pay {

    @Override
    public void pay(int count){
        System.out.println("鏀粯锛�"+count);
    }

    public abstract void   doPay();

    public abstract int   getType();


}
