package rev;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        int[] arr = new int[n+1];
        for(int i = 0 ; i<=n ; i++){
            int value = i;
            while(value>0){
                if((value & 1) == 1){
                    count++;

                }
                value>>=1;
            }
            arr[i] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
