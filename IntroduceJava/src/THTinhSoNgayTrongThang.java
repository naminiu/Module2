import java.util.Scanner;

public class THTinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng để kiểm tra");
        int month = scanner.nextInt();
        String NumberDayofMonth = switch (month) {
            case 2 -> "tháng " + month + " có 28 hoặc 29 ngày.";
            case 1, 3, 5, 7, 8, 10, 12 -> "tháng " + month + " có 31 ngày.";
            case 4, 6, 9, 11 -> "tháng " + month + " có 30 ngày.";
            default -> "Bạn đã nhập sai";
        };
        System.out.printf(NumberDayofMonth);
    }
}
