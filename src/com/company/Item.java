package com.company;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private boolean taxable;
    private String state;

    public Item(){

    }

    public Item(String name, double price, int quantity, boolean taxable, String state) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
        this.state = state;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }
    public double cost(){
        double subTotal = price * quantity;
        return subTotal;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
