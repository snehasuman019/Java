class A{
    void fun1(){
        System.out.println("Hi");
    }
}
class B extends A{
    void fun1(){
        System.out.println("Hello");
        super.fun1();
    }
}

public class Polymorphi {
    public static void main(String[] args){
        B b = new B();
        b.fun1();
    }
}
// try considering an int and a float here.