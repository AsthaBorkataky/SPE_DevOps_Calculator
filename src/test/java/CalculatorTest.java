import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRoot_Positive() {
        assertEquals("Test case for True Positive for squareRoot", 6.0, c.square_root_func(36.0), delta);
        assertEquals("Test case for True Negative for squareRoot", Double.NaN, c.square_root_func(-36.0), delta);
    }

    @Test
    public void squareRoot_Negative() {
        assertNotEquals("Test case for False Negative for squareRoot", 4.0, c.square_root_func(-36.0), delta);
        assertNotEquals("Test case for False Positive for squareRoot", Double.NaN, c.square_root_func(36.0), delta);
    }

    @Test
    public void factorial_Positive() {
        assertEquals("Test case for True Positive for factorial", 120.0, c.factorial_func(5), delta);
        assertEquals("Test case for True Negative for factorial", Double.NaN, c.factorial_func(-4), delta);

    }

    @Test
    public void factorial_Negative() {
        assertNotEquals("Test case for False Negative for factorial", 120.0, c.factorial_func(-5), delta);
        assertNotEquals("Test case for False Positive for factorial", Double.NaN, c.factorial_func(5), delta);
    }
    @Test
    public void logarithm_Positive() {
        assertEquals("Test case for True Positive for logarithm", 1.3862943611198906, c.logarithm_func(4.0), delta);
        assertEquals("Test case for True Negative for logarithm", Double.NaN, c.logarithm_func(-4.0), delta);
    }

    @Test
    public void logarithm_Negative() {
        assertNotEquals("Test case for False Negative for logarithm", 4.0, c.logarithm_func(-4.0), delta);
        assertNotEquals("Test case for False Positive for logarithm", Double.NaN, c.logarithm_func(4.0), delta);
    }

    @Test
    public void power_Positive() {
        assertEquals("Test case True Positive for PowerFunction", 16.0, c.power_func(4.0, 2.0), delta);
        assertEquals("Test case True Negative for PowerFunction", 0.25, c.power_func(2.0, -2.0), delta);
    }

    @Test
    public void power_Negative() {
        assertNotEquals("Test case for False Negative for PowerFunction", 4.0, c.power_func(1.0, 4.0), delta);
        assertNotEquals("Test case for False Positive for PowerFunction", 4.0, c.power_func(2.0, 4.0), delta);
    }

}
