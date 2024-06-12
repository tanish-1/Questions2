package recursion_rev;

public class SecondLAndS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int max =  Integer.MIN_VALUE;;
        int secmax = Integer.MIN_VALUE;
        int small =  Integer.MAX_VALUE;;
        int secsmall = Integer.MAX_VALUE;
        for(int i =0 ; i<n ;i++){
//            second-max
            if(max<arr[i]){
                secmax = max;
                max = arr[i];
            } else if (secmax<arr[i] && max>arr[i]) secmax = arr[i];
            // second-less
            if(small>arr[i]) {
                secsmall = small;
                small = arr[i];
            } else if (secsmall>arr[i] && arr[i]>small) {
                secsmall = arr[i];

            }
        }
//        System.out.println(max);
        System.out.println(secmax);
//        System.out.println(small);
        System.out.println(secsmall);
    }
}
