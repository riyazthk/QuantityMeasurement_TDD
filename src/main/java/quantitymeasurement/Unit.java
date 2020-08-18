package quantitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(2.5),
    GALLON(3.78), MILLILITRES(1000), LITRE(1),
    KILOGRAM(1), TONNE(1000), GRAM(1000),
    FAHRENHEIT(1.0), CELSIUS(2.12);


    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {

        this.baseUnitConversion = baseUnitConversion;
    }

    public double convertToBaseUnit(double value, Unit unit) {
     if (unit == CENTIMETER || unit == MILLILITRES || unit == GRAM) {
            return value / baseUnitConversion;
        }
        return value * baseUnitConversion;
    }
}
