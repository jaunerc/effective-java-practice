package ch.travbit.practice.ej.chapter2.item2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @see ch.travbit.practice.ej.chapter2.item2.tBone
 */
class tBoneTest {

    @Test
    void testIllegalThickness() {
        assertThrows(IllegalArgumentException.class, () ->
                new tBone.Builder(400, 30)
                        .tenderloinThicknessInMilliM(2)
                        .build());
    }

}