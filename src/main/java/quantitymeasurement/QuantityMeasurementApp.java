//package quantitymeasurement;


/* Quantity Measurement App - UC1: Feet measurement equality
    This  class is responsible for checking the equality of two numerical values measured in feet in the Quantity Measurement Application.
*/

// package
//main class
 public class QuantityMeasurementApp {

    // created inner Feet class to represent Feet measurement
    public static class Feet {

        // used encapsulation to store the measurement value as a private final field
        // and ensured immutability by making the value final
        private final double feetValue;

        // constructor
        public Feet(double feetValue) {
            this.feetValue = feetValue;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Feet f = (Feet) obj; // casting
            return Double.compare(this.feetValue, f.feetValue) == 0; // here i have compare double values using
            // Double.compare() instead of == opertor.
        }

    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        System.out.println("Quality Measurement App");

        // created 2 Feet objects with test values
        Feet obj1 = new Feet(4.5);
        Feet obj2 = new Feet(4.5);

        // printing the result to verify equality
        System.out.println("Equal: " + obj1.equals(obj2));

    }

}
