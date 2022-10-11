import java.util.*;

public class ListForHW<E> implements List<E> {


    public static class Triplets {
        Object[] data;
        Triplets next;
        Triplets previous;

        Triplets(Triplets previous, Object[] items, Triplets next) {
            this.data = items;
            this.next = next;
            this.previous = previous;
        }
    }

    private Triplets lastTriplet;
    private Triplets firstTriplet;
    private int counter0;
    private int counter5 = 5;
    private int size;


    public ListForHW() {
        firstTriplet = new Triplets(null, new Object[5], null);
        lastTriplet = firstTriplet;
    }





    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] data = c.toArray();
        for (Object o: data) {
            remove(o);
        }
        return true;
    }


    @Override
    public int indexOf(Object o) {
        for(int i=0; i < size; i++) {
            return i;
        }
        return -1;
    }



    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public E get(int index) {
        Triplets trpl = firstTriplet;
        for (int i = 0; i < (index + 5 - counter5) / 5; i++) {
            trpl = trpl.next;
        }
        return (E) trpl.data[(index + 5 - counter5) % 5];
    }



    @Override
    public E set(int index, E element) {
        return null;
    }
    public void addFirst(E e) {
        if (counter0 == 0) {
            Triplets noviy = new Triplets(null, new Object[5], firstTriplet);
            firstTriplet.previous = noviy;
            firstTriplet = noviy;
        }
        firstTriplet.data[4 - counter0] = e;
        counter0++;
        size++;
        if (counter0 == 5) {
            counter0 = 0;
        }
    }
    @Override
    public void add(int index, E element) {
    }

    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        remove(i);
        return true;
    }


    public void addLast(E e) {
        if (counter0 == 5) {
            Triplets triplet = new Triplets(lastTriplet, new Object[5], null);
            lastTriplet.next = triplet;
            triplet.data[0] = e;
            lastTriplet = triplet;
            counter0 = 1;
        } else {
            lastTriplet.data[counter0] = e;
            counter0++;
        }
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] data = c.toArray();
        for (Object o : data) {
            addLast((E) o);
        }
        return true;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }
    @Override
    public Object[] toArray() {
        Object[] data = new Object[size];
        for (int i=0; i < size; i++) {
            data[i] = get(i);
        }
        return data;
    }
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public E remove(int index) {
        Triplets triplets = firstTriplet;
        Object delete = get(index);
        for (int i = 0; i < (index); i ++) {
            triplets = triplets.next;
        }
        Object[] array = toArray();
        lastTriplet = triplets;
        triplets.next = null;
        size = index;
        counter0 = (index);
        for (int i = index+1; i < array.length; i++) {
            addLast((E) array[i]);
        }
        return (E) delete;
    }



    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            int indexNextElement;
            @Override
            public boolean hasNext() {
                return indexNextElement < size;
            }
            @Override
            public E next() {
                E e = get(indexNextElement);
                indexNextElement++;
                if (e != null) {
                    return e;
                } else {
                    return null;
                }
            }
        };
        return iterator;
    }


    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }



    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }




    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


}



