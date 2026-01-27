// package Day 04;

public class reverses {
    static String reverseString(String s){
        StringBuilder res = new StringBuilder();
        for(int i=s.length() -1; i>=0;i--){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args){
        String s = "ypeelSgnileeF";
        String res = reverseString(s);
        System.out.println(res);
    }
}
