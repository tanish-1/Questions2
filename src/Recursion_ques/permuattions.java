package Recursion_ques;

public class permuattions {
    static  void  pFunc(String str , String op){
        if(str.isEmpty()){
            System.out.println(op);
            return;
        }
        for (int i = 0 ; i<=op.length() ; i++){
              String left = op.substring(0,i);
              String right = op.substring(i,op.length());
              pFunc(str.substring(1),left+str.charAt(0)+right);

        }

    }
    public static void main(String[] args) {
        pFunc("abc","");
        String  op = "abc";
        String ans = "a";
//        System.out.println(ans.substring(0,1)+op.charAt(1));
    }
}
