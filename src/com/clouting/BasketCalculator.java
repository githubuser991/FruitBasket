package com.clouting;

/**
 * @author John Clouting
 */
public class BasketCalculator {

    public static void main(String[] args) {

        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.addFruit(Fruit.APPLE);
        fruitBasket.addFruit(Fruit.BANANA);
        fruitBasket.addFruit(Fruit.LEMON);
        fruitBasket.addFruit(Fruit.ORANGE);
        fruitBasket.addFruit(Fruit.PEACH);
        fruitBasket.addFruit(Fruit.APPLE);
        fruitBasket.addFruit(Fruit.ORANGE);
        fruitBasket.addFruit(Fruit.LEMON);

        try {
            System.out.format("Total basket cost is: £%3.2f", fruitBasket.getTotalCost());
        } catch (EmptyFruitBowlException e) {
            System.err.println(e.getMessage());
        }
    }
}
