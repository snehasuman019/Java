// package Day 10;

import java.util.*;
public class Decoded {
    public static void main(String[] args) {
        // String s = "3[a2[c]]";
        String s = "12[a2[c]]";
        String currstr = "";
        int currnum = 0;
        Deque<Integer> num = new ArrayDeque<>();
        Deque<String> str = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c))
                // for 2 digit
                currnum = currnum *10+(c-'0');
                // currnum = c - '0'; //3
            else if(c=='['){
                num.push(currnum);
                str.push(currstr);
                currnum = 0;
                currstr = "";
            }
            else if(c==']'){
                String prev = str.pop();
                int repeat = num.pop();
                StringBuilder sb = new StringBuilder(prev);
                for(int i =1;i<=repeat;i++){
                    sb.append(currstr);

                }
                currstr = sb.toString();
            }else{
            currstr += c;
            }
        }
        System.out.println(currstr);;
    }
}
