package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class VongLap2ChieuAQuang {
    public static Scanner scanner = new Scanner(System.in);
    private static java.lang.String String;

    public static void main(String[] args) {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = (int) (Math.random() * (99 - 11)) + 11;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        // tam giác góc vuông dưới phải
        //              *
        //            * *
        //          * * *
        //        * * * *
        //      * * * * *
        //    * * * * * *
//         00 01 02 03 04 05              05
//                     14 15
//                  23 24 25
//               32 33 34 35
//            41 42 43 44 45
//         50 51 52 53 54 55
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < (arr.length-1)-i) {
                    String str = "";
                    str = java.lang.String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }

        // tam giác vuông góc trên phải
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (j < i) {
//                    String str = "";
//                    str = java.lang.String.valueOf((arr[i][j]));
//                    str = "   ";
//                    System.out.print(str);
//                } else {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//            System.out.println("");
//        }

        // tam giác góc vuông dưới trái
        //*
        //* *
        //* * *
        //* * * *
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }

        // tam giác góc vuông trên trái
//        * * * *
//        * * *
//        * *
//        *
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-i;j++ ) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println("");
//        }

    }

    public static int[][] inputArray2() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        return arr;
    }
    // [2,2,4]
    // [4,5,7]

    public static String printArray2(int arr[][]) {
        String strArr = "";
        for (int i = 0; i < arr.length; i++) {
            String str = "[";
            for (int j = 0; j < arr[i].length; j++) {
                str += arr[i][j];
                if (j == arr[i].length - 1) {
                    str += "]";
                } else {
                    str += ",";
                }
            }
            str += "\n";
            strArr += str;
        }
        return strArr;
    }

    public static int totalEvenArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    // Tinh tong cac gia tri tren 2 duong cheo chinh
    public static int totalDiagonalArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                if(i==j){
//                    sum+= arr[i][j];
//                }
//                if (i + j == arr.length - 1) {
//                    sum+=arr[i][j];
//                }
                if (i == j || i + j == arr.length - 1) {
                    sum += arr[i][j];
                    System.out.printf(arr[i][j] + " ");
                }
            }
        }
        return sum;
    }
}