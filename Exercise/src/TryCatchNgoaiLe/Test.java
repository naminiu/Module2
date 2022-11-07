package TryCatchNgoaiLe;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    //    public static void trim() {
//        String name = "tring";
//        System.out.println(name);
//    }
//
//    public static void main(String[] args) {
//        int number = 0;
//        try {
//            System.out.println("nhập vào 1 số nguyên");
//            number = scanner.nextInt();
//            System.out.println("nhập vào 1 số nguyên");
//        } catch (Exception e) {
//            trim();
//            System.out.println("số nguyên là " + number);
//        }
//    }
//        try {
//            System.out.println(divide());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//        static int divide() {
//
//            int a = 10, b = 0;
//            if (b == 0) throw new ArithmeticException();
//            else return a / b;
//        }

//        static void readFile() throws FileNotFoundException {
//            FileReader file = new FileReader("../a.txt");
//        }
//        int number = 0;
//        try {
//            System.out.println("nhập vào 1 số nguyên");
//            number = scanner.nextInt();
//        } catch (Exception e) {
//            System.out.println("số nguyên là " + number);
//        }


    public static void main(String[] args) {
        try {
            System.out.println(divide());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static int divide() {
        int a = 10, b = 0;
        if (b == 0) throw new ArithmeticException();
        else return a / b;
    }
}