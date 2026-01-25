// class A{
//     void fun1(){
//         System.out.println("Hi");
//     }
// }
// class B extends A{
//     void fun1(){
//         System.out.println("Hello");
//         super.fun1();
//     }
// }

// public class Polymorphi {
//     public static void main(String[] args){
//         B b = new B();
//         b.fun1();
//     }
// }
// try considering an int and a float here.


/* 
class A {
    void fun1() {
        System.out.println("Hi (from Class A)");
    }
}

class B extends A {
    @Override // Good practice to include this annotation
    void fun1() {
        System.out.println("Hello (from Class B)");
        super.fun1(); // Calls the parent version of the method
    }
}

public class Polymorphi { 
    public static void main(String[] args) {
        // Create an instance of the subclass
        B b = new B();
        
        // This will trigger the overridden method in Class B
        b.fun1();
    }
}
*/



class Calculator {
    // Method for integer addition
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    // Overloaded method for float addition
    // The method name is the same, but the parameter types are different
    void add(float a, float b) {
        System.out.println("Sum of floats: " + (a + b));
    }
}

public class Polymorphi {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Java knows which one to call based on the arguments
        calc.add(10, 20);          // Calls the int version
        calc.add(10.5f, 20.3f);    // Calls the float version (note the 'f' suffix)
    }
}