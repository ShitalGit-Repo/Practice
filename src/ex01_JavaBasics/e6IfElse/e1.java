package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Positive number");
        } else if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Its zero");
        }
    }
}
