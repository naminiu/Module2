package IntroduceJava;

import java.util.Scanner;

public class THGiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        // phương trình bậc 1: ax + b - c = 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        float nhapa = scanner.nextFloat();
        System.out.println("Nhập b");
        float nhapb = scanner.nextFloat();
        System.out.println("Nhập c");
        float nhapc = scanner.nextFloat();
        if (nhapa == 0) {
            if (nhapb == nhapc) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else if (nhapa != 0) {
            float x = ((nhapc - nhapb) / nhapa);
            System.out.println("Phương trình có nghiệm là x = " + x);
        }
    }
}
