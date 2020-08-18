import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.Length;
import quantitymeasurement.Unit;


public class QuantityMeasurementTest {

    @Before
    public void setUp() {

    }

    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Length feet1 = new Length(0, Unit.FEET);
        Length feet2 = new Length(0, Unit.FEET);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Length feet1 = new Length(0, Unit.FEET);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldBeEqual() {
        Length feet1 = new Length(0, Unit.FEET);
        Length feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenTypeAndType_WhenCompared_ShouldBeEqual() {
        Length feet1 = new Length(0, Unit.FEET);
        Length feet2 = new Length(1, Unit.FEET);
        Assert.assertEquals(feet1, feet2);

    }

    @Test
    public void givenFirstFtValAndSecondFtVal_WhenCompared_ShouldNotBeEqual() {
        Length feet1 = new Length(0, Unit.FEET);
        Length feet2 = new Length(1, Unit.FEET);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCompared_ShouldBeEqual() {
        Length inch1 = new Length(0, Unit.INCH);
        Length inch2 = new Length(0, Unit.INCH);
        Assert.assertTrue(inch1.compare(inch2));
    }

    @Test
    public void givenZeroInchAndNull_WhenCompared_ShoulNotBeEqual() {
        Length inch1 = new Length(0, Unit.INCH);
        Assert.assertNotEquals(null, inch1);
    }

    @Test
    public void givenZeroInchRefAndZeroInchRef_WhenCompared_ShouldBeEqual() {
        Length inch1 = new Length(0, Unit.INCH);
        Length inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchTypeAndInchType_WhenCompared_ShouldBeEqual() {
        Length inch1 = new Length(0, Unit.INCH);
        Length inch2 = new Length(0, Unit.INCH);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchFirstValAndInchSecVal_WhenCompared_ShouldNotBeEqual() {
        Length inch1 = new Length(0, Unit.INCH);
        Length inch2 = new Length(1, Unit.INCH);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void givenZeroFtAndZeroInch_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(0, Unit.FEET);
        Length inch = new Length(0, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenoneFtAndOneFeet_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(1, Unit.FEET);
        Length inch = new Length(1, Unit.FEET);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenoneInchAndOneInch_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(1, Unit.INCH);
        Length inch = new Length(1, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenOneFtAndTwelveInch_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(1, Unit.FEET);
        Length inch = new Length(12,Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwelveInchAndOneFt_WhenCompared_ShouldBeEqual() {
        Length inch = new Length(12, Unit.INCH);
        Length feet = new Length(1,  Unit.FEET);
        boolean check = inch.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFeetAndInch_WhenCompared_ShouldNotBeEqual() {
        Length feet = new Length(1, Unit.FEET);
        Length inch = new Length(1, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenCompared_ShouldNotBeEqual() {
        Length inch = new Length(1, Unit.INCH);
        Length feet = new Length(1, Unit.FEET);
        boolean check = inch.compare(feet);
        Assert.assertFalse(check);
    }

    @Test
    public void givenThreeFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(3, Unit.FEET);
        Length yard = new Length(1, Unit.YARD);
        boolean check = feet.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Length feet = new Length(1, Unit.FEET);
        Length yard = new Length(1, Unit.YARD);
        boolean check = feet.compare(yard);
        Assert.assertFalse(check);

    }

    @Test
    public void givenOneInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Length inch = new Length(1, Unit.INCH);
        Length yard = new Length(1, Unit.YARD);
        boolean check = inch.compare(yard);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneYdAndThreeFt_WhenCompared_ShouldBeEqual() {
        Length yard = new Length(1, Unit.YARD);
        Length feet = new Length(3, Unit.FEET);
        boolean check = yard.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneYdAndThirtySixInch_WhenCompared_ShouldBeEqual() {
        Length yard = new Length(1, Unit.YARD);
        Length inch = new Length(36,Unit.INCH);
        boolean check = yard.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenThirtySixInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Length inch = new Length(36, Unit.INCH);
        Length yard = new Length(1, Unit.YARD);
        boolean check = inch.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndFiveCm_WhenCompared_ShouldBeEqual() {
        Length inch = new Length(2, Unit.INCH);
        Length centiMeter = new Length(5, Unit.CENTIMETER);
        boolean check = inch.compare(centiMeter);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldGetExpectedOutput() {
        Length inch1 = new Length(2, Unit.INCH);
        Length inch2 = new Length(2, Unit.INCH);
        double result = inch1.add(inch2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenOneFtAndTwoInch_WhenAdded_ShouldGetExpectedOutput() {
        Length feet = new Length(1, Unit.FEET);
        Length inch=new Length(2, Unit.INCH);
        double result=feet.add(inch);
        Assert.assertEquals(14,result,0.0);
    }

    @Test
    public void givenOneFtAndOneFt_WhenAdded_ShouldGetExpectedOutput() {
        Length feet1 = new Length(1, Unit.FEET);
        Length feet2 = new Length(1, Unit.FEET);
        double result=feet1.add(feet2);
        Assert.assertEquals(24,result,0.0);
    }

    @Test
    public void givenTwoInchAndCm_WhenAdded_ShouldGetExpectedOutput() {
        Length inch = new Length(2, Unit.INCH);
        Length centiMeter = new Length(2.5, Unit.CENTIMETER);
        double result=inch.add(centiMeter);
        Assert.assertEquals(3,result,0.0);
    }
}
