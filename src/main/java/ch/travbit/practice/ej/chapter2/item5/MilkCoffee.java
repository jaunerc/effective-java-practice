package ch.travbit.practice.ej.chapter2.item5;

import java.util.Objects;

/**
 * [item 5: Prefer dependency injection to hard wiring resources]
 *
 * This class represents a coffee with milk.
 */
public class MilkCoffee {

    private Milk milk;

    /**
     * Creates a new MilkCoffee object. Here we use dependency injection.
     */
    public MilkCoffee(Milk milk) {
        this.milk = Objects.requireNonNull(milk);
    }
}
