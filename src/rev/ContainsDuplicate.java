package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContainsDuplicate {
    static void swap(int first , int second , int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        List<Integer> li = new ArrayList<>();
        while (i < arr.length) {
            int correctindx = arr[i] - 1;
            if (arr[correctindx] != arr[i]) {
                swap(correctindx, i, arr);
            } else {
                i++;
            }
        }

        int indx = 0;
        while (indx< arr.length){
            int correctindx = indx + 1;
            if(correctindx!=arr[indx]){
                li.add(arr[indx]);
                indx++;
            } else {
                indx++;
            }
        }
        Collections.sort(li);
        return li;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }
}
