 import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 import quantitymeasurement.Feet;


 public class QuantityMeasurementTest {
     @Test
     public void givenZeroFtAndZeroFt_WhenCompared_ShouldReturnEquals() {
         Feet feet1 = new Feet(0);
         Feet feet2 = new Feet(0);
         Assert.assertTrue(feet1.compare(feet2));
     }
 }
