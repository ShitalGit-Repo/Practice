package ex01_JavaBasics.e16Polymorphism;

public class e5 {
    public static void main(String[] args) {

        printer p = new printer();
        String s = p.printData("shital");
        int i = p.printData(3);
        float f = p.printData((int)5.5);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
    }
}
class printer {
    String printData (String data){
        return data;
    }
    int printData (int data){
        return data;
    }
    float printData (float data){
        return data;
    }
}
