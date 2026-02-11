// Find the next greater element for each element in an array 
// example : 4, 5, 2, 10  Output : 5, 10, 10, -1 
import java.util.*;
public class NextGreater {
    
    static int[] nextGreaterUsingstack(int[] arr){
        int n =  arr.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
        
    }
    public static void main(String args[]){
        int[] arr = {4,5,2,10};
        int[] res = nextGreaterUsingstack(arr);

        for(int i=0 ;i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }    
}
