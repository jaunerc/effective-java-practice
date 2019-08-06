package ch.travbit.practice.ej.chapter3.item10_11.get_class;

import java.awt.*;
import java.util.Objects;

/**
 * [Item 10: Obey the general contract when overriding equals]
 * [Item 11: Always override hashcode when you override equals]
 *
 * This class represents a fruit.
 */
public class Fruit {

    private int weightInGrams;
    private Color color;

    public Fruit(int weightInGrams, Color color) {
        this.weightInGrams = weightInGrams;
        this.color = color;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public final boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Fruit f = (Fruit) o;
        return weightInGrams == f.weightInGrams && Objects.equals(color, f.color);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(weightInGrams);
        result = 31 * result + color.hashCode();
        return result;
    }
}
