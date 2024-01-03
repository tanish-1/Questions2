package Recursion_ques;

import java.util.ArrayList;

public class SubsetStrings {
    public  static  void  func(String str , String op){
        if(str.isEmpty()){
            System.out.print(op+" ");
            return;
        }
        func(str.substring(1),op+str.charAt(0));
        func(str.substring(1),op);
    }
    public  static ArrayList<String> funcA(String str , String op){
        ArrayList<String> li = new ArrayList<>();
        if(str.isEmpty()){
//            System.out.print(op+" ");
            li.add(op);
            return li;
        }
        li.addAll(funcA(str.substring(1),op+str.charAt(0)));
        li.addAll(funcA(str.substring(1),op));
        li.addAll(funcA(str.substring(1),op+(str.charAt(0)+0)));
        return li;
    }
    public static void main(String[] args) {
//        func("abc","");
        System.out.println(funcA("abc",""));

    }
}
