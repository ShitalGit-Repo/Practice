package ex01_JavaBasics.e6IfElse;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
//Q7. Login validation
//👉 Take username and password:
//admin / 1234 → Login Successful
//else → Login Failed

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username : ");
        String username = scanner.next();

        System.out.print("Enter password : ");
        String password = scanner.next();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }}
