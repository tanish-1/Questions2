package rev.Bitwise;

import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
       for (int val : map.keySet()){
           if(map.get(val) == 1){
               System.out.println(val);
           }
       }
       // second type
       int unique = 0;
        for(int value : arr){
           unique ^= value;
        }
        System.out.println(unique);
        System.out.println(~3+1);
        int n = 7;
        int bit = 0;
        while (n>0){
            if((n&1) == 1){
                bit++;
                System.out.println(n);
            }
            n>>=1;
        }
        System.out.println(bit);
    }
}
