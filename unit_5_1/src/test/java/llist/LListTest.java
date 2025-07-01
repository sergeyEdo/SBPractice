package llist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LListTest {

    @Test
    public void testAdd(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        Assert.assertEquals(list.get(0), "A");
        Assert.assertEquals(list.get(1), "B");
    }

    @Test
    public void testRemove(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        list.remove();

        Assert.assertEquals(list.get(0), "B");
    }

    @Test
    public void testGetFirst(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        Assert.assertEquals(list.getFirst(), "A");
    }

    @Test
    public void testGetLast(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        Assert.assertEquals(list.getLast(), "B");
    }

    @Test
    public void testClear(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        list.clear();

        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testSize(){
        LList list = new LList();
        list.add("A");
        list.add("B");

        Assert.assertEquals(list.size(), 2);
    }
}