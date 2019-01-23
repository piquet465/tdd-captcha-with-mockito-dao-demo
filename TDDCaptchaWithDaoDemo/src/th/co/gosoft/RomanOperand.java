package th.co.gosoft;

public class RomanOperand extends Operand{
    public RomanOperand(int value) {
        super(value);
    }

    public String toString() {
        String operandString[] = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX"};
        if (this.value - 1 > operandString.length - 1) return null;
        else return operandString[this.value - 1];
    }
}
