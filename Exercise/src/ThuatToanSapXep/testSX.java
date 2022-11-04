package ThuatToanSapXep;

import java.util.Arrays;

public class testSX {

    static void bubbleAscending(int[] myarray) {
        int n = myarray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (myarray[j - 1] > myarray[j]) {
                    //Code to swap the elements
                    temp = myarray[j - 1];
                    myarray[j - 1] = myarray[j];
                    myarray[j] = temp;
                }
            }
        }
    }

    static void bubbleDescending(int[] myarray) {
        int n = myarray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (myarray[j - 1] < myarray[j]) {
                    //Code to swap the elements
                    temp = myarray[j - 1];
                    myarray[j - 1] = myarray[j];
                    myarray[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 9, 3, 4};
//        bubbleAscending(arr);
//        System.out.println(Arrays.toString(arr));
//        bubbleDescending(arr);
//        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
