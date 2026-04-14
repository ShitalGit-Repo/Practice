package ex01_JavaBasics.e18Abstraction;

public class e1 {
    public static void main(String[] args) {
        child child = new child ();
        child.loan50k();
        father f2 = new child(); //dynamic dispatch
    }
}
abstract class father {
    abstract void loan50k ();   //abstract function
    void loan25k (){
        System.out.println("25k given");  //complete/concrete function
    }
}
class child extends father {
    void loan50k (){
        System.out.println("son has to give 50k loan");
    }
        }
