package recursion_rev;

public class MaxConsective {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int count = 0, max = 0;
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 1) {
                count++;  max = Math.max(max,count);
            }
            if(nums[i] != 1) count = 0;
        }
        System.out.println(max);
    }
}
