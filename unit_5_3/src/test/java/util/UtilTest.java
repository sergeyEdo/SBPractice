package util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UtilTest {

    @Test
    public void testReverseMap(){
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);

        Map<Integer, String>myReversedMap = Util.reverseMap(myMap);

        Assert.assertEquals(myReversedMap.toString(), "{1=One, 2=Two, 3=Three, 4=Four}");
    }

}