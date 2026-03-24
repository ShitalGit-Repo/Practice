package ex01_JavaBasics.e13Strings;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {

//check whether the string is palindrome or not using user input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String Input = scanner.next();
        String newstring_reversed = reverseString(Input);

        if (newstring_reversed.equalsIgnoreCase(Input)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }

//1st way - using inbuilt function
        static String reverseStringSB ( String userInput){
            StringBuilder stringbuilder = new StringBuilder(userInput);
            return stringbuilder.reverse().toString();
        }
//2nd way - without using inbuilt function
        static String reverseString (String userinput){
            String reversed = "";
            for (int i = userinput.length()-1; i >=0 ; i--) {
            reversed = reversed + userinput.charAt(i);
            }
        return reversed;
    }
}
