// package Day 13;
// import java.util.*;
// public class KokoEatingBananagfg {
//     public static void main(String[] args){
        
//     }
// }


import java.util.*;
class KokoEatingBananagfg {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low=1, high = Arrays.stream(arr).max().getAsInt();
        int ans = high;
        while(low<=high){
            int mid = low+ (high-low) /2;
            long hours = 0;
            for(int bananas : arr){
                hours += (bananas + mid - 1)/mid;
                
            }
            if(hours <= k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr1 = {5,10,3};
        int k1=4;
        System.out.println(sol.kokoEat(arr1, k1));
        int[] arr2 = {5,10,15,20};
        int k2=7;
        System.out.println(sol.kokoEat(arr2, k2));
    }
}
