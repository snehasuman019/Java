
/* /
public class feloop {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
*/
// for - each loop
// finding maximum in an array using for each loop
/* /
import java.util.*;
public class feloop {
    public static void main(String[] args){ 
        int[] marks = {123,23,42,53,56};
        int max = findMax(marks);
        System.out.println(max);
    }
    static int findMax(int[] arr){
        int maximum = arr[0];

        for(int value : arr){
            if(value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }
}
    */

// Iterating in a list using for-each loop
import java.util.*;
public class feloop {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Shyam");
        students.add("Mohan");
        students.add("Sohan");

        int max = Integer.MIN_VALUE;
        for(String name : students){
            // if(String > max){
            //     max = String ;
            // }

        }
        System.out.println("List of Integers: "+ students);
        System.out.println("Maximum element : "+ max);
    }
}