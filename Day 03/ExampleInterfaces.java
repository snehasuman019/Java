interface Payment{
    void pay(int amount);  //interface 
}
interface Balance{
    void pay(int amount);
    int getBalance();
    default void show(){
        System.out.println("This is a default method in interface");
    }
}
class Upi implements Payment, Balance{
    public void pay(int amount){
        System.out.println("Paid via UPI: "+amount);
    }
    public int getBalance(){
        return 1000;
    }
    public void show(){
        System.out.println("This is overridden method in Upi class");
        Balance.super.show();
    }
}

public class ExampleInterfaces {
    public static void main(String[] args){
        Upi u = new Upi();
        u.pay(1490);
        int Balance = u.getBalance();
        System.out.println("Balance: "+Balance);
        u.show();
    }
}
