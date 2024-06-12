package recursion_rev;

public class RichestCustomer {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        sentence.indexOf()
        int[][] nums = {
                {1,5},
                {3,2,1},
        };
        int sum = 0,max =0;
        for(int row = 0 ; row<nums.length ; row++){
            for (int col = 0 ; col<nums[0].length ; col++){
                sum+=nums[row][col];
                max = Math.max(max,sum);
            }
            sum = 0;
        }
        System.out.println(max);
    }
}
