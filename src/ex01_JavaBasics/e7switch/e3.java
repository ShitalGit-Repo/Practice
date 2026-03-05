package ex01_JavaBasics.e7switch;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
//Q11. Browser selection
//👉 Take browser name:
//chrome → Launch Chrome
//firefox → Launch Firefox
//edge → Launch Edge
//default → Invalid browser

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter browser name : ");
        String browser = scanner.next().toLowerCase();

        switch (browser) {
            case "chrome" :
                System.out.println("Launching chrome");
                break;
            case "firefox" :
                System.out.println("Launching firefox");
                break;
            case "edge" :
                System.out.println("Launching edge");
                break;
            default:
                System.out.println("Invalid browser");
        }
    }
}
