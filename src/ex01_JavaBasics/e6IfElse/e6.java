package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
//Q6. Grade calculation
//👉 Take marks from user:
//≥ 90 → A    ≥ 75 → B   ≥ 60 → C
//else → Fail

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        int marks = scanner.nextInt();

        if (marks >= 90 ) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("FAIL");
        }
    }
}
