package quantitymeasurement;

public enum Measurement {
    MEASUREMENTVALUE(1,12);

    private final int feetValue;
    private final int inchValue;

    Measurement(int feetValue,int inchValue) {
        this.feetValue=feetValue;
        this.inchValue=inchValue;
    }

    public static int calculateFeet() {
    return 0;
    }
}
