package ex01_JavaBasics.e16Polymorphism;

public class e8 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        Clerk c1 = new Clerk();
        Tester t1 = new Tester();
        e1.role();
        m1.role();
        c1.role();
        t1.role();
    }
}
class Employee {
    void role (){
        System.out.println("General Employee");
    }
}
class Manager extends Employee {
    void role (){
        System.out.println("Team Manage");
    }
}
class Clerk extends Employee {
    void role (){
        System.out.println("Documentation");
    }
}
class Tester extends Employee {
    void role (){
        System.out.println("Maintaining quality of the product");
    }
}
