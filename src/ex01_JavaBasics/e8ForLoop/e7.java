package ex01_JavaBasics.e8ForLoop;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
//Q7. Count digits in a number
//👉 Example: 12345 → 5 digits

        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        int count = 0;

        for (;num != 0; num = num/10) {
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
}
