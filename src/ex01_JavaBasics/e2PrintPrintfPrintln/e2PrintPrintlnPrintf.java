package ex01_JavaBasics.e2PrintPrintfPrintln;

public class e2PrintPrintlnPrintf {
    public static void main(String[] args) {

        int a = 20;

        System.out.print("Print command without new line");
        System.out.println("Print command with new line");
        System.out.printf("your variable name is %d", a);
        System.out.println("-----------");

        int b = 10;
        System.out.printf("%d + %d",a,b);

        int num = 9;
        System.out.printf("%d x %d = %d",9,1,9).println();
        System.out.printf("%d x %d = %d",9,2,18).println();
        System.out.printf("%d x %d = %d",9,3,27).println();
        System.out.printf("%d x %d = %d",9,4,36).println();
        System.out.printf("%d x %d = %d",9,5,45).println();
    }
}
