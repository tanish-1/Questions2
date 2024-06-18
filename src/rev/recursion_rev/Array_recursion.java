package rev.recursion_rev;

public class Array_recursion {
    static boolean checkArray(int[] arr , int indx){
        if(indx == arr.length-1){
            return true;
        }
        return (arr[indx]<arr[indx+1]) && checkArray(arr, indx+1);
    }
    public static void main(String[] args) {
        System.out.println(checkArray(new int[]{2,3,4,5,6},0));
    }
}
