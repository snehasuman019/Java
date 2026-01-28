
// 8. Find the number of subarray whose sum is exactly k .
//   Input : arr = [ 1,1,1]            k = 3
//   Output : 


import java.util.*;
public class Que8 {
    public static void main(String[] args){
        int[] arr ={1,1,1};
        int k = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int num:arr){
            sum+= num;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        System.out.println("Number of subarrays with sum exactly "+ k + " is : "+ count);
    }
}
