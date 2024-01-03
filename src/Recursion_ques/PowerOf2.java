package Recursion_ques;

public class PowerOf2 {
    public static  boolean Bfunc(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0 || n<=0){
            return false;
        }
        return Bfunc(n/2);

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Bfunc(n));
        System.out.println(3/2);
    }
}
