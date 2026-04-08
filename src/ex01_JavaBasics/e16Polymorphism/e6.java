package ex01_JavaBasics.e16Polymorphism;

public class e6 {
    public static void main(String[] args) {

        MathOperations m = new MathOperations();
        int a1 = m.multiply(4, 5);
        System.out.println(a1);
        int a2 = m.multiply(4, 5, 3);
        System.out.println(a2);
    }
}
class MathOperations {
    int multiply (int a, int b, int c){
        return a*b*c;
    }
    int multiply (int a, int b){
        return a*b;
    }
}