public class LinkedList implements CollectionInterface
{
    private Entry mainEntry;

    public LinkedList()
    {
        mainEntry = null;
    }

    @Override
    public Object get(int var1)
    {
        return getEntry(var1).element;
    }

    private Entry getEntry(int var1)
    {
        return findEntry(mainEntry, size() - 1, var1);
    }

    private Entry findEntry(Entry entry, int currentNumber, int expectedNumber)
    {
        if (currentNumber == expectedNumber)
        {
            return entry;
        }
        else
        {
            currentNumber--;
            return findEntry(entry.prev, currentNumber, expectedNumber);
        }
    }

    @Override
    public void add(Object var1)
    {
        if (mainEntry == null)
        {
            mainEntry = new Entry(var1, null, null);
        }
        else
        {
            Entry prevEntry = mainEntry;
            mainEntry = new Entry(var1, null, prevEntry);
            prevEntry.next = mainEntry;
        }
    }

    @Override
    public void delete(int index)
    {
        Entry entryToDelete = getEntry(index);
        Entry entryPrev = entryToDelete.prev;
        Entry entryNext = entryToDelete.next;

        if (entryPrev != null)
        {
            entryPrev.next = entryNext;
        }
        if (entryNext != null)
        {
            entryNext.prev = entryPrev;
        }

        entryToDelete = null;
    }

    @Override
    public void remove(Object var1)
    {

    }

    @Override
    public int size()
    {
        return isNextEntry(mainEntry, 1);
    }

    private int isNextEntry(Entry entry, int number)
    {
        if (entry.prev == null)
        {
            return number;
        }
        else
        {
            number++;
            return isNextEntry(entry.prev, number);
        }
    }

    @Override
    public boolean isEmpty()
    {
        return size() == 0;
    }


    public void put(Object objectToAdd, int number)
    {
        Entry nextEntry = getEntry(number);
        nextEntry.prev = new Entry(objectToAdd, nextEntry, nextEntry.prev);
    }


    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
