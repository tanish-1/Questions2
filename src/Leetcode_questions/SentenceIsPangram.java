package Leetcode_questions;
import java.util.*;

public class SentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "aleetcode";

       for(char i = 'a' ; i<='z'; i++){
           if(sentence.indexOf(i) == -1){
               System.out.println("false");
               return;

           }
        }
        System.out.println(true);
    }
}
