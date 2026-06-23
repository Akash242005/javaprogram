import java.util.*;
class BankAccount{
    private int amount;
    private String name;
    public int getAmount() {
        if(passwordValidation()){
            return amount;
        }
        return -1000;
    }
    public String getName() {
        return name;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    private boolean passwordValidation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String pass = sc.next();
        if(pass.equals("1234")){
            return true;
        }
        return false;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        sbi.setAmount(100);
        sbi.setName("AKASH");
        int amount = sbi.getAmount();
        if(amount==-1000){
            System.out.println("Enter valid password");
        }
        else{
            System.out.println("Your balance : "+amount);
        }
    }
}