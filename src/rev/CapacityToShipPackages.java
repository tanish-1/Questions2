package rev;

public class CapacityToShipPackages {
    static int maxfunc(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(max , value);
        }
        return max;
    }
    static int sumfunc(int[] arr){
        int sum = 0;
        for (int value : arr) {
           sum +=value;
        }
        return sum;
    }
    static boolean helper(int[] arr , int capacity , int days){
        int loads = 0;
        int adj = 1;
        for (int i = 0; i < arr.length; i++) {
            if(loads+arr[i]<=capacity){
                loads += arr[i];
            } else {
                adj++;
                loads = arr[i];

            }
        }
        if(adj<=days){
            return true;
        }
       return false;
    }
    static int shipWithinDays(int[] weights, int days){
        int l = maxfunc(weights);
        int h = sumfunc(weights);
        while (l<=h){
            int mid = l + (h-l)/2;

            if(helper(weights,mid,days)){
                h = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
