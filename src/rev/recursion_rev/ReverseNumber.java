package rev.recursion_rev;

public class ReverseNumber {
    static int reverseFunc(int num , int pow){
        if(pow <= 0 && num<=0){
            return 0;
        }
       return num%10*(int)Math.pow(10,pow) + reverseFunc(num/10,pow-1);
    }
    public static void main(String[] args) {
        int num = 111;
        int pow = ((int)Math.log10(num) + 1 )-1;
//        System.out.println(pow);
      int rev = reverseFunc(num,pow);
//       boolean res = (num == rev) ? true : false;
       boolean res = (num == rev);
        System.out.println(res);
    }
}
