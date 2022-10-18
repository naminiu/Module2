package MangVaPhuongThucTrongJava;

import java.util.Arrays;

public class ViDu {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int index = 3;
        int[] arrNew2 = Arrays.copyOf(arr, arr.length - 1);
        if (index < arr.length - 1 && index >= 0) {
            for (int i = 0; i < arrNew2.length; i++) {
                if (i >= index) {
                    arrNew2[i] = arr[i + 1];
                    System.out.println(arrNew2[i]);
                }
            }
        }
    }
}

//        System.out.println(2 + "\t" + 3);
//        System.out.println(2 + '\t' + 3);
//        System.out.println("" + 2 + '\t' + 3);
//        System.out.println(2 + 'a' + 3);
//        System.out.println(2 + "a" + 3);
//        System.out.println("" + 2 + 'a' + 3);


//        // Declare and initialize variables
//        int num1 = 1;
//        int num2 = 2;
//
//        swap(num1, num2);
//        System.out.println("After invoking the swap method, num1 is " +
//                num1 + " and num2 is " + num2);
//    }
//    /**
//     * Swap two variables
//     */
//    public static void swap(int n1, int n2) {
//        int temp = n1;
//        n1 = n2;
//        n2 = temp;
//        System.out.println("\t\tAfter swapping, n1 is " + n1
//                + " and n2 is " + n2);


//package MangVaPhuongThucTrongJava;
//
//public class ViDu {
//    public static void main(String[] args) {
////        double [] mylist = new double[20];
////        int x = mylist.length;
////        System.out.println(x);
////
////        mylist[1] = 10;
//////        System.out.println(mylist);
////        double mylist1 [] = new double[10];
//        double [] mylist2  = {1,3,5,7,9};
////        for (int i = 0; i < mylist2.length; i++){
////            System.out.println(mylist2[i]);
////        }
//        for(double a: mylist2){
//            System.out.println(a);
//        }
//
//    }
//}
