package ch.travbit.practice.ej.chapter3.item10_11.instance_of;

import java.awt.*;

public class Apple extends Fruit {

    private boolean hasWorm;

    public Apple(int weightInGrams, Color color) {
        super(weightInGrams, color);
        hasWorm = false;
    }

    public boolean isHasWorm() {
        return hasWorm;
    }

    public void setHasWorm(boolean hasWorm) {
        this.hasWorm = hasWorm;
    }
}
