package TryCatchNgoaiLe.BTSuDungLopIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("nhập cạnh c: ");
        int c = scanner.nextInt();

        try {
            CheckTriangle triangle = new CheckTriangle();
            System.out.println(triangle.checktriangle(a,b,c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
