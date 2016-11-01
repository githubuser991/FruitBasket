package com.clouting;

import java.util.HashMap;
import java.util.Map;

/**
 * @author John Clouting
 *
 * A basket of one or more fruit. Duplicates are permitted.
 */
public class FruitBasket {

    private final Map<Fruit, FruitInfo> fruitInfoMap;

    public FruitBasket() {
        fruitInfoMap = new HashMap<>();
    }

    /**
     * Add one or more Fruit to the FruitBasket
     *
     * @param fruit the fruit to add
     */
    public final void addFruit(final Fruit fruit) {
        FruitInfo fruitInfo = fruitInfoMap.get(fruit);
        if (fruitInfo == null) {
            fruitInfo = new FruitInfo(fruit);
            fruitInfoMap.put(fruit, fruitInfo);
        }
        fruitInfo.incrementQuantity();
    }

    /**
     * Calculate the total cost of all the fruit in the bowl.
     *
     * @return the total cost of the fruit
     * @throws EmptyFruitBowlException the FruitBowl is empty
     */
    public final double getTotalCost() throws EmptyFruitBowlException {
        if (fruitInfoMap.size() == 0) {
            throw new EmptyFruitBowlException("The fruit bowl is empty");
        }

        double totalCost = 0.0;
        for (Fruit fruit : fruitInfoMap.keySet()) {
            totalCost += fruitInfoMap.get(fruit).getTotalCost();
        }
        return totalCost;
    }
}
