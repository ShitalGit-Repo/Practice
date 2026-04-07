package ex01_JavaBasics.e16Polymorphism;

public class e4 {
    public static void main(String[] args) {

        calculator calci =new calculator();
        int c1 = calci.add(4, 5);
        double c2 = calci.add(4.5, 5.5);
        System.out.println(c1);
        System.out.println(c2);
    }
}
class calculator {
    int add (int a, int b){
    return a+b;
    }
    double add (double a, double b){
        return a+b;
    }
}

