package recursion_rev;

import java.util.Scanner;

public class CountZeros {
    static int func(int num,int count){
        if (num == 0) return count;

        int rem = num%10;
        if(rem == 0) count++;

        return func(num/10,count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n,0));
    }
}
