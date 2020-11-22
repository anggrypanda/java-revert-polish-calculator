package Calculator;

import java.util.Stack;
import static java.lang.Double.parseDouble;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculate("3 5 * 6 8 * 2 + +");
    }

    public static Double Calculate(String input) {
        String[] elements = input.split(" ");
        Stack<Double> stack = new Stack<Double>();
        Double n1, n2;
        Double result = 0.0;

        for (String element : elements) {
            System.out.println(element);

            if (element.matches("^(?:[+]|[-]|[*]|[/])$")) {
                    n1 = stack.pop();
                    n2 = stack.pop();

                    if (element.equals("+")) {
                        result = n2 + n1;

                    } else if (element.equals("-")) {
                        result = n2 - n1;

                    } else if (element.equals("*")) {
                        result = n2 * n1;

                    } else if (element.equals("/")) {
                        result = n2 / n1;
                    }
                    stack.push(result);
                    System.out.println(stack);

            } else if (element.matches("\\d")) {
                result = parseDouble(element);
                stack.push(result);
                System.out.println(stack);

                } else
                    System.out.println("Error");
            }
        return result;
    }
}