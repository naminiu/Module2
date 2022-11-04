package ThuatToanSapXep;

import java.util.Arrays;

public class ViDu {
    //    public static void main(String[] args) {
//        int[] arr = {1, 6, 2, 9, 4, 2};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//                int temp = arr[minIndex];
//                arr[minIndex] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] arr1 = {1, 6, 2, 9, 4, 2};
//        int temp, i, j;
//        for (i = 0; i < arr.length - 1; i++) {
//            for (j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
    public static void main(String[] args) {

        int[] arr = {1, 9, 4, 7, 6, 3, 2, 0};
        int i, j;
        int count = 1;
        for (i = 0; i < arr.length - 1; i++) {
            System.out.println(count);
            count++;
            for (j = 0; j < arr.length - 1 - i; j++) {
                //arr[j]<arr[j+1]
                int temp = 0;
                if ((arr[j] > arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
