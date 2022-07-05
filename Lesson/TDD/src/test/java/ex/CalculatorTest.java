package ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void 더하기(){
        int a = 10 + 5;
        assertEquals(15, a);
    }
}