package th.co.gosoft;

public class Captcha {
    private final Operand leftOperand;
    private final Operator operator;
    private final Operand rightOperand;
    private final OperandFactory operandFactory;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        operandFactory = new OperandFactory();
        this.leftOperand = operandFactory.createLeftOperand(pattern, leftOperand);
        this.rightOperand = operandFactory.createRightOperand(pattern, rightOperand);

        this.operator = new Operator(operator);
    }

    public Operand getLeftOperand() {
        return leftOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public Operand getRightOperand() {
        return rightOperand;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLeftOperand());
        stringBuilder.append(" ");
        stringBuilder.append(getOperator());
        stringBuilder.append(" ");
        stringBuilder.append(getRightOperand());
        return  stringBuilder.toString();
    }
}
