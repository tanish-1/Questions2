package Recursion_ques;

public class Subsets {
    public  static  void SubFunc(String str , String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        if(str.charAt(0) == 'a'){
            SubFunc(str.substring(1),res);
        } else {
        SubFunc(str.substring(1),res+str.charAt(0));
        }
    }
    public  static  void SubFunc2(String str , String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        if(str.startsWith("apple")){
            SubFunc2(str.substring(5),res);
        } else {
        SubFunc2(str.substring(1),res+str.charAt(0));
        }
    }
    public static void main(String[] args) {
        String str = "bacapplecad";
        String res = "";
        SubFunc(str, res);
        SubFunc2(str, res);
    }
}
