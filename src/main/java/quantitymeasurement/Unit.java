package quantitymeasurement;

public enum Unit {
    FEET(12.0),INCH(1.0),YARD(36.0),CENTIMETER(2.5);


    private final double baseUnitConversion;
    public double value;
    private quantitymeasurement.Unit Unit;

    Unit(double baseUnitConversion) {
        
        this.baseUnitConversion=baseUnitConversion;
    }
    public double convertToBaseUnit(double value){
        if(this.baseUnitConversion==2.5){
            return value/baseUnitConversion;
        }
        return value*baseUnitConversion;
    }
}
