package ex01_JavaBasics.e15Inheritance.e3MultilevelLoginSystem;

public class main {
    public static void main(String[] args) {
        SuperAdmin superadmin = new SuperAdmin();
        superadmin.login();
        superadmin.accessAdminPanel();
        superadmin.shutdownSystem();
    }
}
