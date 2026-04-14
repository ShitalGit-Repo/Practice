package ex01_JavaBasics.e17Encapsulation;

public class e2 {
    public static void main(String[] args) {
        ICICIBank icici = new ICICIBank("amit", 20L);
        long bal = icici.getBal();
        System.out.println(bal);
        icici.setBal(300, false);
        long bal2 = icici.getBal();
        System.out.println(bal2);
    }

}
class ICICIBank{
    private String name;
    private long bal;

public ICICIBank (String name, Long bal){
    this.name = name;
    this.bal = bal;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        }else{
            System.out.println("You are not allowed to change bal");
        }
    }
}
