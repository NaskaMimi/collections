import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void addTest() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Bird");

        assertEquals(arrayList.size(),3);
        assertEquals(arrayList.get(2),"Bird");
    }

    @Test
    public void deleteTest() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Bird");

        arrayList.delete(1);
        assertEquals(arrayList.size(), 2);
        assertEquals(arrayList.get(1),"Bird");

    }

    @Test
    public void removeTest() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Bird");

        arrayList.remove("Dog");
        assertEquals(arrayList.size(),2);
        assertEquals(arrayList.get(1),"Bird");

    }
}
