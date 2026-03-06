package ex01_JavaBasics.e7switch;

import java.util.Locale;
import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
//Q12. Environment selection
//👉 Take environment:
//qa → QA URL
//dev → Dev URL
//prod → Prod URL

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter environment : ");
        String env = scanner.next().toLowerCase();

        switch (env) {
            case "qa" :
                System.out.println("QA URL");
                break;
            case "dev" :
                System.out.println("Dev URL");
                break;
            case "prod" :
                System.out.println("Prod URL");
                break;
            default:
                System.out.println("Invalid env");
        }
    }
}
