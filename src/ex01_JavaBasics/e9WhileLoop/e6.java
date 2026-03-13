package ex01_JavaBasics.e9WhileLoop;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
//Count the number of digits in a given number.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();
        int count = 0 ;
        while (a !=0) {
            a = a/10;
            count++;
        }
        System.out.println("Total digits in given no are : " + count);
    }
}
