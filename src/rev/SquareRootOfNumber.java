package rev;

public class SquareRootOfNumber {
    static long floorSqrt(long x){
        long l = 1;
        long h = x;
        while (l<=h){
            long mid = l + (h-l)/2;
            if(mid*mid>x){
                h = mid -1;
            } else {
                l = mid + 1;
            }
        }
          return h;
    }
    public static void main(String[] args) {
        System.out.println(floorSqrt(4L));
    }
}
