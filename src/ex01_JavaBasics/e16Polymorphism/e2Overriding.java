package ex01_JavaBasics.e16Polymorphism;

public class e2Overriding {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();

    }
}
class animal {
    void sound (){
        System.out.println("Default sound");
    }
}
class dog extends animal {
    void sound (){
        System.out.println("Bark");
    }
}
