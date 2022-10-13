import java.util.Objects;
import java.util.Scanner;

public class THKiemTraNamNhuan {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag;
        do {
            flag = true;
            System.out.println("Bạn hãy nhập số năm cần kiểm tra: ");
            int year = Integer.parseInt(scanner.nextLine());
            boolean check = checkyear(year);
            if (check) {
                System.out.println("là năm nhuận");
            } else {
                System.out.println("không phải năm nhuận");
            }
            System.out.println("Bạn có muốn tiếp tục không? Y/N ");
            String checkcontinue = scanner.nextLine();
            if (Objects.equals(checkcontinue, "Y")) {
                flag = true;
            } else {
                if (Objects.equals(checkcontinue, "N")) {
                    flag = false;
                }
            }
        }
        while (flag);

    }


    public static boolean checkyear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số năm để kiểm tra");
//        int year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " Nam nhuan");
//                } else {
//                    System.out.println(year + " khong phai nam nhuan");
//                }
//            } else {
//                System.out.println(year + " Nam nhuan");
//            }
//        } else {
//            System.out.println(year + " khong phai nam nhuan");
//        }
