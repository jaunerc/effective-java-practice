package ch.travbit.practice.ej.chapter3.item10_11.instance_of;

import java.awt.*;

public class Banana extends Fruit {

    private int degreeOfCurvature;

    public Banana(int weightInGrams, Color color) {
        super(weightInGrams, color);
        degreeOfCurvature = 15;
    }

    public int getDegreeOfCurvature() {
        return degreeOfCurvature;
    }

    public void setDegreeOfCurvature(int degreeOfCurvature) {
        this.degreeOfCurvature = degreeOfCurvature;
    }
}
