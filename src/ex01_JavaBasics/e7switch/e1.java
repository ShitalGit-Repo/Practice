package ex01_JavaBasics.e7switch;

import java.time.DayOfWeek;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
//Q9. Print day of the week

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int day = scanner.nextInt();

        switch (day) {

            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }
    }
}
