package quantitymeasurement;

public class type {
    public static type feet;

    public type getFeet() {
        return feet;
    }


    public void setFeet(type feet) {
        this.feet = feet;


    }

    @Override
    public String toString() {
        return "type{" +
                "feet='" + feet + '\'' +
                '}';
    }
}
