package ex01_JavaBasics.e8ForLoop;

import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
//Q8. Reverse a number
//👉 Example: 123 → 321

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        int rev = 0;

        for (;num != 0; num = num/10) {
            int digit = num%10;
            rev = rev * 10 + digit ;
        }
        System.out.println("Reversed number = " + rev);
    }
}
