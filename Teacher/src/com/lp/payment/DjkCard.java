package com.lp.payment;

public class DjkCard extends  Card{
    @Override
    public void doPay() {
        System.out.println("1、准备开始【贷记卡】");
        System.out.println("2、计算金额【贷记卡】");
        System.out.println("3、开始付款【贷记卡】");
    }

    @Override
    public void pay(int count){
        doPay();
        System.out.println("支付："+count);
    }


    @Override
    public int getType() {
        return Constant.djk;
    }
}
