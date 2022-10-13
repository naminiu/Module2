package VongLapJava;

import java.util.Scanner;

public class BTHienThiCacLoaiHinh {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the squareTriangleBottomLeft");
            System.out.println("3. Draw the squareTriangleTopLeft");
            System.out.println("4. Draw the squareTriangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài:");
                    int weight = scanner.nextInt();
                    System.out.println("Nhập chiều rộng:");
                    int height = scanner.nextInt();
                    System.out.println("Print the rectangle");
                    rectangle(weight, height);
                    break;
                case 2:
                    System.out.println("Nhập chiều dài:");
                    int height2 = scanner.nextInt();
                    System.out.println("Print the square triangle ");
                    squareTriangleBottomLeft(height2);
                    break;
                case 3:
                    System.out.println("Nhập chiều dài:");
                    int height3 = scanner.nextInt();
                    System.out.println("Print isosceles triangle ");
                    squareTriangleTopLeft(height3);
                    break;
                case 4:
                    System.out.println("Nhập chiều dài:");
                    int height4 = scanner.nextInt();
                    System.out.println("Print isosceles triangle ");
                    squareTriangle(height4);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static String rectangle(int weight, int height) {
        String result = "";
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
        return result;
    }


    // bai 2: In hình tam giác vuông, có cạnh góc vuông ở botton-left
    public static String squareTriangleBottomLeft(int height) {
        String result = "";
        for (int i = 1; i <= height; i++) {
            result += "* ";
            System.out.println(result);
        }
        return result;
    }

    // bài 3: In hình tam giác vuông, có cạnh góc vuông ở top-left
    public static String squareTriangleTopLeft(int height) {
        String result = "";
        for (int i = height; 1 <= i; i--) {
            for (int j = 1; j <= i; j++) {
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
        return result;
    }

    public static String squareTriangle(int height) {
        int space = 0;
        String result = "";
        for (int j = 1; j <= height; j++, space = 0) {
            for (int i = 1; i <= height - j; i++) {
                result = " ";
                System.out.print(result);
            }
            while (space != j) {
                result = "* ";
                System.out.print(result);
                space++;
            }
            result = "";
            System.out.println(result);
        }
        return result;
    }
}
// in hình chữ nhật
//        int weight = 7 ;
//        int height = 3;
//        int i;
//        int j;
//        String result = "";
//        for (i = 1; i <= height;i++ ){
//            for (j = 1; j <= weight;j++){
//                result += "* "  ;
//            }
//            System.out.println(result);
//            result = "";

// bai 2: In hình tam giác vuông, có cạnh góc vuông ở botton-left
//        int height = 5;
//        int i;
//        String result ="";
//        for (i = 1; i <= height;i++ ){
//                result += "* "  ;
//            System.out.println(result);
//        }
// bài 3: In hình tam giác vuông, có cạnh góc vuông ở top-left
//        int height = 6;
//        int i;
//        int j;
//        String result = "";
//        for (i = height; 1 <= i; i--) {
//            for ( j = 1; j <= i; j++) {
//                result += "* ";
//            }
//            System.out.println(result);
//            result = "";
//        }
// in hình chữ nhật


