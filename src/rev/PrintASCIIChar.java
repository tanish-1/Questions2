package rev;

public class PrintASCIIChar {
    static void asciifunc(String str , String res){
        if (str.isEmpty()){
            System.out.print(res+" ");
           return;
        }
        char ch = str.charAt(0);
        asciifunc(str.substring(1), res+ch);
        asciifunc(str.substring(1), res);
        asciifunc(str.substring(1), res+(ch+0));

    }
    public static void main(String[] args) {
      asciifunc("abc","");
    }
}
