package recursion_rev;

import java.util.Scanner;

public class NtoOne {
     static int sum = 0;
     static void func(int num){
        if(num == 0){
            return;
        }
        int rem = num%10;
        sum = sum*10 + rem;
         func(num/10);

    }
    static boolean palinFunc(int num){
           func(num);
           return num == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//       func(n);
        System.out.println(palinFunc(345));
//        System.out.println(sum);
    }
}
