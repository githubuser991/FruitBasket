package com.clouting;

/**
 * Class storing the price and of quantity of fruit in the basket
 */
public class FruitInfo {

    private final Fruit fruit;
    private int quantity;

    public FruitInfo(final Fruit fruit) {
        this.fruit = fruit;
        quantity = 0;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public double getTotalCost() {
        return fruit.getPrice() * quantity;
    }
}
