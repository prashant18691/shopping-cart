package com.shoppingcart.shoppingcart.model;

public class ItemFactory {
    public static Item getItem(ItemAbstractFactory itemAbstractFactory){
        return itemAbstractFactory.getItem();
    }
}
