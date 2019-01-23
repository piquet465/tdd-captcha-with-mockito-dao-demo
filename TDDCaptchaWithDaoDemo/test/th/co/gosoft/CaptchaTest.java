package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CaptchaTest {

    private static final int DUMMY_OPERATOR = 3;
    private static final int DUMMY_RIGHT_OPERAND = 1;
    private static final int DUMMY_PATTERN = 1;
    private static final int DUMMY_LEFT_OPERAND = 2;

    @Test
    public void leftOperandShouldBeInstanceOfOperand() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT_OPERAND, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        assertTrue(captcha.getLeftOperand() instanceof Operand);
    }
    @Test
    public void rightOperandShouldBeInstanceOfOperand() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT_OPERAND, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        assertTrue(captcha.getRightOperand() instanceof Operand);
    }

    @Test
    public void operatorShouldBeInstanceOfOperator() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT_OPERAND, 1, DUMMY_RIGHT_OPERAND);
        assertTrue(captcha.getOperator() instanceof Operator);
    }

    @Test
    public void แสดงผลลัพธ์เป็นรูปแบบที่หนึ่ง_one_plus_1(){
        Captcha captcha = new Captcha(1,1,1,1);
        String actual = captcha.toString();
        assertEquals("One + 1",actual);
    }

    @Test
    public void แสดงผลลัพธ์เป็นรูปแบบที่สอง_1_plus_one(){
        Captcha captcha = new Captcha(2,1,1,1);
        String actual = captcha.toString();
        assertEquals("1 + One",actual);
    }
}
