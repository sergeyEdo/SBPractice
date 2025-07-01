package util;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);

        System.out.println(myMap.toString());

        Map<Integer, String>myReversedMap = Util.reverseMap(myMap);
        System.out.println(myReversedMap.toString());
    }
}
