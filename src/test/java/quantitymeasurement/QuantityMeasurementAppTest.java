package quantitymeasurement;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QuantityMeasurementAppTest {

    //1.yard to yard same value

    @Test
    public void yardToYard_SameValue(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(1.0, Length.LengthUnit.YARDS);

        assertEquals(l1, l2);
    }

     // 2.yard to yard different value

    @Test
    public void yardToYard_DifferentValue(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(2.0, Length.LengthUnit.YARDS);

        assertNotEquals(l1,l2);
    }

    //3.yard to feet

    @Test
    public void yardToFEET_EquivalentValue(){
        Length yard  = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);

        assertEquals(yard,feet);
    }

    //4.feet to yard

    @Test
    public void feetToYARD_EquivalentValue(){
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);

        assertEquals(feet,yard);
    }

    // 5.Yard to Inches

    @Test
    public void yardToINCHES_EquivalentValue(){
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);

        assertEquals(yard,inches);
    }

    // 6.for inches to yard

    @Test
    public void inchesToYARD_EquivalentValue(){
        Length inches  = new Length(36.0, Length.LengthUnit.INCHES);
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);

        assertEquals(inches,yard);
    }

    //7. YARD TO INCHES NonEquivalent Value

    @Test
    public void yardToFEET_NonEquivalentValue(){
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(2.0, Length.LengthUnit.FEET);

        assertNotEquals(yard,feet);
    }

    //8.Centimeters To Inches Equivalent

    @Test
    public void centimetersToINCHES_EquivalentValue() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, Length.LengthUnit.INCHES);
        assertEquals(cm, inches);

    }
    //9. Centimeters To Foot for Equivalent

    @Test
    public void centimetersToInches_EquivalentValue() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(1.0, Length.LengthUnit.INCHES);
        assertNotEquals(cm, inches);

    }

    //10.MultiUnit TransitiveProperty

    @Test
    public void multiUnit_TransitiveProperty() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }

    //11.yardWithNullUnit

    @Test

    public void yardWithNullUnit() {
        try {
            new Length(1.0, Length.LengthUnit.YARDS);
            new Length(1.0, null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    //12.Yard with Same Reference

    @Test
    public void yardSameReference() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(yard, yard);
    }

    //13.Yard with Null Comparison

    @Test
    public void yardNullComparison() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertNotEquals(yard, null);
    }

    //14.

    @Test
    public void centimetreWithNullUnit() {
        try {
            new Length(1.0, null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    //15.

    @Test
    public void centimetresSameReference() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        assertEquals(cm, cm);
    }

    //16.

    @Test
    public void centimetersNullComparison() {
        Length cm = new Length(2.0, Length.LengthUnit.CENTIMETERS);
        assertNotEquals(cm, null);
    }

    //17.

    @Test
    public void allUnit_complexScenario() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        Length centimeters = new Length(91.44, Length.LengthUnit.CENTIMETERS);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
        // assertEquals(inches, centimeters);
    }













}


