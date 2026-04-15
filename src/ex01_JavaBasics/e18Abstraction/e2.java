package ex01_JavaBasics.e18Abstraction;

public class e2 {
    public static void main(String[] args) {
       WagonR car = new WagonR();
       car.drive();
    }
}
abstract class engine {
    abstract void startingengine ();
    abstract void stopingengine ();
    void checkengine (){
        System.out.println("Everything is good!");
    }
}
class WagonR extends engine {
    void startingengine (){
        System.out.println("Starting the engine");
    }
    void stopingengine (){
        System.out.println("Stoping the engine");
    }
    void drive (){
        checkengine();
        startingengine();
        stopingengine();
    }
}