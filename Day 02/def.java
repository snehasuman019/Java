// default access modifier
class Car {
    String model; // default access modifier
}
public class def{
    public static void main(String[] args){
        Car c = new Car();
        c.model = "Mustang"; // accessible within the same package
        System.out.println("Car model: " + c.model);
    }
}
// If we change the class Car to public, it will still work as both classes are in the same package.
// However, if we try to access the Car class from a different package, it will result in a compilation error.
// Similarly, if we change the model variable to private, it will not be accessible outside the Car class, even within the same package.
// To demonstrate, uncommenting the following line will cause a compilation error:
// System.out.println("Car model: " + c.model); // Error: model has private access in Car
// To fix this, we can provide public getter and setter methods in the Car class to access the private variable.
// Example:
/*
class Car {
    private String model; // private access modifier
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
}
*/
// Then we can use these methods in the main method:
/*  
c.setModel("Mustang");
System.out.println("Car model: " + c.getModel());
*/
/* 
// default class within the same package
class Bike {
    String type; // default access modifier
}
class Test {
    public static void main(String[] args){
        Bike b = new Bike();
        b.type = "Sport"; // accessible within the same package
        System.out.println("Bike type: " + b.type);
    }
}
// If we try to access the Bike class from a different package, it will result in a compilation error.
// Similarly, if we change the type variable to private, it will not be accessible outside the Bike class, even within the same package.
*/
// To demonstrate, uncommenting the following line will cause a compilation error:
// System.out.println("Bike type: " + b.type); // Error: type has private access in Bike
// To fix this, we can provide public getter and setter methods in the Bike class to access
// the private variable.
// Example:
/*
class Bike {
    private String type; // private access modifier
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}
*/  
// Then we can use these methods in the main method:
/*
b.setType("Sport");
System.out.println("Bike type: " + b.getType());
*/
// default class from a different package
/*package anotherPackage;
class Truck {
    String brand; // default access modifier
}
*/
/*package testPackage;
import anotherPackage.Truck;    
public class TestTruck {
    public static void main(String[] args){
        Truck t = new Truck();
        t.brand = "Ford"; // Error: brand is not public in Truck; cannot be accessed from outside package
        System.out.println("Truck brand: " + t.brand);
    }
}
*/
// Since the Truck class has default access modifier, it cannot be accessed from a different package.
// Similarly, if we change the brand variable to private, it will not be accessible outside the Truck class, even within the same package.
// To demonstrate, uncommenting the following line will cause a compilation error:
// System.out.println("Truck brand: " + t.brand); // Error: brand has private access in Truck
// To fix this, we can provide public getter and setter methods in the Truck class to access
// the private variable.
// Example:
/*
package anotherPackage;
class Truck {
    private String brand; // private access modifier
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
}
*/
// Then we can use these methods in the main method of TestTruck class:
/*  
t.setBrand("Ford"); 
System.out.println("Truck brand: " + t.getBrand());
*/
// However, since the Truck class itself has default access modifier, we still cannot access it from a different package, even with public methods.
// The Truck class needs to be declared as public to be accessible from other packages.
/*without using @override function.

 *//*with using @override function.
class A {
    // Parent method
    void fun1() {
        System.out.println("Hello (from Class A)");
    }   
}
class B extends A {
    // Overriding the parent method
    @Override
    void fun1() {
        float height = 5.8f; 
        System.out.println("Height from Class B: " + height);
        System.out.println("Hello (from Class B)");
        super.fun1(); 
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

    }
}
        super.fun1(age); // Calls the parent version of the method
    }
}
public class Polymorphi { 
    public static void main(String[] args) {
        // Create an instance of the subclass
        B b = new B();
        
        // This will trigger the overridden method in Class B
        b.fun1(25); // Passing an int value
    }
}   
}
*/