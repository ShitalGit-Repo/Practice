package ex01_JavaBasics.e9WhileLoop;

public class e4 {
    public static void main(String[] args) {
//Find the sum of first 10 natural numbers using a while loop.
        int i = 0;
        int sum = 0;
        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("sum of first 10 natural numbers = " +sum);
    }
}
