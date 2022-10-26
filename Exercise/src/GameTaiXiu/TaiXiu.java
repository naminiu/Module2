package GameTaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int check = 1;
        double taiKhoanNguoiChoi = 5000000;
        Locale lc = new Locale("vi", "VN");
//        NumberFormat numberF = NumberFormat.getNumberInstance(lc);
        NumberFormat numberF = NumberFormat.getCurrencyInstance(lc);
        do {
            System.out.println("--------Mời bạn lựa chọn--------");
            System.out.println("Chọn (1) để tiếp tục");
            System.out.println("Chọn phím bất kì để thoát");
            System.out.println("Mời bạn nhập");
            check = scanner.nextInt();
            if (check == 1) {
                System.out.println("-------------------------------");
                System.out.println("Bắt đầu chơi");
                System.out.println("Tài khoản của bạn là: " + numberF.format(taiKhoanNguoiChoi));
                System.out.println("Bạn muốn cược bao nhiêu? ");
                double soTienCuoc;
                // nhập số tiền
                do {
                    System.out.println("Đặt cược (0 < số tiền cược < " + numberF.format(taiKhoanNguoiChoi));
                    soTienCuoc = scanner.nextDouble();
                } while (soTienCuoc > taiKhoanNguoiChoi || soTienCuoc <= 0);

                // chọn tài xỉu
                int chonTaiXiu;
                do {
                    System.out.println("Chọn 1: đặt tài -- chọn 2: đặt xỉu ");
                    chonTaiXiu = scanner.nextInt();
                } while (chonTaiXiu != 1 && chonTaiXiu != 2);

                // tung xúc xắc
                Random random = new Random();
                int random1 = random.nextInt(5) + 1;
                int random2 = random.nextInt(5) + 1;
                int random3 = random.nextInt(5) + 1;
                int result = random1 + random2 + random3;

                //Tính toán kết quả
                System.out.println("Kết quả: " + random1 + " - " + random2 + " - " + random3);
                if (result == 3 || result == 18) {
                    System.out.println("Tổng là: " + result + " .Nhà cái ăn hết, bạn đã thua");
                    taiKhoanNguoiChoi -= soTienCuoc;
                    System.out.println("số tiền còn lại là: " + (taiKhoanNguoiChoi));
                } else if (result > 3 && result < 11) {
                    System.out.println("Tổng là: " + result + " ==> Xỉu");
                    if (chonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng");
                        taiKhoanNguoiChoi += soTienCuoc;
                        System.out.println("tài khoản của bạn là: " + (taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Bạn đã thua");
                        taiKhoanNguoiChoi += soTienCuoc;
                        System.out.println("tài khoản của bạn là: " + (taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("Tổng là: " + result + " ==> tài");
                    if (chonTaiXiu == 1) {
                        System.out.println("Bạn đã thắng");
                        taiKhoanNguoiChoi += soTienCuoc;
                        System.out.println("tài khoản của bạn là: " + (taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Bạn đã thua");
                        taiKhoanNguoiChoi += soTienCuoc;
                        System.out.println("tài khoản của bạn là: " + (taiKhoanNguoiChoi));
                    }
                }
//                String checkTaiXiu = "";
//                int signCheckTaiXiu = 0;
//                if (4 < result && result < 11) {
//                    checkTaiXiu = "Xỉu";
//                    signCheckTaiXiu = 2;
//                }
//                if (11 <= result && result < 17) {
//                    checkTaiXiu = "Tài";
//                    signCheckTaiXiu = 1;
//                }
//
//                System.out.println("Kết quả: " + random1 + " - " + random2 + " - " + random3);
//                System.out.println("Tổng là: " + result + " ==> " + checkTaiXiu);
//
//                if (chonTaiXiu == signCheckTaiXiu) {
//                    System.out.println("Bạn đã thắng cược");
//                    System.out.println("Tài khoản của bạn là: " + (taiKhoanNguoiChoi + soTienCuoc));
//                } else {
//                    System.out.println("Bạn đã thua cược");
//                    System.out.println("Tài khoản của bạn là: " + (taiKhoanNguoiChoi - soTienCuoc));
//                }
//                if (result == 3 || result == 18) {
//                    System.out.println("Nhà cái ăn");
//                    System.out.println("Tài khoản của bạn là: " + (taiKhoanNguoiChoi - soTienCuoc));
//                }
            }
        } while (check == 1);
    }
}
