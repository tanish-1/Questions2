package Leetcode_questions;

public class Goal_ParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<command.length() ; i++){
            if(command.charAt(i)=='(' && command.charAt(i + 1) == ')'){
                res.append("o");
                i++;
            } else if (command.charAt(i)=='G') {
                res.append("G");
            } else {
            res.append("al");
                i+=3;

            }
        }
       String str = new String(res);
        System.out.println(str);
        System.out.println(command.substring(1));
    }
}
