package ex01_JavaBasics.e16Polymorphism;

public class e2 {
    public static void main(String[] args) {
    browser b1 = new browser();
    b1.startbrowser();
    b1.startbrowser("chrome");
    }
}
class browser {
    void startbrowser (){
        System.out.println("Starting default browser");
    }
    void startbrowser (String browser){
        System.out.println("Starting browser "+ browser);
    }
}
