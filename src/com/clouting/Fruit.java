package com.clouting;

/**
 * Enum representing items of fruit which have a price.
 *
 * @author John Clouting
 */
public enum Fruit {

    // Fruit prices
    BANANA("Banana", 0.50),
    ORANGE("Orange", 0.40),
    APPLE("Apple", 0.35),
    LEMON("Lemon", 0.65),
    PEACH("Peach", 0.80);

    private final String name;
    private final double price;

    private Fruit(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public final double getPrice() {
        return price;
    }

    public final String getName() {
        return name;
    }
}