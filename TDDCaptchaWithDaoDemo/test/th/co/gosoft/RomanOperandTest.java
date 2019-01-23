package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanOperandTest {
    @Test
    public void itShouldReturnI() {
        RomanOperand romanOperand = new RomanOperand(1);
        String actual = romanOperand.toString();
        assertEquals("I", actual);
    }
    @Test
    public void itShouldReturnIX() {
        RomanOperand romanOperand = new RomanOperand(9);
        String actual = romanOperand.toString();
        assertEquals("IX", actual);
    }
    @Test
    public void itShouldReturnIV() {
        RomanOperand romanOperand = new RomanOperand(4);
        String actual = romanOperand.toString();
        assertEquals("IV", actual);
    }
    @Test
    public void itShouldReturnNull() {
        RomanOperand romanOperand = new RomanOperand(10);
        String actual = romanOperand.toString();
        assertEquals(null, actual);
    }
}
