package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
//Q4. Check voting eligibility
//👉 Take age from user:
//≥ 18 → Eligible
//else → Not Eligible

        System.out.print("Enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
