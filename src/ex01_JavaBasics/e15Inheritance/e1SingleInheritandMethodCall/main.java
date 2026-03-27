package ex01_JavaBasics.e15Inheritance.e1SingleInheritandMethodCall;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();

//calling method from main class
        cat.makesound();

//calling method from extended class
        cat.meow();

    }
}
