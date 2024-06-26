package rev;

public class SkipCharacter {
//    static String skipfunc(String str){
//        if(str.isEmpty()){
//            return "";
//        }
//        char ch = str.charAt(0);
//        if(ch=='a'){
//            return skipfunc(str.substring(1));
//        } else {
//            return ch + skipfunc(str.substring(1));
//        }
//    }
//    static String skipfunc(String str){
//        if(str.isEmpty()){
//            return "";
//        }
////        char ch = str.charAt(0);
//        if(str.startsWith("app")){
//            return skipfunc(str.substring(5));
//        } else {
//            return str.charAt(0) + skipfunc(str.substring(1));
//        }
//    }
    static String skipfunc(String str){
        if(str.isEmpty()){
            return "";
        }
//        char ch = str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipfunc(str.substring(3));
        } else {
            return str.charAt(0) + skipfunc(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "bappleccappled";
        System.out.println(skipfunc(str));
    }
}
