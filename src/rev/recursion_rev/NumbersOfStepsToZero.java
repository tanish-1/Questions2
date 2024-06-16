package rev.recursion_rev;

public class NumbersOfStepsToZero {
    static int numberOfSteps(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
          return   numberOfSteps(num/2,count+1);
        }
        return numberOfSteps(num-1,count+1);
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14,0));
    }
}
