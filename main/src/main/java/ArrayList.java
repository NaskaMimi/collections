import java.util.Collection;
import java.util.HashSet;

public class ArrayList implements CollectionInterface
{
    Collection array;

    public ArrayList()
    {
        array = new HashSet();
    }

    @Override
    public Object get(int var1) {
        int n = 0;
        while (array.iterator().hasNext())
        {
            if(n == var1)
            {
                return array.iterator().next();
            } //else
            n++;
        }
        return null;
    }

    @Override
    public void add(Object var1) {
        array.add(var1);
    }

    @Override
    public void delete(int index) {
        //array.delete(var1);
    }

    @Override
    public void remove(Object var1) {
        array.remove(var1);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
