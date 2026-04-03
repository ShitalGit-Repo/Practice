package ex01_JavaBasics.e16Polymorphism;

public class e1Overloading {
    public static void main(String[] args) {
        mathoperator m1 = new mathoperator();
        int r1 = m1.add(2, 3);
        String r2 = m1.add("shital" ,"awachar");
        int r3 = m1.add(1 ,2, 3 );
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}

class mathoperator {
    int add (int a, int b) {
        return a+b;
    }

    int add (int a, int b, int c) {
        return a+b+c;
    }
    double add (double a, double b){
        return a+b;
    }
    String add (String a, String b){
        return a+b;
    }
}

