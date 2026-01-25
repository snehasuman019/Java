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

/*without using @override function.

 */
class A {
    // Parent method using an int
    void fun1(int age) {
        System.out.println("Age from Class A: " + age);
    }
}

class B extends A {
    // Overriding the parent method using a float
    // Note: To override, the parameters must match exactly.
    // Here we use fun1(int) to maintain the override, then use a float inside.
    void fun1(int age) {
        float height = 5.8f; 
        System.out.println("Height from Class B: " + height);
        System.out.println("Hello (from Class B)");
        super.fun1(age); 
    }
}

public class Polymorphi { 
    public static void main(String[] args) {
        B b = new B();
        
        // Passing an int (25) to the method
        b.fun1(25);
    }
}

/* 
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
    */