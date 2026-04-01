package ex01_JavaBasics.e15Inheritance.e3MultilevelLoginSystem;

public class SuperAdmin extends AdminUser {

    void shutdownSystem (){
        System.out.println("Calling from SuperAdmin class");
    }
}
