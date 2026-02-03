package quantitymeasurement;

public class Length {
    //Instance Variables
    private double value;
    private LengthUnit unit;

    //Enum to represent different length units and their conversion factors
    //with the base unit being inches.This means all the conversion factors
    //are defined in terms of inches.
    public enum LengthUnit{
        FEET( 12.0),
        INCHES( 1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor(){
            return conversionFactor;
        }
    }

    //constructor ton initialize length value and unit
    public Length(double value, LengthUnit unit){
        this.value = value;
        this.unit = unit;

    }

    //convert the length value to the base unit (inches)
    private double convertToBaseUnit(){
        return this.value * this.unit.getConversionFactor();

    }


    //Equals method is overridden to firstly check if the two objects are the
    //same reference , If not ,it check if the other objects is null or a dif
    // fre

    @Override
    public boolean equals(Object obj){

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;

        return Double.compare(this.convertToBaseUnit(), other.convertToBaseUnit()) == 0;


    }

}
