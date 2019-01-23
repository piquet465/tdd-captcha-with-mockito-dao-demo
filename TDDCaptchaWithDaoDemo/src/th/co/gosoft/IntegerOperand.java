package th.co.gosoft;

public class IntegerOperand extends Operand {

    public IntegerOperand(int value) {
        super(value);
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
