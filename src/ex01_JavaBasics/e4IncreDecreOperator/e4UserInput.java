package ex01_JavaBasics.e4IncreDecreOperator;

import java.util.Scanner;

public class e4UserInput {
    public static void main(String[] args) {
//Q1. Read an integer and print it - Take a number from user and print:
        System.out.print("You entered: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

//Q2. Check even or odd - Take an integer from user and print whether it is Even or Odd.
        System.out.println("You entered: ");
        int b = scanner.nextInt();
        String result1 = (b%2 == 0) ? "Even" : "Odd" ;
        System.out.println(result1);

//Q3. Read name and age - Take user name (String) and age (int) and print:
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Name:" + name + ",Age:"+ age );

//Q4. Add two numbers - Take two integers from user and print their sum.
        System.out.print("Enter first number : ");
        int one = scanner.nextInt();
        System.out.print("Enter second number : ");
        int two = scanner.nextInt();
        int sum = one + two;
        System.out.println("Sum is : " + sum);

//Q5. Find the largest of three numbers - Take 3 integers from user and print the largest number.
        System.out.print("First Digit : ");
        int digit1 = scanner.nextInt();
        System.out.print("Second Digit :");
        int digit2 = scanner.nextInt();
        System.out.print("Third Digit :");
        int digit3 = scanner.nextInt();
        String Large = (digit1 > digit2) ? "digit1" : (digit2 > digit3) ?  "digit1" : "digit3" ;
        System.out.println(Large);

//Q6. Check voting eligibility - Take age from user and print:
        System.out.print("Enter your age : ");
        int Age = scanner.nextInt();
        String Result1 = (Age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(Result1);

//Q7. Calculate percentage - Take total marks and obtained marks from user and Print percentage.
        System.out.print("Enter total marks : ");
        int totalmark = scanner.nextInt();
        System.out.print("Enter obtained marks : ");
        int obtainmark = scanner.nextInt();
        int percentage = (obtainmark/totalmark)*100;
        System.out.println("Percentage is : " + percentage);

//Q8. Check username and password - Take username and password from user
//    If username = admin and password = 1234, print "Login Successful" else "Login Failed".
        System.out.print("Enter username : " );
        String username = scanner.next();
        System.out.println("Enter password : ");
        String password = scanner.next();
        //it is using if else statement we will learn later

    }
}
