package homework.lesson_07;

public class Operations extends Calculator{
    public Operations(double num1, double num2, String symbol) {
        super(num1, num2, symbol);
    }

    public String operation(String symbol) {
        switch (symbol) {
            case "+":
                return (String.format("%.1f + %.1f = %.1f", getNum1(), getNum2(), sum()));
            case "-":
                return String.format("%.1f - %.1f = %.1f", getNum1(), getNum2(), subtraction());
            case "*":
                return String.format("%.1f * %.1f = %.1f", getNum1(), getNum2(), multiply());
            case "/":
                return String.format("%.1f / %.1f = %.1f", getNum1(), getNum2(), devide());
            default:
                return null;
        }
    }

}
