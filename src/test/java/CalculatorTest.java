import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final Double DELTA=1e-15;
    @Test
    public void test_cases_for_sqrt()
    {
        assertEquals(3, calculator.sqrt(9), DELTA);
        assertEquals(15,calculator.sqrt(225),DELTA);
        assertEquals(25,calculator.sqrt(625),DELTA);
        assertEquals(1,calculator.sqrt(1),DELTA);
        assertEquals(0,calculator.sqrt(0),DELTA);
        assertNotEquals(8,calculator.sqrt(9),DELTA);
        assertNotEquals(65,calculator.sqrt(100),DELTA);
        assertNotEquals(52,calculator.sqrt(99),DELTA);
        assertNotEquals(12,calculator.sqrt(1),DELTA);

    }
    @Test
    public void test_cases_for_factorial()
    {
        assertEquals(1, calculator.factorial(0), DELTA);
        assertEquals(1,calculator.factorial(1),DELTA);
        assertEquals(3628800,calculator.factorial(10),DELTA);
        assertEquals(120,calculator.factorial(5),DELTA);
        assertEquals(40320,calculator.factorial(8),DELTA);
        assertNotEquals(10,calculator.factorial(9),DELTA);
        assertNotEquals(77,calculator.factorial(12),DELTA);
        assertNotEquals(52,calculator.factorial(25),DELTA);
        assertNotEquals(12,calculator.factorial(1),DELTA);
    }

    @Test
    public void test_cases_for_naturallog()
    {
        assertEquals(0, calculator.logarithm(1), DELTA);
        assertEquals(2.302585092994046,calculator.logarithm(10),DELTA);
        assertEquals(0.6931471805599453,calculator.logarithm(2),DELTA);
        assertNotEquals(3,calculator.logarithm(9),DELTA);
        assertNotEquals(77,calculator.logarithm(12),DELTA);
        assertNotEquals(100,calculator.logarithm(10000),DELTA);
    }
    @Test
    public void test_cases_for_power_function()
    {
        assertEquals(0, calculator.power_function(0,1), DELTA);
        assertEquals(1,calculator.power_function(1,0),DELTA);
        assertEquals(8,calculator.power_function(2,3),DELTA);
        assertEquals(10000,calculator.power_function(10,4),DELTA);
        assertEquals(7776,calculator.power_function(6,5),DELTA);
        assertNotEquals(15,calculator.power_function(2,4),DELTA);
        assertNotEquals(7776,calculator.power_function(6,6),DELTA);
        assertNotEquals(225,calculator.power_function(25,2),DELTA);
        assertNotEquals(12,calculator.power_function(1,1),DELTA);
    }

}
