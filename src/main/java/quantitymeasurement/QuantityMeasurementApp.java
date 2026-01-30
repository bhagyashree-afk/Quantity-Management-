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

    public static class Inches {


        // used encapsulation to store the measurement value as a private final field
        // and ensured immutability by making the value final
        private final double value;

        // constructor
        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }

    }

     static boolean CheckFeetEquality (double v1, double v2){
         Feet f1 = new Feet(v1);
         Feet f2 = new Feet(v2);
         return f1.equals(f2);
     }

     static boolean CheckInchesEquality(double v1, double v2){
         Inches i1 = new Inches(v1);
         Inches i2 = new Inches(v2);
         return i1.equals(i2);
     }



    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        System.out.println("Quality Measurement App");

        // created 2 Feet objects with test values
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value in feet:");
        double ft1 = sc.nextDouble();

        System.out.println("Enter second value in feet:");
        double ft2 = sc.nextDouble();

        boolean feetResult = CheckFeetEquality(ft1, ft2);
        System.out.println("Feet Equality Result: " + feetResult);

        //create 2 inches objects with test values
        //Inches obj3 = new Inches( 4);
        //Inches obj4 = new Inches( 4);

        System.out.println("Enter first value in Inches:");
        double in1 = sc.nextDouble();

        System.out.println("Enter second value in Inches:");
        double in2 = sc.nextDouble();

        boolean inchesResult = CheckInchesEquality(in1, in2);
        System.out.println("Inches Equality Result: " + inchesResult);


        // printing the result to verify equality
        //System.out.println("Equal: " + obj3.equals(obj4));
        //System.out.println("Equanl:"+ i1.equals(i2));

    }

}
