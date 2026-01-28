
// wap to count vowels and consonants in a given string. string might contain numbers, characters special characters and spaces . for ex : email id ->

public class vowels {
    public static void main(String[] args){
        String s = "snehasuman019@gmail.com";
        int vCount = 0;
        int cCount = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch)!=-1){
                    vCount++;
                }else{
                    cCount++;
                }

            }

        }
        System.out.println("Vowels: " + vCount);
        System.out.println("Consonants: " + cCount);

    }   
}
