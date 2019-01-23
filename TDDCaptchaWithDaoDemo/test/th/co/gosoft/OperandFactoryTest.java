package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OperandFactoryTest {
    private static final int DUMMY_LEFT_OPERAND_VALUE = 7;
    private static final int DUMMY_RIGHT_OPERAND_VALUE = 6;

    @Test
    public void firstPatternLeftOperandShouldBeInstanceOfStringOperand() {
        OperandFactory operandFactory = new OperandFactory();
        assertTrue(operandFactory.createLeftOperand(1, DUMMY_LEFT_OPERAND_VALUE) instanceof StringOperand);
    }
    @Test
    public void firstPatternRightOperandShouldBeInstanceOfIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory();
        assertTrue(operandFactory.createRightOperand(1, DUMMY_RIGHT_OPERAND_VALUE) instanceof IntegerOperand);
    }
    @Test
    public void secondPatternLeftOperandShouldBeInstanceOfIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory();
        assertTrue(operandFactory.createLeftOperand(2, DUMMY_LEFT_OPERAND_VALUE) instanceof IntegerOperand);
    }
    @Test
    public void secondPatternRightOperandShouldBeInstanceOfStringOperand() {
        OperandFactory operandFactory = new OperandFactory();
        assertTrue(operandFactory.createRightOperand(2, DUMMY_RIGHT_OPERAND_VALUE) instanceof StringOperand);
    }
}
