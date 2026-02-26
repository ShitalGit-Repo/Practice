package ex01_JavaBasics.e8ForLoop;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
//Q6. Find sum of first N natural numbers
//👉 Take N from user.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter natural number : ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
            System.out.println("Sum of first " + num + " natural numbers = " + sum);
        }
    }

