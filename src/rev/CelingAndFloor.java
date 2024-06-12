package rev;

public class CelingAndFloor {
    static char ceilingfunc(char[] arr , char val){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]>val){
                h = mid -1;
            } else if(arr[mid]<val){
                l = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[l];
    }
    static char ceilingfunc2(char[] arr , char val){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]>val){
                h = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return arr[l%arr.length];
    }
    static int floorfunc(int[] arr , int val){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]>val){
                h = mid -1;
            } else if (arr[mid]<val) {
                l = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[h];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,16,18};
        char[] arr2 = {'x','x','y','y'};
        System.out.println(ceilingfunc2(arr2,'z'));
        System.out.println(floorfunc(arr,4));
    }
}
