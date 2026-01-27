// public access modifier
/* 
class Car {
    public String model; // public access modifier

}


public class pub {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Mustang"; // accessible here
        System.out.println("Car model: " + c.model);
    }
}
*/

class MathUtils {
    public int add(int a, int b) {
        return a + b; // accessible here
    }
}   
public class pub{
    public static void main(String[] args){
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(5,10)); // accessible here
        // System.out.println(MathUtils.add(5,10));

        // System.out.println(MathUtils.add(5,10));  //accessible anywhere

    }
}
// add() is globally accessible due to the public modifier.
// If we try to access the Car class from a different package, it will be accessible without any issues.
// Similarly, the add method in MathUtils class can be accessed from any other class or package without restrictions.
// Hence, public members are accessible from any other class or package.