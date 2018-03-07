package com.shoppingcart.shoppingcart.model;

public abstract class Item{
    private int id;
    private double price;

    public Item(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Item)obj).id==this.id;
    }
}
