/*
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("eating...");
    }
}
class Bird extends Animal{
    void sound(){                         //if we write abstract class Bird exten...... we dont need to write these.
        System.out.println("Chirping....");
    }
}
public class ExamAbs{
    public static void main(String[] args){
        Animal a = new Bird();             //because we have to store reference 
        a.sound();
    }
}
    */


abstract class Cars{
    abstract void model();
    abstract void color();
}
class ModelName extends Cars{
    void model(){                        
        System.out.println("Mustang....");
    }
    void color(){
        System.out.println("Black");
    }
}
public class ExamAbs{
    public static void main(String[] args){
        Cars ca = new ModelName();             
        ca.model();
        ca.color();
    }
}