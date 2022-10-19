package LopVaDoiTuongTrongJava;

import java.util.Scanner;

public class MainRectangle {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập Width: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập Height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Chu vi là: " + rectangle.getArea());
        System.out.println("Diện tích là: " + rectangle.getPerimeter());
        }
    }
