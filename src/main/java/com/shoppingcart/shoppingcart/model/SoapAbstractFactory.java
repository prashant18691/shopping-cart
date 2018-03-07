package com.shoppingcart.shoppingcart.model;

public class SoapAbstractFactory implements ItemAbstractFactory {
    private int id;
    private double price;

    public SoapAbstractFactory(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public Item getItem() {
        return new DoveSoap(id,price);
    }
}
