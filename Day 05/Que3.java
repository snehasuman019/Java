// 3. A mall record customer entries every hour . you are given an array where each element represents customers entering in that hour . find the maximum customer in k consecutive hours.
//  input : arr = [2,1,5,1,3,2]      k=3              possible output = 9


/* /
// brute force approach
import java.util.*;
public class Que3 {
    public static void main(String[] args){
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<=arr.length - k;i++){
            int sum = 0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println("Maximum customers in "+ k + " consecutive hours is : "+ max);
    }
}
    */

// Sliding window approach
import java.util.*;
public class Que3 {
    public static void main(String[] args){
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        int Sum = 0;
        for(int i = 0; i < k; i++){
            Sum += arr[i];
        }
        max = Sum;
        for(int i = k; i < arr.length; i++){
            Sum += arr[i] - arr[i - k];
            max = Math.max(max, Sum);
        }
        
        System.out.println("Maximum customers in "+ k + " consecutive hours is : "+ max);
    }
}
