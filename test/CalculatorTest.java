import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testTwoMultiply() {
        Calculator calc = new Calculator();
        assertEquals(25,calc.multiply(5,5));
    }

    @Test
    void testThreeMultiply() {
        Calculator calc = new Calculator();
        assertEquals(125,calc.multiply(5,5,5));
    }
}