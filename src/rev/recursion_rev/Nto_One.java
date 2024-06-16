package rev.recursion_rev;

public class Nto_One {
    static int decreseFunc(int n){
        if(n<=1){
            return 1;
        }
       return n * decreseFunc(n-1);

    }
    public static void main(String[] args) {
        System.out.println(decreseFunc(5));
    }
}
