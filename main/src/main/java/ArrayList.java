public class ArrayList implements CollectionInterface
{
    Object[] array;

    public ArrayList()
    {
        array = new Object[0];
    }

    @Override
    public Object get(int var1) {
        return array[var1];
    }

    @Override
    public void add(Object var1) {
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = var1;
        array = newArray;
    }

    @Override
    public void delete(int index) {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index + 1 - 1, array.length - (index + 1));
        array = newArray;
    }

    @Override
    public void remove(Object var1) {
        int index = array.length+1;
        for (int i=0;i<array.length;i++)
        {
            if(array[i] == var1) {
                index = i;
            }
        }
        if(index<array.length+1)
        {
          delete(index);
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }
}
