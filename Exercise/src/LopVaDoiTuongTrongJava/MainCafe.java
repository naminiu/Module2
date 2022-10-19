package LopVaDoiTuongTrongJava;

import java.util.Scanner;

public class MainCafe {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cafe billCoffee = new Cafe("Trung Nguyen", 100000, 3.5);
        System.out.println(billCoffee);
        String formatOfcalculateTotal = billCoffee.formatNumber(billCoffee.calculateTotal());
        System.out.println("tổng tiền: " + formatOfcalculateTotal + " đồng.");
        System.out.println("Khối lượng là: "+ billCoffee.formatNumber(billCoffee.getPricePerKg()) + " đồng.");

//        System.out.print("nhập khối lượng để kiểm tra khối lượng: ");
//        double volumeCheck = scanner.nextDouble();
//        System.out.printf("Kiểm tra khối lượng lớn hơn %skg hay không? %b%n", volumeCheck,billCoffee.checkVolume(volumeCheck));
//
//        System.out.print("nhập số tiền để kiểm tra tổng tiền: ");
//        double totalCheck = scanner.nextDouble();
//        String formatOftotalCheck = billCoffee.formatNumber(totalCheck);
//        System.out.printf("Kiểm tra tổng sô tiền lớn hơn %s đồng hay không? %b%n", formatOftotalCheck, billCoffee.checkTotal(totalCheck));

        System.out.println("Nhập % chiết khấu(cho hóa đơn trên 500.000 đồng): ");
        double amountDiscount = scanner.nextDouble();
        System.out.println("số tiền chiết khấu là: " + billCoffee.formatNumber(billCoffee.discountAmount(amountDiscount)) + " đồng.");
        System.out.println("số tiền khách phải trả sau khi đã giảm giá: " + billCoffee.formatNumber(billCoffee.calculateTotal()-billCoffee.discountAmount(amountDiscount)) + " đồng.");
    }

}

