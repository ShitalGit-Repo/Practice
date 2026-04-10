package ex01_JavaBasics.e16Polymorphism;

public class e7GreetUser {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        String g1 = g.greet();
        String g2 = g.greet("Piyush");
        System.out.println(g1);
        System.out.println(g2);
    }
}
class Greeter {
    String greet (){
        return "Hello";
    }
    String greet (String name){
        return "Hello " + name;
    }
}