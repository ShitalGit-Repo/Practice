package ex01_JavaBasics.e11Functions;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {

//type 1 - without parametr without return type
//type 2 - with parameter without return type
//type 3 - without parameter with return type
//type 4 - with parameter with return type

//Q - Create functions for Addition, Substraction, Multiplication, Division
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }else {
            System.out.println("Enter int only");
            return;
        }
        System.out.print("Enter second number : ");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }else {
            System.out.println("Enter int only");
            return;
        }

        int result_add = add(a, b);
        System.out.println(result_add);
        int result_sub = sub(a,b);
        System.out.println(result_sub);
        int result_mul = mul(a, b);
        System.out.println(result_mul);
        int result_div = div(a,b);
        System.out.println(result_div);

        }
    static int add (int a, int b) {
        return a+b;
    }
    static int sub (int a, int b){
        return a-b;
    }
    static int mul (int a , int b){
        return a*b;
    }
    static int div (int a , int b){
        if (b == 0){
            System.out.println("b can't be zero");
            System.exit(0);
        }
        return a/b;
    }
}
