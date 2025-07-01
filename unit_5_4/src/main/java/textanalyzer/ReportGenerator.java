package textanalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ReportGenerator {
    private ReportGenerator() {}

    public static <K,V> void makeUnorderedReport(Map<K,V> map) {
        for(Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}