package com.clouting;

/**
 * @author John Clouting
 *
 * Thrown if an attempt is made to determine the total cost
 * of an empty fruit bowl.
 */
public class EmptyFruitBowlException extends Throwable {
    public EmptyFruitBowlException(final String message) {
        super(message);
    }
}
