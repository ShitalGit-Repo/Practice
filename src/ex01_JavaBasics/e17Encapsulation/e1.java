package ex01_JavaBasics.e17Encapsulation;

public class e1 {
    public static void main(String[] args) {
        login l1 = new login("admin", "pass123");
        System.out.println(l1.password);  //anyone can see passowrd

        encapsulatedLogin l2 = new encapsulatedLogin("shital", "pwd123");
//        System.out.println(l2.password);  //not able to access
        String pass = l2.getPassword();
        System.out.println(pass);
        l2.setPassword("pwd12345", true);
        System.out.println(pass);

//Admin want to change password
    }
}
class login {
    public String username;
    public String password;

    public login (String username, String password){
        this.username = username;
        this.password = password;
    }
}
class encapsulatedLogin {
    private  String username;
    private String password;

    public encapsulatedLogin(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else{
            System.out.println("You can't change the password");
        }
    }
}
