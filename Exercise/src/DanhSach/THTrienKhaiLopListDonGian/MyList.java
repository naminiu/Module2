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

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    // add index
    public void add(int index, int value) {
        if (index >= elements.length) {
            int newSize = elements.length + (index - (elements.length - 1));
            elements = Arrays.copyOf(elements, newSize);
            DEFAULT_CAPACITY = newSize;
        }
        if (index >= 0 && index < elements.length) {
            for (int i = elements.length - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = value;
            size++;
        }

    }

    // add vào chỗ trống
//    public void add(int index, int value) {
//        if (size >= elements.length) {
//            ensureCapa();
//        }
//        if (index > 0 || index < size) {
//            for (int i = size - 1; i >= index; i--) {
//                elements[i + 1] = elements[i];
//            }
//            elements[index] = value;
//            size++;
//        }
//    }
    public Object clone() {
        return "MyListClone{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public boolean contains(E value) {
        for (Object itemp : elements) {
            if (itemp == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E value) {
        int indexof = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
               return indexof = i;
            }
        }
        return indexof;
    }

//        for (int i = 0; i < elements.length;i++){
//            if (value == elements[i]){
//                System.out.println("True");
//                System.out.println(value + " tại vị trí " + i);
//                break;
//            }
//            if (value != elements[i]){
//                System.out.println("False");
//                break;
//            }
//        }


    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E value) {
        if (size >= elements.length) {
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

    public Object clear(){
        for (int i = 0; i <= size; i++){
            elements[i] = null;
        }
        size = 0;
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
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
