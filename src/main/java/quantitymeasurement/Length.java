package quantitymeasurement;

public class Length {

    public Unit unit;
    public double value;


    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        if (this.value == that.value && this.value == 0)
            return true;
        if (this.unit.equals(that.unit))
            return true;

        return Double.compare(this.unit.convertToBaseUnit(this.value), that.unit.convertToBaseUnit(that.value)) == 0;
    }

    public double add(Length that) {
        return this.unit.convertToBaseUnit(this.value) + that.unit.convertToBaseUnit(that.value);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length lengths = (Length) that;
        return Double.compare(lengths.value, value) == 0 &&
                unit == lengths.unit;
    }

}
