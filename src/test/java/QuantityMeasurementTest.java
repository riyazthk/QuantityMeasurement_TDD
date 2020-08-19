import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Quantity;
import quantitymeasurement.QuantityMeasurementException;
import quantitymeasurement.Unit;


public class QuantityMeasurementTest {
    @Test
    public void givenZeroFtAndZeroFt_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0);
        Quantity feet2 = new Quantity(Unit.FEET, 0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFtAndNull_WhenCompared_ShouldNotBeEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0);
        Assert.assertNotEquals(feet1, null);
    }

    @Test
    public void givenZeroFtRefAndZeroFtRef_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0);
        Quantity feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenTypeAndType_WhenCompared_ShouldBeEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        boolean check = feet1.compare(feet2);
        Assert.assertTrue(check);

    }

    @Test
    public void givenFirstFtValAndSecondFtVal_WhenCompared_ShouldNotBeEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0);
        Quantity inch2 = new Quantity(Unit.INCH, 0);
        Assert.assertTrue(inch1.compare(inch2));
    }

    @Test
    public void givenZeroInchAndNull_WhenCompared_ShouldNotBeEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0);
        Assert.assertNotEquals(null, inch1);
    }

    @Test
    public void givenZeroInchRefAndZeroInchRef_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0);
        Quantity inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchTypeAndInchType_WhenCompared_ShouldBeEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0);
        Quantity inch2 = new Quantity(Unit.INCH, 0);
        boolean check = inch1.compare(inch2);
        Assert.assertTrue(check);
    }

    @Test
    public void givenInchFirstValAndInchSecVal_WhenCompared_ShouldNotBeEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0);
        Quantity inch2 = new Quantity(Unit.INCH, 1);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void givenZeroFtAndZeroInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 0);
        Quantity inch = new Quantity(Unit.INCH, 0);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenoneFtAndOneFeet_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity inch = new Quantity(Unit.FEET, 1);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenOneInchAndOneInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.INCH, 1);
        Quantity inch = new Quantity(Unit.INCH, 1);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);

    }

    @Test
    public void givenOneFtAndTwelveInch_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity inch = new Quantity(Unit.INCH, 12);
        boolean check = feet.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwelveInchAndOneFt_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(Unit.INCH, 12);
        Quantity feet = new Quantity(Unit.FEET, 1);
        boolean check = inch.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFeetAndInch_WhenCompared_ShouldNotBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity inch = new Quantity(Unit.INCH, 1);
        boolean check = feet.compare(inch);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenCompared_ShouldNotBeEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1);
        Quantity feet = new Quantity(Unit.FEET, 1);
        boolean check = inch.compare(feet);
        Assert.assertFalse(check);
    }

    @Test
    public void givenThreeFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 3);
        Quantity yard = new Quantity(Unit.YARD, 1);
        boolean check = feet.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneFtAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity yard = new Quantity(Unit.YARD, 1);
        boolean check = feet.compare(yard);
        Assert.assertFalse(check);

    }

    @Test
    public void givenOneInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1);
        Quantity yard = new Quantity(Unit.YARD, 1);
        boolean check = inch.compare(yard);
        Assert.assertFalse(check);
    }

    @Test
    public void givenOneYdAndThreeFt_WhenCompared_ShouldBeEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1);
        Quantity feet = new Quantity(Unit.FEET, 3);
        boolean check = yard.compare(feet);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneYdAndThirtySixInch_WhenCompared_ShouldBeEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1);
        Quantity inch = new Quantity(Unit.INCH, 36);
        boolean check = yard.compare(inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givenThirtySixInchAndOneYd_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(Unit.INCH, 36);
        Quantity yard = new Quantity(Unit.YARD, 1);
        boolean check = inch.compare(yard);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndFiveCm_WhenCompared_ShouldBeEqual() {
        Quantity inch = new Quantity(Unit.INCH, 2);
        Quantity centiMeter = new Quantity(Unit.CENTIMETER, 5);
        boolean check = inch.compare(centiMeter);
        Assert.assertTrue(check);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        Quantity result = inch1.add(inch2);
        Assert.assertEquals(4, result.value, 0.0);
        Assert.assertEquals("inch", result.type);

    }

    @Test
    public void givenOneFtAndTwoInch_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity inch = new Quantity(Unit.INCH, 2);
        Quantity result = feet.add(inch);
        Assert.assertEquals(14, result.value, 0.0);
        Assert.assertEquals("inch", result.type);
    }

    @Test
    public void givenOneFtAndOneFt_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        Quantity result = feet1.add(feet2);
        Assert.assertEquals(24, result.value, 0.0);
        Assert.assertEquals("inch", result.type);
    }

    @Test
    public void givenTwoInchAndCm_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity inch = new Quantity(Unit.INCH, 2);
        Quantity centiMeter = new Quantity(Unit.CENTIMETER, 2.5);
        Quantity result = inch.add(centiMeter);
        Assert.assertEquals(3, result.value, 0.0);
        Assert.assertEquals("inch", result.type);
    }

    @Test
    public void givenOneGallonAndLitre_WhenCompared_ShouldBeEqual() {
        Quantity gallon = new Quantity(Unit.GALLON, 1);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean check = gallon.compare(litre);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneLitreAndThousandMl_WhenCompared_ShouldBeEqual() {
        Quantity litre = new Quantity(Unit.LITRE, 1);
        Quantity milliLitre = new Quantity(Unit.MILLILITRES, 1000);
        boolean check = litre.compare(milliLitre);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneGallonAndLitre_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity gallon = new Quantity(Unit.GALLON, 1);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        Quantity result = gallon.add(litre);
        Assert.assertEquals(7.56, result.value, 0.0);
        Assert.assertEquals("litre", result.type);
    }

    @Test
    public void givenOneLitreAndThousandMl_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity litre = new Quantity(Unit.LITRE, 1);
        Quantity milliLitre = new Quantity(Unit.MILLILITRES, 1000);
        Quantity result = litre.add(milliLitre);
        Assert.assertEquals(2, result.value, 0.0);
        Assert.assertEquals("litre", result.type);
    }

    @Test
    public void givenOneKgAndThousandGm_WhenCompared_ShouldBeEqual() {
        Quantity kiloGram = new Quantity(Unit.KILOGRAM, 1);
        Quantity gram = new Quantity(Unit.GRAM, 1000);
        boolean check = kiloGram.compare(gram);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneTonneAndThousandGram_WhenAdded_ShouldGetExpectedOutput() throws QuantityMeasurementException {
        Quantity tonne = new Quantity(Unit.TONNE, 1);
        Quantity gram = new Quantity(Unit.GRAM, 1000);
        Quantity result = tonne.add(gram);
        Assert.assertEquals(1001, result.value, 0.0);
        Assert.assertEquals("kiloGram", result.type);
    }

    @Test
    public void givenFahrenheitAndCelsius_WhenCompared_ShouldBeEqual() {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity celsius = new Quantity(Unit.CELSIUS, 100);
        boolean check = fahrenheit.compare(celsius);
        Assert.assertTrue(check);

    }

    @Test
    public void givenFahrenheitAndCelsius_WhenAdded_ShouldBeEqual() {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity celsius = new Quantity(Unit.CELSIUS, 100);
        try {
            Quantity result = fahrenheit.add(celsius);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.ADDITION_NOT_ALLOWED, e.type);
        }
    }
}
