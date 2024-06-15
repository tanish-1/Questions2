package rev;

public class HammingDistance {
    static int hammingDistance(int x , int y){
        int count = 0;
        while (x>0 || y>0){
            if((x&1) == 1 && (y&1) == 1){
                x>>=1;
                y>>=1;
                continue;
            } else if ((x&1) == 0 && (y&1) == 0) {
                x>>=1;
                y>>=1;
                continue;
            } else {
                count++;
            }
            x>>=1;
            y>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
}
