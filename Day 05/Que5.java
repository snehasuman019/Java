// // 
// 5. A factory tracks energy usage per hour . find the minimum sum of any k continuous hours 
//   input : arr = {10,20,30,40,50}      k = 2

import java.util.*;
public class Que5 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int k = 2;
        // int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i< k ;i++){
            sum += arr[i];
            // int sum = 0;
            
        }
        int minSum = sum;
        for(int i = k;i<arr.length;i++){
            sum = sum+arr[i] - arr[i-k];
            minSum = Math.min(minSum,sum);
        }
        System.out.println("Minimum sum of any "+ k + " continuous hours is : "+ minSum);
    }
}
