package Leetcode_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Defanging_anIP {
    public static void main(String[] args) {
        String add = "1.1.1.1";
        String res = "";
        for(int i = 0 ; i<add.length() ; i++){
            if(add.charAt(i)=='.'){
               res = add.replace(".","[.]");
            }
        }
        System.out.println(res);
    }
}
