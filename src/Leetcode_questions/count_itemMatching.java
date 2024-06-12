package Leetcode_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class count_itemMatching {
    public static void main(String[] args) {
//        String[][] items = {
//                {"phone","blue","pixel"},
//                {"computer","silver","phone"},
//                {"phone","gold","iphone"}
//        };
        List<List<String>> li = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "type", ruleValue = "phone";
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for (int i = 0; i < li.size(); i++) {
            if (ruleValue.equals(li.get(i).get(index))) {
                System.out.println("found");
                count++;
            }
        }
        System.out.println(count);
    }
}
