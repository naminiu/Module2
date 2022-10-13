package VongLapJava;

import java.util.Objects;
import java.util.Scanner;

public class THKiemTraSoNguyenTo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flagContinue = true;
        do {
            System.out.println("Nhập 1 số để kiểm tra (nhập 0 để thoát)");
            int number = Integer.parseInt(scanner.nextLine());
            boolean CheckSoNgto = true;
            if (number < 0) {
                System.out.println("Nhập lại");
            } else if (number == 1) {
                System.out.println(number + " không phải là số nguyên tố");
            } else if (number > 1) {
                for (int i = 2; i < number - 1; i++) {
                    if (number % i == 0) {
                        CheckSoNgto = false;
                        break;
                    }
                }
                if (CheckSoNgto) {
                    System.out.println(number + " là số nguyên tố");
                } else {
                    System.out.println(number + " không phải là số nguyên tố");
                }
            }
            if (Objects.equals(number, 0)) {
                flagContinue = false;
            }
//            System.out.println("Bạn có muốn kiểm tra tiếp không? Y/N");
//            String checkContinue = scanner.nextLine();
//            if (Objects.equals(checkContinue, "Y")) {
//                flagContinue = true;
//            } else {
//                if (Objects.equals(checkContinue, "N")) {
//                    flagContinue = false;
//                }
//            }
        } while (flagContinue);
    }
}
