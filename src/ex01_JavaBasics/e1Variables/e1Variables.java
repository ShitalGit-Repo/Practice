package ex01_JavaBasics.e1Variables;

public class e1Variables {

    // Global Variable - define outside the main method
    int a = 20; //global variable
    static int b = 30;   // static global variable

    public static void main(String[] args) {
        String name = "shital";  //Local Variable
        int c =  10;
//      static int d = 10;  - you cannot define Local variable as static.
    }
    public void age (){
        String surname = " Singh";
        System.out.println(surname);
    }
}
