// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
class Main {
    public static void func(int[] nums, int n){
        int indx = 0;
        int[] arr = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] != 0){
                arr[indx++] = nums[i];
            }
        }
        for(int i = 0 ; i< arr.length ; i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();

        }
        func(arr,n);
    }
}