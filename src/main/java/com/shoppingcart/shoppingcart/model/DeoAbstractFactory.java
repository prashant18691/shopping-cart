package com.shoppingcart.shoppingcart.model;

public class DeoAbstractFactory implements ItemAbstractFactory {
    private int id;
    private double price;

    public DeoAbstractFactory(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public Item getItem() {
        return new AxeDeo(id,price);
    }
}
