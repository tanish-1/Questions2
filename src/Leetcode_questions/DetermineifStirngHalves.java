package Leetcode_questions;

public class DetermineifStirngHalves {
    public static void main(String[] args) {
        String s = "textbook";
        char[] arr = s.toCharArray();
        int i = 0 , j = arr.length-1;
        int count1 = 0 , count2 = 0;
        while (i<=j){
            if(arr[i]=='a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] =='o' || arr[i] == 'u' || arr[i]=='A'||  arr[i] == 'E' || arr[i] == 'I' || arr[i] =='O' || arr[i] == 'U' ){
                count1++;
            }
            if(arr[j]=='a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] =='o' || arr[j] == 'u'||arr[j]=='A'||  arr[j] == 'E' || arr[j] == 'I' || arr[j] =='O' || arr[j] == 'U'){
                count2++;
            }
            i++;
            j--;
        }
        if(count1 == count2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
