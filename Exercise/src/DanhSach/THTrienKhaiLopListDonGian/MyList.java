package DanhSach.THTrienKhaiLopListDonGian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 3;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int CAPACITY) {
        this.DEFAULT_CAPACITY = CAPACITY;
        elements = new Object[CAPACITY];
    }


    public MyList(int size, int DEFAULT_CAPACITY, Object[] elements) {
        this.size = size;
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public void setDEFAULT_CAPACITY(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    // mở rộng capacity
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void add(int index, E element) {
        for (int i = 0; i <size - 1;i++){
            if (i == index){
                ensureCapa();
                elements[i] = element;
            }
            if (i > index){
                elements[i] = elements[i+1];
            }
        }
    }

    //    {1,2,3,4,5,6}
//    public void add(int index, E element) {
//        int newSize = elements.length + 1;
//        elements = Arrays.copyOf(elements, newSize);
//        if (index < size && index > 0) {
//            for (int i = 0; i < elements.length; i++) {
//                if (i == index) {
//
//                    elements[i] = element;
//                }
//                if (i > index) {
//                    elements[i] = elements[i + 1];
//                }
//            }
//        }
//    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E value) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = value;
        size++;
    }

    public int get(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }


    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
