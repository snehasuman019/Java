// gfg allocate minimum page.

public class Que2 {
    static boolean isValid(int[] arr, int n, int k, int maxAllowedVal)
    {
        int subarrays = 1, elem = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > maxAllowedVal) return false;
    
            if(elem + arr[i] <= maxAllowedVal)
            {
                elem += arr[i];
            }
            else
            {
                subarrays++;
                elem = arr[i];
            }
        }

        return subarrays>k ? false : true;
    }
    static int findPages(int[]arr, int k) {
        if(k>arr.length)
        {
            return -1;
        }
    
        int sum = 0, ans = 0 ;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        int start = 0, end = sum, mid;
        while(start <= end)
        {
            
            mid = start + (end-start)/2;
    
            if(isValid(arr,arr.length,k,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
    
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {12,34,67,90};
        int m = 2;

        int res = findPages(arr, m);
        System.out.println(res);
    }
}