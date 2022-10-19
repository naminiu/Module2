package LopVaDoiTuongTrongJava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Cafe {
    public static Scanner scanner = new Scanner(System.in);
    // thuộc tính
    String name;
    double pricePerKg;
    double volume;

    // constructors
    public Cafe(String name, double price, double volume) {
        this.name = name;
        this.pricePerKg = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "caFe\n" +
                "name: " + name + "\n" +
                "pricePerKg: " + formatNumber(pricePerKg) + " đồng." + "\n" +
                "volume: " + volume
                ;
    }
    // methods
    public double getPricePerKg() {
        return this.pricePerKg;
    }


    public double calculateTotal() {
//        NumberFormat formatter = new DecimalFormat("###,###");
//        String formatTotal = formatter.format(pricePerKg*volume);
        return pricePerKg * volume;
    }

    public double discountAmount(double x) {
        if (calculateTotal() > 500000) {
            return calculateTotal() * (x / 100);
        } else {
            return 0;
        }
    }

    public String formatNumber(double Totalcheck) {
        NumberFormat formatter = new DecimalFormat("###,###.###");
        String formatTotal = formatter.format(Totalcheck);
        return formatTotal;
    }

    public boolean checkVolume(double Volumecheck) {
        return Volumecheck < this.volume;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public boolean checkTotal(double totalCheck) {
        return totalCheck < calculateTotal();
    }


}
