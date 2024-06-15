package rev;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    static List<String> readBinaryWatch(int turnedOn){
        List<String> li = new ArrayList<>();
        for(int hour = 0 ; hour<12 ; hour++){
            for(int minutes = 0 ; minutes<60 ; minutes++){
                if(Integer.bitCount(hour) + Integer.bitCount(minutes) == turnedOn){
                    if(minutes<10){
                        li.add(String.format("%d:0%d",hour,minutes));
                    } else{
                        li.add(String.format("%d:%d",hour,minutes));
                    }
                }
            }
        }
        return li;
    }
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
        System.out.println((int)Math.pow(2,2));
    }
}
