import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double gamma = 1e-20;
    Calculator c = new Calculator();

    @Test
    public void true_squareRoot_Positive() {
        assertEquals("Test case for True Positive for squareRoot", 6.0, c.square_root_func(36.0), gamma);
        assertEquals("Test case for True Negative for squareRoot", Double.NaN, c.square_root_func(-36.0), gamma);
    }

    @Test
    public void false_squareRoot_Negative() {
        assertNotEquals("Test case for False Negative for squareRoot", 4.0, c.square_root_func(-36.0), gamma);
        assertNotEquals("Test case for False Positive for squareRoot", Double.NaN, c.square_root_func(36.0), gamma);
    }

    @Test
    public void true_factorial_Positive() {
        assertEquals("Test case for True Positive for factorial", 120.0, c.factorial_func(5), gamma);
        assertEquals("Test case for True Negative for factorial", Double.NaN, c.factorial_func(-4), gamma);

    }

    @Test
    public void false_factorial_Negative() {
        assertNotEquals("Test case for False Negative for factorial", 120.0, c.factorial_func(-5), gamma);
        assertNotEquals("Test case for False Positive for factorial", Double.NaN, c.factorial_func(5), gamma);
    }
    @Test
    public void true_logarithm_Positive() {
        assertEquals("Test case for True Positive for logarithm", 1.3862943611198906, c.logarithm_func(4.0), gamma);
        assertEquals("Test case for True Negative for logarithm", Double.NaN, c.logarithm_func(-4.0), gamma);
    }

    @Test
    public void false_logarithm_Negative() {
        assertNotEquals("Test case for False Negative for logarithm", 4.0, c.logarithm_func(-4.0), gamma);
        assertNotEquals("Test case for False Positive for logarithm", Double.NaN, c.logarithm_func(4.0), gamma);
    }

    @Test
    public void true_power_Positive() {
        assertEquals("Test case True Positive for PowerFunction", 64.0, c.power_func(8.0, 2.0), gamma);
        assertEquals("Test case True Negative for PowerFunction", 0.0625, c.power_func(4.0, -2.0), gamma);
    }

    @Test
    public void false_power_Negative() {
        assertNotEquals("Test case for False Negative for PowerFunction", 5.0, c.power_func(1.0, 5.0), gamma);
        assertNotEquals("Test case for False Positive for PowerFunction", 4.0, c.power_func(2.0, 4.0), gamma);
    }

}
