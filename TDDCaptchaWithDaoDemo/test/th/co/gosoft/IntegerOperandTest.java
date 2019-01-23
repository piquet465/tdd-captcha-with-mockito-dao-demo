package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerOperandTest {
    @Test
    public void itShouldReturn1() {
        IntegerOperand intOperand = new IntegerOperand(1);
        String actual = intOperand.toString();
        assertEquals("1", actual);
    }
    @Test
    public void itShouldReturn9() {
        IntegerOperand intOperand = new IntegerOperand(9);
        String actual = intOperand.toString();
        assertEquals("9", actual);
    }
    @Test
    public void itShouldReturn6() {
        IntegerOperand intOperand = new IntegerOperand(6);
        String actual = intOperand.toString();
        assertEquals("6", actual);
    }
    @Test
    public void itShouldReturn10() {
        IntegerOperand intOperand = new IntegerOperand(10);
        String actual = intOperand.toString();
        assertEquals("10", actual);
    }
}
