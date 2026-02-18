package ex01_JavaBasics.e3TernaryOperator;

public class e3TernaryOperator {

    public static void main(String[] args) {
//Fine max
        int a = 10;
        int b = 20;
        int max = (a > b) ?  a : b ;
        System.out.println(max);
//2 Find even odd
        int num = 15 ;
        String Result1 = (num%2 == 0) ? "Even" : "Odd" ;
        System.out.println(Result1);
//Find pass fail
        int marks = 38 ;
        String Result2 = (marks >= 40 ) ? "Pass" : "Fail" ;
        System.out.println(Result2);
//Find positive Negative or Zero
        int n = -5 ;
        String Result3 = (n > 0 ) ? "Positive" : (n < 0) ? "Negative" : "Zero";
        System.out.println(Result3);
//Find smallest of two numbers
        int x = 25 ;
        int y = 18 ;
        String Result4 = (x > y ) ? "Y is small" : "X is small" ;
        System.out.println(Result4);
//Assign grade based on marks
        int mark = 72 ;
        String Result5 = (mark >= 90) ? "A Grade" : (mark >= 75) ? "B Grade" : (mark >=60) ? "C Grade" : "Fail" ;
        System.out.println(Result5);
//Check voting eligibility
        int age = 17 ;
        String Result6 = (age >= 18) ? "Eligible" : "Not Eligible" ;
        System.out.println(Result6);
//Browser selection
        String browser = "chrome";
        String Result7 = (browser == "chrome") ? "Launching chrome" : "Launching other Browser" ;
        System.out.println(Result7);
//Login status
        boolean isLoggedIn = false;
        String Result8 = (isLoggedIn == true) ? "Login successful" : "Login Failed";
        System.out.println(Result8);
//Environment selection
        String env = "prod";
        String Result9 = (env == "prod") ? "Production URL" : "Test URL";
        System.out.println(Result9);

    }
}
