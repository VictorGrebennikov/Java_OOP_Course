package homework.lesson_07;

public class Calculator implements iOperations {
    private double num1;
    private double num2;
    private String symbol;

    public Calculator(double num1, double num2, String symbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.symbol = symbol;
    }

    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public String getSym() {
        return symbol;
    }
    @Override
    public double sum() {
        double sum = num1 + num2;
        return sum;
    }
    @Override
    public double subtraction() {
        double diff = num1 - num2;
        return diff;
    }
    @Override
    public double multiply() {
        double mult = num1 * num2;
        return mult;
    }
    @Override
    public double devide() {
        double dev = num1 / num2;
        return dev;
    }
}
