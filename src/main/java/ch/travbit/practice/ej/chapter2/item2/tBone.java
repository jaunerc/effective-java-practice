package ch.travbit.practice.ej.chapter2.item2;

/**
 * This class represents a T-bone steak. It is a beef cut from the short loin and includes a "T"-shaped lumbar
 * vertebrae with sections of abdominal internal oblique muscle on each side.
 *
 * @see <a href="https://en.wikipedia.org/wiki/T-bone_steak">from wikipedia</a>
 */
public class tBone extends CutOfBeef {

    /**
     * The United States Department of Agriculture's Institutional Meat Purchase Specifications state that the
     * tenderloin of T-bone must be at least 13 mm thick.
     */
    private final static int MIN_THICKNESS = 13;

    private final double tenderloinThicknessInMilliM;

    private tBone(Builder builder) {
        tenderloinThicknessInMilliM = builder.tenderloinThicknessInMilliM;
    }

    public double getTenderloinThicknessInMilliM() {
        return tenderloinThicknessInMilliM;
    }

    public static class Builder extends CutOfBeef.Builder<Builder> {

        // Optional parameter
        private double tenderloinThicknessInMilliM = MIN_THICKNESS;

        public Builder(int weightInGrams, double price) {
            super(weightInGrams, price);
        }

        /**
         * Checks that the thickness satisfies the requirements.
         */
        public Builder tenderloinThicknessInMilliM(int tenderloinThicknessInMilliM) {
            if (tenderloinThicknessInMilliM >= MIN_THICKNESS) {
                this.tenderloinThicknessInMilliM = tenderloinThicknessInMilliM;
            } else {
                throw new IllegalArgumentException("The tenderloin must be at least 32 mm thick");
            }
            return self();
        }

        @Override
        tBone build() {
            return new tBone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
