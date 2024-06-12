package rev;

public class FindTheDifference {
    static char findDifference(String s, String t){
        for (int i = 0 ; i<s.length()  ; i++){
            if(s.charAt(i)!=t.charAt(i)){
                return t.charAt(i);
            } else {
                return s.charAt(i);
            }
        }
        if (t.length() > s.length()) {
            return t.charAt(t.length() - 1);
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(findDifference("","y"));
    }
}
