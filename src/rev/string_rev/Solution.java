package rev.string_rev;

import java.util.Arrays;

class Solution {
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for(int i = 0 ; i<indices.length ; i++){
            arr[indices[i]] = s.charAt(i);
        }
        String str = new String(arr);
        return str;
    }

    public static void main(String[] args) {
        System.out.println( restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }
}