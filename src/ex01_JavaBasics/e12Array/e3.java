package ex01_JavaBasics.e12Array;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
//Q - Left Triangle

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = scanner.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
