package IntroduceJava;

import java.util.Scanner;

public class THSuDungToanTu {
    public static void main(String[] args) {
        byte width;
        byte height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        width = scanner.nextByte();
        System.out.println("Nhập chiều dài");
        height = scanner.nextByte();
        int area = width * height;
        System.out.println("Dien Tich la: " + area);
    }
}
