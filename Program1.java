import java.util.Scanner;

public class Program1 {

    static class Calculator {
        double addition(double a, double b) {
            return a + b;
        }

        double subtraction(double a, double b) {
            return a - b;
        }

        double multiplication(double a, double b) {
            return a * b;
        }

        double division(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter type of operation: addition, subtraction, multiplication, division ");
        String typeofoperation = sc.next().toLowerCase();

        double result = 0;
        boolean valid = true;

        try {
            if (typeofoperation.equals("addition")) {
                result = calc.addition(a, b);
            } else if (typeofoperation.equals("subtraction")) {
                result = calc.subtraction(a, b);
            } else if (typeofoperation.equals("multiplication")) {
                result = calc.multiplication(a, b);
            } else if (typeofoperation.equals("division")) {
                result = calc.division(a, b);
            } else {
                System.out.println("Invalid operation.");
                valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
 * Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
 * Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
 * Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
 */
