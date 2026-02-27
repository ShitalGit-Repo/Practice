package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
//Q3. Find the largest of two numbers
//👉 Compare two integers and print the larger one.

        System.out.print("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Both are equal");
        }
    }
}
