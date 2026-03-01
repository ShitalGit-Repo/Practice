package ex01_JavaBasics.e4UserInput;

public class e5IncreDecreOperator {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println(a);

        int b = 10;
        --b;
        System.out.println(b);

        int x = 7;
        int y = x++;
        System.out.println(x + " " + y);

        int p = 8;
        int q = ++p;
        System.out.println(p + " " + q);

        int l = 3;
        int o = l++ + ++l;   // 3 + 5
        System.out.println(l + " " + o);

        int m = 5;
        int n = m++ + m++ + ++m;  // 5+6+8
        System.out.println(m + " " + n);

        int i = 10;
        int w = i-- + --i;  // 10+8=18
        System.out.println(i + " " + w); //8  18

        int g = 2;
        int h = g++ + ++g + g++ + ++g; //2+4+4+6=16
        System.out.println(g + " " + h); //6 16

        int v = 5;
        int j = v++ + ++v - v-- + --v; //5+7-7+5 = 10
        System.out.println(v + " " + j);
    }
}
