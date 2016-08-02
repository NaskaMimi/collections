import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest
{

    @Test
    public void addTest()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Bird");

        assertEquals(linkedList.size(), 3);
    }

    @Test
    public void getTest()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Bird");

        assertEquals(linkedList.get(0), "Cat");
        assertEquals(linkedList.get(1), "Dog");
        assertEquals(linkedList.get(2), "Bird");
    }

    @Test
    public void putTest()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Cat");
        linkedList.add("Bird");
        linkedList.put("Dog", 1);

        assertEquals(linkedList.get(0), "Cat");
        assertEquals(linkedList.get(1), "Dog");
        assertEquals(linkedList.get(2), "Bird");
    }

    @Test
    public void deleteTest()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Bird");

        linkedList.delete(1);

        assertEquals(linkedList.get(0), "Cat");
        assertEquals(linkedList.get(1), "Bird");
        assertEquals(linkedList.size(), 2);
    }

    @Test
    public void test2()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add("asd");
        linkedList.delete(0);
        assertEquals(linkedList.size(), 0);
    }
}
