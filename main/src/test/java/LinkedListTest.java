import org.junit.*;

import static org.junit.Assert.assertEquals;

public class LinkedListTest
{

    LinkedList linkedList = new LinkedList();

    @Before
    public void before() {
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Bird");
    }

    @Test
    public void addTest()
    {
        assertEquals(linkedList.size(), 3);
    }

    @Test
    public void getTest()
    {
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
