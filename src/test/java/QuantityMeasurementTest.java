import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.Feet;


public class QuantityMeasurementTest {
    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Feet feet1 = new Feet(0);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldNotBeEqual() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Assert.assertNotEquals(feet1,feet2);
    }
}
