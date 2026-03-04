package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
//Q8. Leap year check
//👉 Take year and check whether it is a leap year.
        //Logic - A year is a leap year if:
        //It is divisible by 400    OR     It is divisible by 4 AND not divisible by 100

        System.out.print("Enter a year : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println( year + " is a leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
    }
}
