import java.util.Scanner;

public class BTUngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD");
        long usd = scanner.nextLong();
        long rate = 24400 * usd;
        System.out.println(rate + " đồng");
    }
}
