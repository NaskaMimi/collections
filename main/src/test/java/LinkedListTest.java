import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LinkedListTest {

    @Test
    public void putTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Bird");

        //linkedList.delete(1);
        //assertEquals(linkedList.size(),3);
        for(int i=0;i<linkedList.size();i++) {
            System.out.println(linkedList.get(i));
        }
        //assertEquals(linkedList.get(2),"Cat");
    }

}
