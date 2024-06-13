package rev.Bitwise;

public class Random {
    public static void main(String[] args) {
        int a = 3;
        if((a&1) == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
