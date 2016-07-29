public class LinkedList implements CollectionInterface
{
    public ArrayList arrayList;

    public LinkedList()
    {
        arrayList = new ArrayList();
    }

    @Override
    public Object get(int var1) {
        return arrayList.get(var1);
    }

    @Override
    public void add(Object var1) {
        arrayList.add(var1);
    }

    @Override
    public void delete(int index) {
        //int index = this.getIndex(var1);


        ArrayList arFinal = new ArrayList();
        for(int i=0;i<index;i++)
        {
            arFinal.add(arrayList.get(i));
        }

        for(int j=index+1;j<arrayList.size();j++)
        {
            arFinal.add(arrayList.get(j));
        }

        arrayList = new ArrayList();

        for (int y = 0;y<arFinal.size();y++)
        {
            arrayList.add(arFinal.get(y));
        }

    }

    @Override
    public void remove(Object var1) {
        arrayList.remove(var1);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }


    public void put(int index, Object objectToAdd) {
        ArrayList arFinal = new ArrayList();
        for(int i=0;i<index;i++)
        {
            arFinal.add(arrayList.get(i));
        }

        arFinal.add(objectToAdd);

        for(int j=index+1;j<arrayList.size();j++)
        {
            arFinal.add(arrayList.get(j));
        }

        for (int x = 0;x<arrayList.size();x++)
        {
            arrayList.delete(x);
        }

        for (int y = 0;y<arFinal.size();y++)
        {
            arrayList.add(arFinal.get(y));
        }
    }
}
