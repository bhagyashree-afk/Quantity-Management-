package quantitymeasurement;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality(){
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(feet1, feet2);
    }

    @Test
    public void testInchesEquality(){
        Length inches1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inches2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertEquals(inches1,inches2);
    }

    @Test
    public void testFeetInchesComparison(){
        Length feet  = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        assertEquals(feet,inches);
    }

    @Test
    public void testFeetInequality(){
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(2.0, Length.LengthUnit.FEET);

        assertNotEquals(feet1, feet2);
    }

    @Test
    public void testInchesInequality(){
        Length inch1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inch2 = new Length(2.0, Length.LengthUnit.INCHES);

        assertNotEquals(inch1,inch2);
    }
    //for inches
    @Test
    public void testCrossUnitInequality(){
        Length feet  = new Length(2.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        assertNotEquals(feet,inches);
    }

    @Test
    public void testMultipleFeetComparison(){
        Length feet1 = new Length(3.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(3.0, Length.LengthUnit.FEET);

        assertEquals(feet1, feet2);
    }

    @Test
    public void testNullComparison(){
        Length length = new Length(1.0, Length.LengthUnit.FEET);

        assertNotEquals(length, null);
    }


    @Test
    public void testSameReferance(){
        Length length = new Length (1.0, Length.LengthUnit.FEET);
        assertEquals(length,length);
    }

}


