package ex01_JavaBasics.e16Polymorphism;

public class e3 {
    public static void main(String[] args) {
        chromeTC c1 = new chromeTC();
        c1.openbrowser();

        firefox f1 = new firefox();
        f1.openbrowser();

//Dynamic Dispatch
        commontoAll c2 = new chromeTC();
        c2.openbrowser();

//      firefox f2 = new chromeTC();  -- not possible as there is no relation between them
    }
}
class commontoAll {
    void openbrowser (){
        System.out.println("IE Browser");
    }
}
class chromeTC extends commontoAll{
    void openbrowser (){
        System.out.println("chrome Browser");
    }
}
class firefox extends commontoAll{
    void openbrowser (){
        System.out.println("firefox Browser");
    }
}
