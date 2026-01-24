interface A{
    void methodA();

}

class C implements A{
    public void methodA(){
        System.out.println("Implementation of methodA from interface A");
    }
    
}
public class ExInter {
    public static void main(String[] args) {
        C c= new C();
        c.methodA();
        
    }
}
