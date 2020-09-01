package com.lp.payment;

public class PayTest {


    public static void main(String[] args) throws Exception {
        Order order = new Order();
        Product p = new Product("产品A",113);
        Product p1 = new Product("产品B",116);
        Order.products.add(p);
        Order.products.add(p1);
        Order.products.remove(p1);
        order.cal(Order.products);

        PayFactory.getPayMethod(Constant.cjk).pay(order.cal(Order.products));

    }
}
