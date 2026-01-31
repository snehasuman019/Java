// package Day 07;
// 3,4,6,4,6
//you are given with an array that keeps track of your monthly expenses you have to find the total expenses spend between l to r days


public class ExpenseTracker {
    public static void main(String[] args){
        int[] arr = {3,4,6,4,6};
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i =1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int l = 2, r=4;
        int total = prefix[r]-(1>0?prefix[l-1] : 0);
        System.out.println("Total expenses from day" + l + " to " + r + " = " + total);
    }
    
    
}

/* /
package Day07;

public class ExpenseTracker {
    public static void main(String[] args){
        int[] arr = {3,4,6,4,6};
        int n = arr.length;

        // Step 1: Build prefix sum
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Step 2: Define query range (0-based indexing)
        int l = 2, r = 4; // days 2 to 4 (inclusive)

        // Step 3: Compute sum between l and r
        int total = prefix[r] - (l > 0 ? prefix[l-1] : 0);

        // Step 4: Print result
        System.out.println("Total expenses from day " + l + " to " + r + " = " + total);
    }
}
*/