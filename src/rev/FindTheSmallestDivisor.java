package rev;

public class FindTheSmallestDivisor {
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
    static int helper(int[] arr , int mid ){
       int sum = 0;
       for (int value : arr){
           sum+=(int)Math.ceil((double) value/mid);
       }
       return sum;
    }
    static int smallestDivisor(int[] arr,int threshold){
       int l = 1;
       int h = maxfunc(arr);
       while (l<=h){
         int mid = l + (h-l)/2;
         if(helper(arr,mid)<=threshold){
             h = mid -1;
         } else {
             l = mid +1;
         }
       }
       return l;
    }
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{421212,10101,12121},1000000));
        System.out.println(Math.ceil((double) 2/6));
        System.out.println((int)Math.sqrt(4));
    }
}
