package textanalyzer;

import java.util.HashMap;
import java.util.Map;

public final class WordCounter {

    public static Map<String,Integer> countWords(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for(String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}