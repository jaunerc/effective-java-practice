package ch.travbit.practice.ej.chapter2.item1;

/**
 * This class provides a main function to create some coffee.
 */
public class CoffeeApp {

    private CoffeeApp() {}

    public static void main(String[] args) {
        Coffee espresso = Coffee.of(CupSize.SMALL, 2.8, false);
        Coffee milkCoffee = Coffee.of(CupSize.MEDIUM, 3.4, true);
        Coffee latteMacchiato = Coffee.of(CupSize.LARGE, 3.9, true);
    }
}
