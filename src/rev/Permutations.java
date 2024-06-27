package rev;

import java.util.ArrayList;
import java.util.Collections;

public class Permutations {
    static int permutationCount(String str , String res){
        if(str.isEmpty()){
            return 1;
        }
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0,i);
            String s = res.substring(i, res.length());
          count = count + permutationCount(str.substring(1),  f + ch + s);
        }
        return count;
    }
    static ArrayList<String> permutation(String str , String res){
        if(str.isEmpty()){
//            System.out.println(res);
            ArrayList<String> li = new ArrayList<>();
            li.add(res);
             return li;
        }
        char ch = str.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0,i);
            String s = res.substring(i, res.length());
          ans.addAll(permutation(str.substring(1),  f + ch + s));

        }
//        Collections.sort(ans);
        return ans;
    }
//    static void permutation(String str , String res){
//        if(str.isEmpty()){
//            System.out.println(res);
//            return;
//        }
//        char ch = str.charAt(0);
//        for (int i = 0; i <= res.length(); i++) {
//            String f = res.substring(0,i);
//            String s = res.substring(i, res.length());
//            permutation(str.substring(1),  f + ch + s);
//        }
//    }
    public static void main(String[] args) {
        System.out.println(permutation("abc",""));
        System.out.println(permutationCount("abc",""));
    }
}
