// Encapsulation
class Account{
    private int accno;
    private int balance;
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int b){
        this.balance = b;
    }
}

public class Bank {
    public static void main(String[] args){
        Account b = new Account();
        b.setBalance(1000);
        int amt = b.getBalance();
        System.out.println("Current Balance: "+amt);
    }
}
// create a student validation program in which marks must be between 0-100 considering encapsulation in mind.
