package Leetcode_questions;

public class checkIfTwoStringArrays {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        String tword1= "";
        String tword2 = "";
        for(int i = 0 ; i<word1.length ; i++){
            tword1+=word1[i];
        }
        for(int j = 0 ; j<word2.length ; j++){
            tword2+=word2[j];
        }
        if(tword1.equals(tword2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
