package ex01_JavaBasics.e16Polymorphism;

public class e9 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Bike b1 = new Bike();
        Car c1 = new Car();
        b1.start();
        c1.start();
    }
}
class Vehicle {
    void start (){
        System.out.println();
    }
}
class Bike extends  Vehicle{
    void start () {
        System.out.println("Kick start");
    }
}
class Car extends  Vehicle {
    void start (){
        System.out.println("Insert key and turn");
    }
}