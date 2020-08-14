package quantitymeasurement;

public class Inch {
    private  type inch;
    private  int values;

    public Inch(int values) {
        this.values=values;
    }

    public Inch(int values, type inch) {
        this.values=values;
        this.inch=inch;
    }

    public boolean compare(Inch inch2) {
        return true;
    }

    @Override
    public boolean equals(Object that) {
        if(this==that)return true;
        if(that == null || getClass()!=that.getClass())return false;
        Inch inch=(Inch)that;
        return Integer.compare(inch.values,values)==0 &&
                inch.inch==inch.inch;
    }
}
