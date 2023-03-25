import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class JUnitJupiterTestCalc {

    private final Calculator calc = new Calculator();

    @Test
    void addition() {
        assertEquals(3.0, calc.add(1.0, 2.0));
    }

    @Test
    void subtraction() {
        assertEquals(1.0, calc.sub(3.0, 2.0));
    }

    @Test
    void multiplication() {
        assertEquals(6.0, calc.mul(2.0, 3.0));
    }

    @Test
    void division() {
        assertEquals(2.0, calc.div(4.0, 2.0));
    }

}