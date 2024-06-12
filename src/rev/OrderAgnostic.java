package rev;

public class OrderAgnostic {
    static boolean binary(int[] arr , int val){
        int s = 0;
        int e = arr.length-1;
        boolean isAsc = arr[s]<arr[e];

        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == val) {
                return true;
            }
                if(isAsc){
                    if (arr[mid] > val ) {
                        e = mid -1;
                    } else {
                        s = mid + 1;
                    }
                } else {
                     if (arr[mid] < val ) {
                        e = mid -1;
                    } else {
                        s = mid + 1;
                    }
                }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {12,10,9,8,6,3,2};
        System.out.println(binary(arr,10));
    }
}
