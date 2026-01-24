// 
// create a student validation program in which marks must be between 0-100 considering encapsulation in mind.
class Validation{
    private int stu_marks;
    public int getStu_marks(){
        return this.stu_marks;
    }
    public void setStu_marks(int m){
        this.stu_marks = m;
    }
}

public class StudentValidation {
    public static void main(String[] args){
        int marks = 90;
        Validation v = new Validation();
        v.setStu_marks(marks);
        int stm = v.getStu_marks();
        System.out.println("Marks: " + stm);
    }
}
