package quantitymeasurement;

public class Length {
    private static final double FEET_TO_INCH_OR_INCH_TO_FEET = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double INCH_TO_CENTIMETER = 2.5;
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
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH) && this.value * FEET_TO_INCH_OR_INCH_TO_FEET == that.value)
            return Double.compare(this.value * FEET_TO_INCH_OR_INCH_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET) && this.value / FEET_TO_INCH_OR_INCH_TO_FEET == that.value)
            return Double.compare(this.value / FEET_TO_INCH_OR_INCH_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD) && this.value / YARD_TO_FEET == that.value)
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH_OR_INCH_TO_FEET * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD)&& this.value/(FEET_TO_INCH_OR_INCH_TO_FEET * YARD_TO_FEET)==that.value)
            return Double.compare(this.value / (FEET_TO_INCH_OR_INCH_TO_FEET * YARD_TO_FEET), that.value) == 0;
        if(this.unit.equals(Unit.INCH)&& that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value*INCH_TO_CENTIMETER,that.value)==0;
        return false;
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
    //    public  double conversionToBaseUnit(Length length1, Length length2) {
//       Unit value1=Unit.INCH;
//
//        if(length1.unit.equals(value1) || length2.unit.equals(value1))
//        if(length1.unit.equals(value1) || length2.unit.equals(value1))
//            return length1.value*
//    }

}
