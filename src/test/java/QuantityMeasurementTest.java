import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Feet;
import quantitymeasurement.type;


public class QuantityMeasurementTest {
    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0,type.feet);
        Feet feet2 = new Feet(0,type.feet);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Feet feet1 = new Feet(0,type.feet);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0,type.feet);
        Feet feet2 = feet1;
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenTypeAndType_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0,type.feet);
        Feet feet2 = new Feet(0,type.feet);
        Assert.assertEquals(feet1,feet2);

    }
}
