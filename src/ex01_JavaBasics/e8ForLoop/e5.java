package ex01_JavaBasics.e8ForLoop;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
//Q5. Print multiplication table of a number
//👉 Take number from user and print its table.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
