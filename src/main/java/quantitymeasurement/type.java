package quantitymeasurement;

public class type {
    public static type feet;
    public static type inch;

    public static type getInch() {
        return inch;
    }

    public static void setInch(type inch) {
        type.inch = inch;
    }

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
                "inch='" + inch +
                '}';
    }
}
