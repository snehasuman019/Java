// package Day 07;
// You are given with an array and find the longest strech with equal zeroes and ones. 
//    arr = {0,1,0,1,1,0}                      Output=Length of the longest subarray

import java.util.*;
public class Que3 {
    public int findMaxLength(int[] nums) {
        int prefSum=0, ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();     
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            prefSum += nums[i] == 1 ? 1: -1;
        if (map.containsKey(prefSum)) { ans = Math.max(ans, i - map.get(prefSum));
        } else { map.put(prefSum, i);
        }
        }
        return ans;
    }
     public static void main(String[] args){
        int[] arr = {0,1,0,1,1,0};       
        Que3 obj = new Que3();
        System.out.println(obj.findMaxLength(arr)); 
    }

    
}

