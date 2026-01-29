// package Day 06;
// You have to remove duplicates from a sorted array . try to write an algo that maintain its stability . \
//    Input : [1,1,2,2,3]  Output:[1,2,3]

import java.util.*;
public class Que1 {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3};
        int n = arr.length;
        int index =1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =1;i<n;i++){
            if(arr[i] != arr[i-1]){
                result.add(arr[i-1]);
                index++;
            }

        }
        result.add(arr[n-1]);
        System.out.println("Array after removing duplicates: " + result);
        
    }
}
