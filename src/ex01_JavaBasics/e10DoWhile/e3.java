package ex01_JavaBasics.e10DoWhile;

public class e3 {
    public static void main(String[] args) {
//Print odd numbers between 1 and 20 using a do-while loop.
        int i = 1;
        do {
            System.out.println(i);
            i +=2;  //move to the next odd number
        }while (i<=20);
    }
}
