package Leetcode_questions;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        String res = "";
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)>='A' || s.charAt(i)<='Z'){
                res+=String.valueOf(s.charAt(i)).toLowerCase();
            } else {
                res+=String.valueOf(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
