
// s = abbabadcbba
// p = abc

import java.util.*;
public class substr {
    public static void main(String[] args){
        String s = "abbabadcbba";
        String p = "abc";
        int n = s.length();
        int m = p.length();
        int[] freq = new int[128];
        for(char c : p.toCharArray()){
            freq[c]++;

        }
        int count = m, l = 0, start = 0, min = Integer.MAX_VALUE;
        for(int r = 0;r<n;r++){
            char rightChar = s.charAt(r);
            if(freq[s.charAt(r)]>0){
                count--;
            }
            while(count==0){
                if(r-l+1 <= min){
                    min = r - l + 1;
                    start = l;
                }
                if(++freq[s.charAt(l++)]>0){
                    count++;
                }

            }

        }
        if(min==Integer.MAX_VALUE){
            System.out.println("No substring found");
        }else{
            System.out.println(s.substring(start, start + min));
        }

    }
}
