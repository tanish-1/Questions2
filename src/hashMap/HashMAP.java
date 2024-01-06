package hashMap;

import java.util.HashMap;

public class HashMAP {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Man",2);
        map.put("abc",4);
        System.out.println(map+", "+map.size());
        for(String value : map.keySet()){
            System.out.println(map.get(value));
        }

    }
}
