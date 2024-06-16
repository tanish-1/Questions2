package rev.recursion_rev;

public class Recursion {
    static int recursive(int n){
        if(n<2){
            return n;
        }

      return recursive(n-1) + recursive(n-2);
    }

    public static void main(String[] args) {
        System.out.println(recursive(50));
    }
}
