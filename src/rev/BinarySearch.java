package rev;

public class BinarySearch {
    static boolean binary(int[] arr , int val){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == val){
                return true;
            } else if (arr[mid] > val ) {
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,10,12};
        System.out.println(binary(arr,10));
    }


}
