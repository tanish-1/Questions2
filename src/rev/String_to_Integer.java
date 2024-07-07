package rev;

public class String_to_Integer {
    static int myAtoi(String s,int ans){
        s = s.trim();
        if (s.isEmpty() || (s.charAt(0) >= 'a' && s.charAt(0)<='z')){
            return ans;
        }

        if (s.charAt(0) == '-'){
           return -myAtoi(s.substring(1), 0);
        }

         if (!Character.isDigit(s.charAt(1))) {
            return 0;
        }

        int num = s.charAt(0) - '0';

           return  myAtoi(s.substring(1),ans*10+num);

    }
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s,0));
    }
}
