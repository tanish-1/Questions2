package rev;

public class ReverseBits {
    public static void main(String[] args) {
        int n =  43261596;
//        Integer.bitCount()
        int ans = 0;
        int i = 0;
        while (i<32){
          ans<<=1;
          ans = ans | (n&1);
          n>>=1;
          i++;
        }
        System.out.println(ans);
        System.out.println(0b01<<1);
    }
}
