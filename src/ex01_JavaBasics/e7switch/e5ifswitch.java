package ex01_JavaBasics.e7switch;

import java.util.Scanner;

public class e5ifswitch {
    public static void main(String[] args) {
//Q13. Login + role
//👉 If login successful:
//role = admin → Admin Dashboard
//role = user → User Dashboard

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.next().toLowerCase();
        System.out.print("Enter password : ");
        String password = scanner.next().toLowerCase();
        boolean isLoggedin = false;

        if (username.equals("admin") && password.equals("1234")){
            System.out.println("Admin login successful");
            isLoggedin = true ;
        }else if (username.equals("user") && password.equals("3456")){
            System.out.println("User login successful");
            isLoggedin = true;
        }else {
            System.out.println("Login failed");
        }
        if (isLoggedin) {
            switch (username) {
                case "admin":
                    System.out.println("Navigating to Admin dashboard");
                    break;
                case "user":
                    System.out.println("Navigating to User Dashboard");
            }
        }
    }
}
