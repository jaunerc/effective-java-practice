package ch.travbit.practice.ej.chapter2.item1;

/**
 * [item 1: Consider static factory methods instead of constructors]
 *
 * This class represents a coffee.
 */
public class Coffee {

    private CupSize cupSize;

    private double price;

    private boolean containsMilk;

    /**
     * Private constructor to prevent object creation outside of this class.
     */
    private Coffee(CupSize cupSize, double price, boolean containsMilk) {
        this.cupSize = cupSize;
        this.price = price;
        this.containsMilk = containsMilk;
    }

    /**
     * Static factory method to create new Coffee objects.
     */
    public static Coffee of(CupSize cupSize, double price, boolean containsMilk) {
        return new Coffee(cupSize, price, containsMilk);
    }
}
