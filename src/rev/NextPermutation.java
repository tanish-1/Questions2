package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    static ArrayList<String> nextpermuationFunc(String arr , String res,ArrayList<String> li){
        if(arr.isEmpty()){
            li.add(res);
            return li;
        }
        char ch = arr.charAt(0);
        for (int i = 0; i <= res.length(); i++) {
               String s = res.substring(0,i);
               String e = res.substring(i,res.length());
               nextpermuationFunc(arr.substring(1),s+ch+e,li);

        }
        Collections.sort(li);
        return li;
    }
    public static void main(String[] args) {
    String arr = "2275431";
        System.out.println(nextpermuationFunc(arr,"",new ArrayList<>()));
//int[] nums = {2,2,7,5,4,3,2,2,1};
//        StringBuilder sb = new StringBuilder();
//        for (int num : nums) {
//            sb.append(num);
//        }
//        String result = sb.toString();
//      ArrayList<String> li = nextpermuationFunc(result,"",new ArrayList<>());
//        String nextPermutation;
//
//        for (int i = 0; i < li.size() ; i++) {
//            if(result.equals(li.get(i))){
//                nextPermutation = li.get((i+1)% li.size());
//                int[] intArray = new int[nextPermutation.length()];
//                for (int j = 0; j < nextPermutation.length(); j++) {
//                    intArray[j] = Character.getNumericValue(nextPermutation.charAt(j));
//                    nums[j] = intArray[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
    }
}
