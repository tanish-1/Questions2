package Recursion_ques;

public class Nto1 {
    public  static void func(int sum ,int n){
        if(n==0){
            return;
        }
        System.out.println(sum+=n);
          func(sum,n-1);
    }
    public static void main(String[] args) {

      func(0,5);
    }
}
