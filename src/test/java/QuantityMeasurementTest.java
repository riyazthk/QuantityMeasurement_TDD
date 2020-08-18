import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Quantity;
import quantitymeasurement.QuantityMeasurementException;
import quantitymeasurement.Unit;


public class QuantityMeasurementTest {
    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(0, Unit.FEET);
        Quantity feet2 = new Quantity(0, Unit.FEET);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Quantity feet1 = new Quantity(0, Unit.FEET);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(0, Unit.FEET);
        Quantity feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenTypeAndType_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(0, Unit.FEET);
        Quantity feet2 = new Quantity(1, Unit.FEET);
        boolean check = feet1.compare(feet2);
        Assert.assertTrue(check);

    }

    @Test
    public void givenFirstFtValAndSecondFtVal_WhenCompared_ShouldNotBeEqual() {
        Quantity feet1 = new Quantity(0, Unit.FEET);
        Quantity feet2 = new Quantity(1, Unit.FEET);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(0, Unit.INCH);
        Quantity inch2 = new Quantity(0, Unit.INCH);
        Assert.assertTrue(inch1.compare(inch2));
    }

    @Test
    public void givenZeroInchAndNull_WhenCompared_ShoulNotBeEqual() {
        Quantity inch1 = new Quantity(0, Unit.INCH);
        Assert.assertNotEquals(null, inch1);
    }

    @Test
    public void givenZeroInchRefAndZeroInchRef_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(0, Unit.INCH);
        Quantity inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchTypeAndInchType_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(0, Unit.INCH);
        Quantity inch2 = new Quantity(0, Unit.INCH);
        boolean check = inch1.compare(inch2);
        Assert.assertTrue(check);
    }

    @Test
    public void givenInchFirstValAndInchSecVal_WhenCompared_ShouldNotBeEqual() {
        Quantity inch1 = new Quantity(0, Unit.INCH);
        Quantity inch2 = new Quantity(1, Unit.INCH);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void givenZeroFtAndZeroInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(0, Unit.FEET);
        Quantity inch = new Quantity(0, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenoneFtAndOneFeet_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(1, Unit.FEET);
        Quantity inch = new Quantity(1, Unit.FEET);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenOneInchAndOneInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(1, Unit.INCH);
        Quantity inch = new Quantity(1, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenOneFtAndTwelveInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(1, Unit.FEET);
        Quantity inch = new Quantity(12, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwelveInchAndOneFt_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(12, Unit.INCH);
        Quantity feet = new Quantity(1, Unit.FEET);
        boolean check = inch.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFeetAndInch_WhenCompared_ShouldNotBeEqual() {
        Quantity feet = new Quantity(1, Unit.FEET);
        Quantity inch = new Quantity(1, Unit.INCH);
        boolean check = feet.compare(inch);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenCompared_ShouldNotBeEqual() {
        Quantity inch = new Quantity(1, Unit.INCH);
        Quantity feet = new Quantity(1, Unit.FEET);
        boolean check = inch.compare(feet);
        Assert.assertFalse(check);
    }

    @Test
    public void givenThreeFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(3, Unit.FEET);
        Quantity yard = new Quantity(1, Unit.YARD);
        boolean check = feet.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(1, Unit.FEET);
        Quantity yard = new Quantity(1, Unit.YARD);
        boolean check = feet.compare(yard);
        Assert.assertFalse(check);

    }

    @Test
    public void givenOneInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(1, Unit.INCH);
        Quantity yard = new Quantity(1, Unit.YARD);
        boolean check = inch.compare(yard);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneYdAndThreeFt_WhenCompared_ShouldBeEqual() {
        Quantity yard = new Quantity(1, Unit.YARD);
        Quantity feet = new Quantity(3, Unit.FEET);
        boolean check = yard.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneYdAndThirtySixInch_WhenCompared_ShouldBeEqual() {
        Quantity yard = new Quantity(1, Unit.YARD);
        Quantity inch = new Quantity(36, Unit.INCH);
        boolean check = yard.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenThirtySixInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(36, Unit.INCH);
        Quantity yard = new Quantity(1, Unit.YARD);
        boolean check = inch.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndFiveCm_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(2, Unit.INCH);
        Quantity centiMeter = new Quantity(5, Unit.CENTIMETER);
        boolean check = inch.compare(centiMeter);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity inch1 = new Quantity(2, Unit.INCH);
        Quantity inch2 = new Quantity(2, Unit.INCH);
        double result = inch1.add(inch2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenOneFtAndTwoInch_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity feet = new Quantity(1, Unit.FEET);
        Quantity inch = new Quantity(2, Unit.INCH);
        double result = feet.add(inch);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFtAndOneFt_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity feet1 = new Quantity(1, Unit.FEET);
        Quantity feet2 = new Quantity(1, Unit.FEET);
        double result = feet1.add(feet2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenTwoInchAndCm_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity inch = new Quantity(2, Unit.INCH);
        Quantity centiMeter = new Quantity(2.5, Unit.CENTIMETER);
        double result = inch.add(centiMeter);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenOneGallonAndLitre_WhenCompared_ShouldBeEqual() {
        Quantity gallon = new Quantity(1, Unit.GALLON);
        Quantity litre = new Quantity(3.78, Unit.LITRE);
        boolean check = gallon.compare(litre);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneLitreAndThousandMl_WhenCompared_ShouldBeEqual() {
        Quantity litre = new Quantity(1, Unit.LITRE);
        Quantity milliLitre = new Quantity(1000, Unit.MILLILITRES);
        boolean check = litre.compare(milliLitre);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneGallonAndLitre_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity gallon = new Quantity(1, Unit.GALLON);
        Quantity litre = new Quantity(3.78, Unit.LITRE);
        double result = gallon.add(litre);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenOneLitreAndThousandMl_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity litre = new Quantity(1, Unit.LITRE);
        Quantity milliLitre = new Quantity(1000, Unit.MILLILITRES);
        double result = litre.add(milliLitre);
        Assert.assertEquals(2, result, 0.0);
    }

    @Test
    public void givenOneKgAndThousandGm_WhenCompared_ShouldBeEqual() {
        Quantity kiloGram = new Quantity(1, Unit.KILOGRAM);
        Quantity gram = new Quantity(1000, Unit.GRAM);
        boolean check = kiloGram.compare(gram);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneTonneAndThousandGram_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity tonne = new Quantity(1, Unit.TONNE);
        Quantity gram = new Quantity(1000, Unit.GRAM);
        double result = tonne.add(gram);
        Assert.assertEquals(1001, result, 0.0);

    }

    @Test
    public void givenFahrenheitAndCelsius_WhenCompared_ShouldBeEqual() {
        Quantity fahrenheit = new Quantity(212, Unit.FAHRENHEIT);
        Quantity celsius = new Quantity(100, Unit.CELSIUS);
        boolean check = fahrenheit.compare(celsius);
        Assert.assertTrue(check);

    }

    @Test
    public void givenFahrenheitAndCelsius_WhenAdded_ShouldBeEqual()  {
        Quantity fahrenheit = new Quantity(212, Unit.FAHRENHEIT);
        Quantity celsius = new Quantity(100, Unit.CELSIUS);
        try {
            double result = fahrenheit.add(celsius);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.ADDITION_NOT_ALLOWED, e.type);
        }
    }
}
