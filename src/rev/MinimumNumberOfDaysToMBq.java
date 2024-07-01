package rev;

public class MinimumNumberOfDaysToMBq {
    static int maxfunc(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(max , value);
        }
        return max;
    }
    static int smallfunc(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            min = Math.min(min , value);
        }
        return min;
    }
    static boolean minDays2(int[] arr, int mid, int m , int k){
        int adj = 0;
        int bqc = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]<=mid){
                 adj++;
                 if (adj == k){
                     bqc++;
                     if (bqc == m){
                         return true;
                     }
                     adj = 0;
                 }
             } else {
                 adj = 0;
             }
        }
        return false;
    }


    static int minDays(int[] bloomDay , int m , int k){

        int l = smallfunc(bloomDay);
        int h = maxfunc(bloomDay);
        int maxRange = h;
        while (l<=h){
            int mid = l + (h-l)/2;
            if(minDays2(bloomDay,mid,m,k)){
                h = mid -1;
            } else {
                l = mid + 1;
            }
        }
        if(l>maxRange){
            return -1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3 , k = 2;
        System.out.println(minDays(bloomDay , m , k));
    }
}
