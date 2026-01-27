// protected access modifier
class Vehicle{
    protected int speed; //protected member variable
}
class Bike extends Vehicle{
    void setSpeed(int s){
        speed = s; //accessible within subclass
    }
    int getSpeed(){
        return speed; //accessible within subclass
    }
}
public class proc {
    public static void main(String[] args){
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Bike speed: " + b.getSpeed());
        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
// speed is accessible via subclass methods and other classes in the same package, but direct access from a different package (non-subclass) would fail.
//it willl cause compilation error if we try to access speed directly from an instance of Vehicle in a different package.