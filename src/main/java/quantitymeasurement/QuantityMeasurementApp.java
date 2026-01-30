//package quantitymeasurement;


/* Quantity Measurement App - UC1: Feet measurement equality
    This  class is responsible for checking the equality of two numerical values measured in feet in the Quantity Measurement Application.
*/

// package
//main class

import java.util.Scanner;
 public class QuantityMeasurementApp {

    // created inner Feet class to represent Feet measurement
    public static class Feet {

        // used encapsulation to store the measurement value as a private final field
        // and ensured immutability by making the value final
        private final double value;

        // constructor
        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Feet f = (Feet) obj; // casting
            return Double.compare(this.value, f.value) == 0; // here i have compare double values using
            // Double.compare() instead of == opertor.
        }

    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        System.out.println("Quality Measurement App");

        // created 2 Feet objects with test values
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value in feet:");
        double n1 = sc.nextDouble();

        System.out.println("Enter second value in feet:");
        double n2 = sc.nextDouble();

        Feet f1 = new Feet(n1);
        Feet f2 = new Feet(n2);

        boolean result = f1.equals(f2);

        System.out.println("Are both values equal? " + result);

    }

}
