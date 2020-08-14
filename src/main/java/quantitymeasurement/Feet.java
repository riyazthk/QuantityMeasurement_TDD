package quantitymeasurement;

public class Feet {
    private  type feet;
    private int value;


    public Feet(int value,type feet) {
        this.feet=feet;
        this.value=value;
    }

    public boolean compare(Feet feet2) {
        return true;
    }

    @Override
    public boolean equals(Object that) {
        if(this==that)return true;
        if(that == null || getClass()!=that.getClass())return false;
        Feet feet=(Feet)that;
        return Integer.compare(feet.value,value)==0 &&
                feet.feet==feet.feet;
    }
}
