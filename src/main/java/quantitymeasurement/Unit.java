package quantitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4),
    GALLON(3.78), MILLILITRES(0.001), LITRE(1.0),
    KILOGRAM(1.0), TONNE(1000), GRAM(0.001),
    FAHRENHEIT(1.0), CELSIUS(2.12);


    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {

        this.baseUnitConversion = baseUnitConversion;
    }

    public double convertToBaseUnit(double value) {
        return value * baseUnitConversion;
    }
}
