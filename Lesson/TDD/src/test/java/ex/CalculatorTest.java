package ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void 더하기(){
        int calc = Calculator.calc("10 + 20");
        assertEquals(30, calc);
    }

    @Test
    public void 더하기_2() {
        int calc = Calculator.calc("20 + 20");
        assertEquals(40, calc);
    }

    @Test
    public void 더하기_3() {
        int calc = Calculator.calc("10 + 10");
        assertEquals(20, calc);
    }

    @Test
    public void 빼기(){
        int calc = Calculator.calc("10 - 10");
        assertEquals(0, calc);
    }

    @Test
    public void 곱하기() {
        int calc = Calculator.calc("10 * 10");
        assertEquals(100, calc);
    }

    @Test
    public void 나누기() {
        int calc = Calculator.calc("100 / 10");
        assertEquals(10, calc);
    }

    @Test
    public void 음수_테스트() {
        int calc = Calculator.calc("-10 + -10");
        int calc2 = Calculator.calc("-10 - 10");
        int calc3 = Calculator.calc("-10 * 10");
        int calc4 = Calculator.calc("-10 / 10");

        assertEquals(-20, calc);
        assertEquals(-20, calc2);
        assertEquals(-100, calc3);
        assertEquals(-1, calc4);
    }
}