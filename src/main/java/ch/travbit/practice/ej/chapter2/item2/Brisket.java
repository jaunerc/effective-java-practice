package ch.travbit.practice.ej.chapter2.item2;

/**
 * This class represents a brisket. It  is a cut of meat from the breast or lower chest of beef or veal. The beef
 * brisket is one of the nine beef primal cuts, though the precise definition of the cut differs internationally.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Brisket">from wikipedia</a>
 */
public class Brisket extends CutOfBeef {

    /**
     * Private constructor to prevent object creation without builder.
     */
    private Brisket() {
    }

    public static class Builder extends CutOfBeef.Builder<Builder> {

        public Builder(int weightInGrams, double price) {
            super(weightInGrams, price);
        }

        @Override
        Brisket build() {
            return new Brisket();
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
