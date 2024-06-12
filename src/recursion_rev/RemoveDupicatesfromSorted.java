package recursion_rev;

public class RemoveDupicatesfromSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int j = 0;
       for(int i = 1 ; i<nums.length; i++){
           if(nums[j] != nums[i]){
               nums[j+1]= nums[i];
               j++;
           }
       }
        System.out.println(j+1);
    }
}
