package clase07;

import java.util.Iterator;

public class ColeccionInventada<E> implements Iterable<E>{
    private E[] array;

    private static int DEFAULT_CAPACITY = 10;

    private int size;

    public ColeccionInventada() {
        this(DEFAULT_CAPACITY);
    }

    public ColeccionInventada(int capacity) {
        size = 0;
        array = (E[]) new Object[capacity];
    }

    public void add(E e){
        ensureCapaccity();
        size++;
        array[size] = e;

    }

    private void ensureCapaccity() {
        if(size == array.length){
            int newSize = array.length * 2;

            E[] newArray = (E[]) new Object[newSize];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;

        }
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()){
                    throw new IllegalArgumentException("No hay más lugar");
                }
                currentIndex++;
                return array[currentIndex];
            }
        };
    }



}
