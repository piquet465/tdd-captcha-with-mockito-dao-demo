package th.co.gosoft;

public class Operator {
    private final int index;

    public Operator(int i) {
        this.index = i;
    }

    public String toString() {
        String operatorMapping[] = new String[]{"+","*","-","/"};
        if(this.index - 1 > operatorMapping.length - 1) return null;
        else return operatorMapping[this.index - 1];
    }
}
