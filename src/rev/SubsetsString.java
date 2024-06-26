package rev;

import java.util.ArrayList;

public class SubsetsString {
//    static ArrayList<String> subsetFunc(String str, String res,ArrayList<String> li){
//        if(str.isEmpty()){
////            System.out.print(res+" ");
//            li.add(res);
//            return li;
//        }
//        char ch = str.charAt(0);
//          subsetFunc(str.substring(1), res+ch,li);
//       subsetFunc(str.substring(1), res,li);
//       return li;
//    }
    static ArrayList<String> subsetFunc(String str, String res){
        if(str.isEmpty()){
//            System.out.print(res+" ");
            ArrayList<String> li = new ArrayList<>();
            li.add(res);
            return li;
        }
        char ch = str.charAt(0);
        ArrayList<String> left  = subsetFunc(str.substring(1), res+ch);
        ArrayList<String> right =  subsetFunc(str.substring(1), res);
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
//        System.out.println(subsetFunc("abc",""));
        System.out.println(subsetFunc("abc",""));
    }
}
