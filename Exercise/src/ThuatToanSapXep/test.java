package ThuatToanSapXep;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Buble sort
        int[] arr = {5, 3, 1, 8, 6, 3};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //Selection sort
        int[] arr1 = {5, 3, 1, 8, 6, 3};
        for (int i = 0; i < arr1.length - 1; i++) {
            int min = i;
            for (int j = 1 + i; j < arr1.length; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }
            // nếu vòng for thực hiện min sẽ thay đổi
//            if (min != i) {  // k cần vẫn chạy được
                int temp = arr1[min];
                arr1[min] = arr1[i];
                arr1[i] = temp;
        }
        System.out.println(Arrays.toString(arr1));


        //interchange sort
        int[] array = {4, 2, 1, 8, 6, 3};
        int pos, x;
        for (int i = 0; i < array.length; i++) {
//            a[pos-1] <= a[i ]< a[pos] (1 <= pos <= i)
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
        // chưa hiểu
    }
}
