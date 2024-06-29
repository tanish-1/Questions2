package rev;

public class LongestSubArray {
    static int lenOfLongSubarr(int[] arr , int k){
        int i = 0;
        int j =0;
        int sum = 0;
        int max = 0;
        int len;
        int n = arr.length;
        while (j<n){
            sum += arr[j];
            if (sum<k){
                j++;
            } else if (sum>k) {
                while (sum>k && i<j){
                    sum = sum - arr[i];
                    i++;
                }
            } else {
                len = j-i+1;
                max = Math.max(max,len);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 6, 2, 7, 1, 9};
        int k = 15;
        System.out.println(lenOfLongSubarr(arr,k));
    }
}
