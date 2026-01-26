// arrays in java
// arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
/* 
public class arr {
    public static void main(String[] args){
        //initializiation
        int[] arr = {40,55,63,17,22};
        //size
        //changing thr element 
        arr[2]=99;

        int n = arr.length;
        for (int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}
*/

public class arr{
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i = 0; i<arr.length;i++){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
     }
}