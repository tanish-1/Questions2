package rev;

public class FindNumbersWithEven {
//    static  boolean countFunc(int count , int val){
//        while (val>0){
//            count++;
//            val/=10;
//        }
//
//       return (count%2==0);
//    }
    static  boolean countFunc(int val){
       return ((int)(Math.log10(val)+1)%2==0);
    }
    static int search(int[] arr){
        int evenNumber =0;
        for(int i = 0 ; i<arr.length ; i++){
            if(countFunc(arr[i])) evenNumber++;
        }
        return evenNumber;

    }
    public static void main(String[] args) {
        int[] nums = {12, 345 , 2, 7896};
        System.out.println(search(nums));
        System.out.println((int)(Math.log10(12)+1));
//        System.out.println(12%10);
//        System.out.println(6>>2);
    }
}
