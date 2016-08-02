import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    ArrayList arrayList = new ArrayList();

    @Before
    public void before() {
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Bird");
    }

    @Test
    public void addTest() {
        assertEquals(arrayList.size(),3);
        assertEquals(arrayList.get(2),"Bird");
    }

    @Test
    public void deleteTest() {
        arrayList.delete(1);
        assertEquals(arrayList.size(), 2);
        assertEquals(arrayList.get(1),"Bird");

    }

    @Test
    public void removeTest() {
        arrayList.remove("Dog");
        assertEquals(arrayList.size(),2);
        assertEquals(arrayList.get(1),"Bird");

    }
}
