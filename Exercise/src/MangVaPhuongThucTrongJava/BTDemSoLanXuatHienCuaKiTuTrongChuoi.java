package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class BTDemSoLanXuatHienCuaKiTuTrongChuoi {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi ");
        String str = scanner.nextLine();
        int number = str.length();
        System.out.println(number);
        System.out.println("Nhập kí tự cần kiểm tra ");
        String str1 = "";
        str1 = scanner.nextLine();

        int count = 0;
        String a;
        for (int i = 0; i < number; i++) {
             a = String.valueOf(str.charAt(i));
            if (a == str1){
                count++;
            }
            System.out.print(a + " ");
        }
        System.out.println(count);

    }
}

