package quantitymeasurement;

public class QuantityMeasurementException extends Exception {
    public ExceptionType type;

    public enum ExceptionType {
        ADDITION_NOT_ALLOWED;
    }

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
