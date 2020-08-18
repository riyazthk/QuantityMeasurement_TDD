package quantitymeasurement;

public class Quantity {

    public Unit unit;
    public double value;


    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Quantity that) {
        if (this.value == that.value && this.value == 0)
            return true;
        if (this.unit.equals(that.unit))
            return true;

        return Double.compare(this.unit.convertToBaseUnit(this.value, that.unit), that.unit.convertToBaseUnit(that.value, that.unit)) == 0;
    }

    public double add(Quantity that) throws QuantityMeasurementException {
        if(this.unit.equals(Unit.CELSIUS) || this.unit.equals(Unit.FAHRENHEIT))
            throw new QuantityMeasurementException("These quantities cannot be added",QuantityMeasurementException.ExceptionType.ADDITION_NOT_ALLOWED);
        return this.unit.convertToBaseUnit(this.value, this.unit) + that.unit.convertToBaseUnit(that.value, that.unit);
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
