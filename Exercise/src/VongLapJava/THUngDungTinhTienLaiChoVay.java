package VongLapJava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class THUngDungTinhTienLaiChoVay {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int month;
        double money;
        double interestRate;
        System.out.println("Nhập số tiền muốn gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng muốn gửi");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất để tính");
        interestRate = scanner.nextDouble();
        double result = monthlyInterest(money, month, interestRate);
        // dùng định dạng DecimalFormat
        NumberFormat formatter = new DecimalFormat("###,###");
        System.out.println("Lãi hàng tháng là " + formatter.format(result));
    }

    public static double monthlyInterest(double money, int month, double interestRate) {
        double Interest = 0;
        Interest = money * (interestRate / 100) / 12 * month;
        return Interest;
    }
}
