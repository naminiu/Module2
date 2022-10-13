package VongLapJava;

import java.util.Scanner;

public class BTHienThi20SoNguyenToDauTien {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int stop = 0;
        int amount;
        do {
            System.out.println("Nhập số lượng số nguyên tố cần in ra (nhập 0 để thoát):");
            amount = scanner.nextInt();
            System.out.println(soLuongSoNgTo(amount));
        } while (stop != amount);
    }

    public static String soLuongSoNgTo(int amount) {
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
