package quantitymeasurement;

public class QuantityMeasurementApp{
    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {

        Length l1 = new Length(1.0 , Length.LengthUnit.FEET);
        Length l2 = new Length(12.0 , Length.LengthUnit.INCHES);

        System.out.println("USING GENERIC METHOD : " + l1.equals(l2));

        Length l3= new Length(1,Length.LengthUnit.YARDS);
        Length l4= new Length (36,Length.LengthUnit.INCHES);

        System.out.println("Are extended unit :" + l3.equals(l4));


    }
}

