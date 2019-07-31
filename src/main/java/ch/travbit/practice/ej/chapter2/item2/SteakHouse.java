package ch.travbit.practice.ej.chapter2.item2;

/**
 * This class represents a steak house which serves some beef.
 */
public class SteakHouse {

    private SteakHouse() {
    }

    public static void main(String[] args) {
        Brisket brisket = new Brisket.Builder(300, 25.0)
                .sauce(CutOfBeef.Sauce.BEARNAISE)
                .ageInDays(2)
                .build();

        tBone tBone = new tBone.Builder(450, 30)
                .tenderloinThicknessInMilliM(40)
                .sauce(CutOfBeef.Sauce.BLACK_BEAN)
                .ageInDays(1)
                .build();
    }
}
