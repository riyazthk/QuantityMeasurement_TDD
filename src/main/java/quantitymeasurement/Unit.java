package quantitymeasurement;

public enum Unit {
    FEET(12.0,"inch"), INCH(1.0,"inch"), YARD(36.0,"inch"), CENTIMETER(0.4,"inch"),
    GALLON(3.78,"litre"), MILLILITRES(0.001,"litre"), LITRE(1.0,"litre"),
    KILOGRAM(1.0,"kiloGram"), TONNE(1000,"kiloGram"), GRAM(0.001,"kiloGram"),
    FAHRENHEIT(1.0,"celsius"), CELSIUS(2.12,"celsius");


    private final double baseUnitConversion;
    private final String unit;

    Unit(double baseUnitConversion,String unit) {

        this.baseUnitConversion = baseUnitConversion;
        this.unit=unit;
    }

    public double convertToBaseUnit(double value) {

        return value * baseUnitConversion;
        }

    public Quantity convertToUnit(double value) {
        String val= unit;
        double result = value * baseUnitConversion;
        return  new Quantity(val,result);
    }


}
