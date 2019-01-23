package th.co.gosoft;

public class OperandFactory {
    public Operand createLeftOperand(int pattern, int operandValue) {
        if (pattern == 1)
            return new StringOperand(operandValue);
        else
            return new IntegerOperand(operandValue);
    }

    public Operand createRightOperand(int pattern, int operandValue) {
        if (pattern == 1)
            return new IntegerOperand(operandValue);
        else
            return new StringOperand(operandValue);
    }
}
