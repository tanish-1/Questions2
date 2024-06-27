package rev;

public class LetterCombination {
    static void letterComb(String str , String res){
        if(str.isEmpty()){
            System.out.print(res+" ");
            return;
        }
//        char ch = str.charAt(0);
        int num = str.charAt(0) - '0';
//        int num = Integer.parseInt(String.valueOf(ch));
        int start = (num-2)*3;
        int end = start+3;
        for (int i = start; i < end; i++) {

            letterComb(str.substring(1),res+(char)('a'+i));

        }

    }
    public static void main(String[] args) {
        System.out.println((char)('a'+24));
//        System.out.println(letterComb("12",""));
       letterComb("8","");
    }
}
