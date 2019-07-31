package ch.travbit.practice.ej.chapter2.item2;

/**
 * [item 2: Consider a builder when faced with many constructor parameters]
 * <p>
 * This class represents a cut of beef. It provides an abstract hierarchical builder to create new instances.
 */
public abstract class CutOfBeef {

    private int weightInGrams;
    private int ageInDays;
    private double price;
    private Sauce sauce;

    public enum Sauce {NONE, BEARNAISE, PEPPER, BARBECUE, SALSA_VERDE, BLACK_BEAN}

    // The builder is a generic type. So, the type in a concrete builder
    // can be returned without casting
    abstract static class Builder<T extends Builder<T>> {

        // mandatory parameters
        private final int weightInGrams;
        private final double price;

        // optional parameters with default values
        private int ageInDays = 0;
        private Sauce sauce = Sauce.NONE;

        public Builder(int weightInGrams, double price) {
            this.weightInGrams = weightInGrams;
            this.price = price;
        }

        // These two methods return the type of the concrete builder (generic type) by invoking the self method.
        public T ageInDays(int ageInDays) {
            this.ageInDays = ageInDays;
            return self();
        }

        public T sauce(Sauce sauce) {
            this.sauce = sauce;
            return self();
        }

        /**
         * Builds a new beef instance.
         *
         * @return A new instance of a beef class
         */
        abstract CutOfBeef build();

        /**
         * Gets the instance of the builder. This method must return the instance of the concrete builder in a
         * subclass.
         *
         * @return The instance of the builder
         */
        protected abstract T self();
    }

}
