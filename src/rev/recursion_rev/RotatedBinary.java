package rev.recursion_rev;

public class RotatedBinary {
    static int rotatedFuc(int[] arr , int target,int s , int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(arr[s] <= target && arr[mid] >= target){

               return rotatedFuc(arr, target, s, mid-1);
            } else {
                return rotatedFuc(arr, target, mid+1, e);
            }
        } else {
            if(arr[mid] <= target && arr[e] >= target){
               return rotatedFuc(arr, target, mid+1, e);
            } else {
                return rotatedFuc(arr, target, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedFuc(arr,7,0,arr.length-1));
    }
}
