package VongLapJava;

import java.util.Scanner;

public class BTHienThiCacSoNguyenToNhoHon100 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Nhập n(>2) để đếm các số nguyên tố nhỏ hơn n (nhập 0 để thoát):");
            number = scanner.nextInt();
            System.out.println("Các số nguyên tố nhỏ hơn n là: ");
            System.out.println(inRaSoNgToNhoHonN(number));
            System.out.println("Số lượng các số nguyên tố nhỏ hơn n là: ");
            System.out.println(demSoLuongInRaSoNgToNhoHonN(number));

        } while (number != 0);

    }

    public static int demSoLuongInRaSoNgToNhoHonN(int number) {
        int i = 2;
        int count = 0;
        while (i <= number) {
            boolean check = checkSoNgTo(i);
            if (check == true) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static String inRaSoNgToNhoHonN(int number) {
        int i = 2;
        String str = "";
        while (i <= number) {
            boolean check = checkSoNgTo(i);
            if (check == true) {
                str += i + " ";
            }
            i++;
        }
        return str;
    }

    public static void inRaSoNgToview() {
        int stop = 0;
        int amount;
        do {
            System.out.println("Nhập số lượng số nguyên tố cần in ra (nhập 0 để thoát):");
            amount = scanner.nextInt();
            System.out.println(inRaSoNgTo(amount));
        } while (stop != amount);
    }

    public static String inRaSoNgTo(int amount) {
        String str = "";
        int count = 0;
        int i = 2;
        while (count <= amount) {
            boolean check = checkSoNgTo(i);
            if (check == true) {
                str += i + " ";
                count++;
            }
            i++;
        }
        return str;
    }

    public static boolean checkSoNgTo(int number) {
        boolean checkSoNgto = true;
        if (number < 2) {
            checkSoNgto = false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                checkSoNgto = false;
                break;
            }
        }
        return checkSoNgto;
    }
}
