package ex01_JavaBasics.e8ForLoop;

import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
//Q10. Check prime number
//
//👉 Print whether a number is prime or not.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        boolean isprime = true;
        if (num <= 1) {
            isprime = false ;
        }else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0){
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not prime number");
        }
    }
}
