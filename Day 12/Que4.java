// 4. You are given an array of size n+1 . numbers are from 1 to n only one number repeates. you cannot sort, modify and use any extra spaces there;

import java.util.*;
public class Que4 {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

        }while(slow!=fast);
        slow = arr[0];
        while(slow!=fast){
            if(arr[slow]==arr[fast]){
                System.out.println(fast);
                return;
            }
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println(slow);


        
    }
}





