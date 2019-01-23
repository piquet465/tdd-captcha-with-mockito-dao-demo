package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOperandTest {
    @Test
    public void itShouldReturnOne() {
        StringOperand stringOperand = new StringOperand(1);
        String actual = stringOperand.toString();
        assertEquals("One", actual);
    }
    @Test
    public void itShouldReturnNine() {
        StringOperand stringOperand = new StringOperand(9);
        String actual = stringOperand.toString();
        assertEquals("Nine", actual);
    }
    @Test
    public void itShouldReturnFour() {
        StringOperand stringOperand = new StringOperand(4);
        String actual = stringOperand.toString();
        assertEquals("Four", actual);
    }
    @Test
    public void itShouldReturnNull() {
        StringOperand stringOperand = new StringOperand(10);
        String actual = stringOperand.toString();
        assertEquals(null, actual);
    }
}
