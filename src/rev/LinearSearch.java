package rev;

public class LinearSearch {
    static int searchfunc(int val , int[] arr){
        if(arr.length == 0) return -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1};
        int n = arr.length;
        System.out.println("found at : " + searchfunc(7,arr));
    }
}
