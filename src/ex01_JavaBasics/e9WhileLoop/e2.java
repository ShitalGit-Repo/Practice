package ex01_JavaBasics.e9WhileLoop;

public class e2 {
    public static void main(String[] args) {
//Print even numbers from 1 to 50 using a while loop.
        int i = 1;
        while (i <= 50){
            if (i%2 == 0) {
                System.out.println(i + " Even number");
            }
            i++;
        }
    }
}
