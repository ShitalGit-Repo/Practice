package ex01_JavaBasics.e15Inheritance.e3MultilevelLoginSystem;

public class AdminUser extends User {

    void accessAdminPanel (){
        System.out.println("Calling from AdminUser class");
    }
}
