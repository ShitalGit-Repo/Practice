package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
//Q5. Find the largest of three numbers
//👉 Use if–else if–else.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter second number : ");
        int b = scanner.nextInt();

        System.out.print("Enter third number : ");
        int c = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
