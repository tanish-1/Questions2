package rev;
import java.math.BigInteger;

public class AddBinary {
    static String addBinary(String x , String y){
        int i = x.length() - 1;
        int j = y.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i>= 0 || j>= 0){
           int sum = carry;
            if(i>= 0){
                sum+= x.charAt(i)-'0';
            }
            if(j>=0){
                sum+= y.charAt(j)-'0';
            }
            if(sum == 0 || sum == 1){
                res.append(sum);
                carry = 0;
            } else if (sum == 2) {
                res.append("0");
                carry = 1;
            } else {
                res.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if(carry == 1){
            res.append("1");
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));

    }
    }

