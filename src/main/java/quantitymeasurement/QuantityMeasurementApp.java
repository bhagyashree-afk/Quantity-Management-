package quantitymeasurement;

public class QuantityMeasurementApp{
    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {

        Length l1 = new Length(1.0 , Length.LengthUnit.FEET);
        Length l2 = new Length(12.0 , Length.LengthUnit.INCHES);

        System.out.println("USING GENERIC METHOD : " + l1.equals(l2));


    }
}

