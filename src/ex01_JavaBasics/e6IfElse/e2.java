package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e2 {
//Q2. Check even or odd
//👉 Take a number and print whether it is even or odd.

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a%2) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
