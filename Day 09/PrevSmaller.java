import java.util.*;

public class PrevSmaller {
    static int[] nextSmallerUsingstack(int[] arr){
        int n =  arr.length;
        int[] res = new int[n];

        Stack <Integer> st = new Stack<>();
        for(int i=0; i<=n-1;i++){
            while(!st.isEmpty() && st.peek() >=arr[i]){
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
        int[] res = nextSmallerUsingstack(arr);

        for(int i=0 ;i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }    
}
