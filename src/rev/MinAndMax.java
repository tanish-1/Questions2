package rev;

public class MinAndMax {
    static int minFunc(int min , int[] arr){
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3, 14, 28};
        System.out.println(minFunc(Integer.MAX_VALUE,arr));
    }
}
