import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Feet;
import quantitymeasurement.Inch;
import quantitymeasurement.type;



public class QuantityMeasurementTest {
    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0, type.feet);
        Feet feet2 = new Feet(0, type.feet);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Feet feet1 = new Feet(0, type.feet);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0, type.feet);
        Feet feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenTypeAndType_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0, type.feet);
        Feet feet2 = new Feet(0, type.feet);
        Assert.assertEquals(feet1, feet2);

    }

    @Test
    public void givenFirstFtValAndSecondFtVal_WhenCompared_ShouldNotBeEqual() {
        Feet feet1 = new Feet(0, type.feet);
        Feet feet2 = new Feet(1, type.feet);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCompared_ShouldBeEqual() {
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(0);
        Assert.assertTrue(inch1.compare(inch2));
    }

    @Test
    public void givenZeroInchAndNull_WhenCompared_ShoulNotBeEqual() {
        Inch inch1 = new Inch(0);
        Assert.assertNotEquals(null,inch1);
    }

    @Test
    public void givenZeroInchRefAndZeroInchRef_WhenCompared_ShouldBeEqual() {
        Inch inch1 = new Inch(0);
        Inch inch2=inch1;
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchTypeAndInchType_WhenCompared_ShouldBeEqual() {
        Inch inch1 = new Inch(0, type.inch);
        Inch inch2 = new Inch(0, type.inch);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchFirstValAndInchSecVal_WhenCompared_ShouldNotBeEqual() {
        Inch inch1 = new Inch(0, type.inch);
        Inch inch2 = new Inch(1, type.inch);
        Assert.assertNotEquals(inch1,inch2);

    }
}
