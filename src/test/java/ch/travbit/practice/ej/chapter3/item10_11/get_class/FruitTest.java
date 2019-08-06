package ch.travbit.practice.ej.chapter3.item10_11.get_class;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    @Test
    void testReflexive() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        assertEquals(fruit1, fruit1);
    }

    @Test
    void testSymmetric() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        Fruit fruit2 = new Fruit(80, Color.GREEN);
        assertEquals(fruit1, fruit2);
        assertEquals(fruit2, fruit1);
    }

    @Test
    void testTransitive() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        Fruit fruit2 = new Fruit(80, Color.GREEN);
        Fruit fruit3 = new Fruit(80, Color.GREEN);
        assertEquals(fruit1, fruit2);
        assertEquals(fruit2, fruit3);
        assertEquals(fruit1, fruit3);
    }

    @RepeatedTest(5)
    void testConsistent() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        Fruit fruit2 = new Fruit(80, Color.GREEN);
        assertEquals(fruit1, fruit2);
    }

    @Test
    void testNonNullity() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        assertNotEquals(fruit1, null);
    }

    @Test
    void testNotEqual() {
        Fruit fruit1 = new Fruit(80, Color.GREEN);
        Fruit fruit2 = new Fruit(80, Color.YELLOW);
        assertNotEquals(fruit1, fruit2);
    }

    @Test
    void testSubclass() {
        Fruit fruit1 = new Fruit(80, Color.YELLOW);
        Banana banana = new Banana(80, Color.YELLOW);
        assertNotEquals(fruit1, banana);
        assertNotEquals(banana, fruit1);
    }
}