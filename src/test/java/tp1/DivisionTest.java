package tp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    Calculator calculator = new Calculator();

    @Test
    public void testDivide6w3(){
        assertEquals(calculator.div("110", "11"), "10");
    }
    @Test
    public void testDivide6w2(){
        assertEquals(calculator.div("110", "10"), "11");
    }

}