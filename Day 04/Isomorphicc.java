// package Day 04;

// isomorphic strings 
import java.util.*;

public class Isomorphicc {
    
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mapST.containsKey(c1)){
                if(mapST.get(c1) != c2)return false;

            }else{
                mapST.put(c1,c2);
            }
            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2) != c1)return false;

            }else{
                mapTS.put(c2,c1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Isomorphicc solver = new Isomorphicc();
        
        // Test cases
        System.out.println("egg & add: " + solver.isIsomorphic("egg", "add"));     // true
        System.out.println("foo & bar: " + solver.isIsomorphic("foo", "bar"));     // false
        System.out.println("paper & title: " + solver.isIsomorphic("paper", "title")); // true
    }
}