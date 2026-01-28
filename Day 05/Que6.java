//  You have power ratings , find the smallest subarray whose sum is greater than equal to target. 
//   Input : arr [2,3,1,2,4,3]          target : k = 7 
//   Output: 2(length of subarray)

import java.util.*;
public class Que6 {
    public static void main(String[] args){
        int[] arr = {2,3,1,2,4,3};
        int s = 7;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
            while(sum >= s){
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            System.out.println("No subarray found");
        } else {
            System.out.println("Smallest subarray length is : " + minLen);
        }
    }
}
