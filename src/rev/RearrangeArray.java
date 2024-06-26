package rev;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    static int[] rearrangeArray(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neq = new ArrayList<>();
        for (int i = 0 ; i< arr.length ; i++){
            if(arr[i]<0){
                neq.add(arr[i]);
            }else {
                pos.add(arr[i]);
            }
        }
      int indx = 0;
       int indx2 = 0;
       int[] res = new int[arr.length];

       for (int j = 0 ; j< res.length ; j=j+2){
           res[j] = pos.get(indx++);
           res[j+1] = neq.get(indx2++);
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
