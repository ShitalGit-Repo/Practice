package ex01_JavaBasics.e13Strings;

public class e1 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = new String("hello");
        String s5 = new String("hello");
        String s6 = new String("world");

        System.out.println(s1 == s2 );
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(s4.equals(s5));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s5));
        System.out.println("------------------");

        System.out.println(s1.contains("H"));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.substring(1, 5));

    }

}
