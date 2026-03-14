package ex01_JavaBasics.e9WhileLoop;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
//Reverse a given number using a while loop.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int reverse = 0;

        while (num != 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number : " + reverse);
    }
}
