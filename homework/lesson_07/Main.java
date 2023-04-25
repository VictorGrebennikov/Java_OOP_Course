package homework.lesson_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.print("Input the first number: ");
            double num1 = scaner.nextDouble();
            System.out.print("Input operation sign: ");
            String symbol = scaner.next();
            System.out.print("Input the second number: ");
            double num2 = scaner.nextDouble();

            Operations calc = new Operations(num1, num2, symbol);
            System.out.println(calc.operation(symbol));
            System.out.println("Do you want continue? 'y' or 'n':");
            String answer = scaner.next();
            if (answer.equals("n")) {
                break;
            }
        }
        scaner.close();
    }
}
