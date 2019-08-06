package ch.travbit.practice.ej.chapter3.item10_11.composition;

import java.util.Objects;

/**
 * [favor composition over inheritance]
 * This class has a field of type Fruit instead of being a subtype of fruit.
 */
public class Banana {

    private Fruit fruit;
    private int degreeOfCurvature;

    public Banana(Fruit fruit) {
        this.fruit = fruit;
        degreeOfCurvature = 15;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getDegreeOfCurvature() {
        return degreeOfCurvature;
    }

    public void setDegreeOfCurvature(int degreeOfCurvature) {
        this.degreeOfCurvature = degreeOfCurvature;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Banana)) {
            return false;
        }
        Banana ob = (Banana) o;
        return ob.fruit.equals(fruit) && Objects.equals(ob.degreeOfCurvature, degreeOfCurvature);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(degreeOfCurvature);
        result = 31 * result + fruit.hashCode();
        return result;
    }
}
