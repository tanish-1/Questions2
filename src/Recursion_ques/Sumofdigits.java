package Recursion_ques;

public class Sumofdigits {
    public  static  int Sumfunc(int n){
         if(n%10 == n){
             return n;
         }
         return  n%10*Sumfunc(n/10) ;
    }
    public static void main(String[] args) {
        System.out.println(Sumfunc(55));
        System.out.println(1/10);
    }
}
