package MangVaPhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class BTGopMang {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử của mảng 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập số lượng phần tử của mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập giá trị cho vị trí " + i + " của mảng 1: ");
            int valueSize1 = scanner.nextInt();
            array1[i] = valueSize1;
            array[i] = array1[i];
        }
        System.out.println("Mảng 1: " + printArray(array1));
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập giá trị cho vị trí " + i + " của mảng 2: ");
            int valueSize2 = scanner.nextInt();
            array2[i] = valueSize2;
            array[i + array1.length] = array2[i];
        }
        System.out.println("Mảng 2: " + printArray(array2));
        System.out.println("Mảng mới: " + printArray(array));
    }


    public static String printArray(int array[]) {

        String strArray = "[";
        for (int i = 0; i < array.length; i++) {
            strArray += array[i];
            if (i == array.length - 1) {
                strArray += "]";
            } else {
                strArray += ", ";
            }
        }
        return strArray;
    }

//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 11, 112};
//        int[] b = {6, 7, 8, 9};
//        int[] c = new int[a.length + b.length];
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        for (int j = 0; j < b.length; j++) {
//            c[j + a.length] = b[j];
//        }
//        printArray(c);
//    }
//

//
//    public static String printArray(int array[]) {
//
//        String strArray = "[";
//        for (int i = 0; i < array.length; i++) {
//            strArray += array[i];
//            if (i == array.length - 1) {
//                strArray += "]";
//            } else {
//                strArray += ", ";
//            }
//        }
//        System.out.println(strArray);
//        return strArray;
//    }

}
