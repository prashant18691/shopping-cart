package com.shoppingcart.shoppingcart.model;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Cart(){
        items = new HashMap<>();
    }
    private static class CartHelper{
        private static final Cart INSTANCE = new Cart();
    }

    public static Cart getInstance(){
        return CartHelper.INSTANCE;
    }
    private Map<Item,Integer> items;

    public  void addItems(Item item){
        if (items.containsKey(item))
            items.put(item,items.get(item)+1);
        else
        items.put(item,1);
    }

    public  double getTotalPrice(){
        double totalPrice = 0;
        for (Map.Entry<Item,Integer>  entry : items.entrySet())
            totalPrice+=entry.getKey().getPrice()*entry.getValue();
        if (items.size()>1)
            totalPrice+=0.125*totalPrice;
        return (double) Math.round(totalPrice * 100) / 100;
    }

}
