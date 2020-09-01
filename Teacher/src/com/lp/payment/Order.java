package com.lp.payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    static  List<Product> products = new ArrayList<>();

    public void add(Product p){
        products.add(p);
    }
    public  void delete(Product p){
        products.remove(p);
    }
    public int cal(List<Product> products ){
        return products.parallelStream().mapToInt(p->p.getPrice()).sum();
    }


}
