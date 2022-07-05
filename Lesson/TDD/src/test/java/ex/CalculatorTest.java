package ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void 더하기(){
        int run = Calculator.run("10 + 20");
        assertEquals(30, run);
    }

    @Test
    public void 더하기_2() {
        int run = Calculator.run("20 + 20");
        assertEquals(40, run);
    }

    @Test
    public void 더하기_3() {
        int run = Calculator.run("10 + 10");
        assertEquals(20, run);
    }
}