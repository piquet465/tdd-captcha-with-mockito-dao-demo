package th.co.gosoft;

public class StringOperand extends Operand {

    public StringOperand(int value) {
        super(value);
    }

    public String toString() {
        String operandString[] = new String[]{"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (this.value - 1 > operandString.length - 1) return null;
        else return operandString[this.value - 1];
    }
}
