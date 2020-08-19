package quantitymeasurement;

public class Quantity {

    public String type;
    public Unit unit;
    public double value;


    public Quantity(Unit unit,double value) {
        this.value = value;
        this.unit = unit;
    }

    public Quantity(String unit,double value) {
        this.type=unit;
        this.value=value;
    }

    public boolean compare(Quantity that) {
        if (this.value == that.value && this.value == 0)
            return true;
        if (this.unit.equals(that.unit))
            return true;
        return Double.compare(this.unit.convertToUnit(this.value).value,that.unit.convertToUnit(that.value).value) == 0;
    }

    public Quantity add(Quantity that) throws QuantityMeasurementException {
        if(this.unit.equals(Unit.CELSIUS) || this.unit.equals(Unit.FAHRENHEIT))
            throw new QuantityMeasurementException("These quantities cannot be added",QuantityMeasurementException.ExceptionType.ADDITION_NOT_ALLOWED);
        Quantity value1 = this.unit.convertToUnit(this.value) ;
        Quantity value2 = that.unit.convertToUnit(that.value);
        return new Quantity(value1.type,value1.value+value2.value);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Quantity lengths = (Quantity) that;
        return Double.compare(lengths.value, value) == 0 &&
                unit == lengths.unit;
    }

}
