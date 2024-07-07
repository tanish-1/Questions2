package rev;

import java.util.Arrays;

public class ReverseString {
    static void reverseString(char[] arr,int l , int h){
      char[] res = new char[arr.length];
      int mid = (l+h)/2;
        for (int i = 0; i <=mid; i++) {
            res[arr.length -1 - i] = arr[i];
            res[i] = arr[arr.length-1 - i];
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        char[] arr  = {'H','a','n','n','a','h'};
        reverseString(arr,0,arr.length-1);
    }
}
