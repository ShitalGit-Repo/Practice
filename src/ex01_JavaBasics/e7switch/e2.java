package ex01_JavaBasics.e7switch;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
//Q10. Calculator
//👉 Take two numbers and operator (+ - * /) and perform calculation.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = scanner.nextDouble();// double is used to handle decimal values & accurate division results.
        System.out.print("Enter second number : ");
        double b = scanner.nextDouble(); //avoid loss of precision during division.
        System.out.print("Enter operator (+, -, *, /) : ");
        char operator = scanner.next().charAt(0); //Scanner does not provide a direct method to read a character, so we use next() to read a String and charAt(0) to extract the operator character.

        switch (operator) {
            case '+' :
                System.out.println("Result = "+ (a+b));
                break;
            case '-' :
                System.out.println("Result = "+ (a-b));
                break;
            case '*' :
                System.out.println("Result = "+ (a*b));
                break;
            case '/' :
                if (b != 0) {
                System.out.println("Result = "+ (a/b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("invalid Operator");
        }
    }
}
