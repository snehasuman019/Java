// Abstraction and multilevelinheritance 
// take 2 abstract class and a non abstract class . 
abstract class A{
    abstract void message();

}
class B extends A{
    void message(){
        System.out.println("Hello");

    }
}
class C extends B{
    void message(){
        System.out.println("I am Sneha");
    }
}

public class Multi_Inhe {
    public static void main(String[] args){
        A b = new B();
        A c = new C();
        b.message();
        c.message();
    }
}
