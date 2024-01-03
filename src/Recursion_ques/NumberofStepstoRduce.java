package Recursion_ques;

public class NumberofStepstoRduce {
    public static int func(int n,int count){

        if(n==0){
            return count;
        }
        if(n%2 == 0){
        count =   func(n/2,count+=1);
        } else {
            n--;
         count =   func(n,count+=1);
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(func(n,0));
    }
}
