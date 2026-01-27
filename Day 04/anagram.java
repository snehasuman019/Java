


//Anagram: Check if two strings are anagrams of each other

import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String q = sc.nextLine();

        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char ch : p.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for(char ch : q.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);

        for(var pair : charCount.entrySet()){
            if(pair.getValue() != 0){
                System.out.println("Not an Anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
    

}
    

