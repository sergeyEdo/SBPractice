package util;

import java.util.HashMap;
import java.util.Map;

public class Util {

    private Util() {}

    public static <V,K> Map<V,K> reverseMap(Map<K,V> map){
        Map<V,K> reversed_map = new HashMap<>();
        for(Map.Entry<K,V> entry : map.entrySet()){
            K entryKey = entry.getKey();
            V entryVal = entry.getValue();
            reversed_map.put(entryVal, entryKey);
        }
        return reversed_map;
    }
}