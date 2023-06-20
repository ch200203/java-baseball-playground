package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        Calculator calculator = new Calculator();

        calculator.calculate(value);

    }

    public int calculate(String value) {
        String[] values = value.split(" ");
        int result = Integer.parseInt(values[0]);

        for(int i = 1; i < values.length - 1; i += 2) {
            String operator = values[i];
            int num = Integer.parseInt(values[i + 1]);

            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected operator: " + operator);
            }
        }
        return result;
    }
}
