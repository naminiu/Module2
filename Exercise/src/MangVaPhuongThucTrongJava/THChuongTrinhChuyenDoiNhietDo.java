package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class THChuongTrinhChuyenDoiNhietDo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Nhập số bài tập: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.print("nhập độ F: ");
                    double fahrenheit = scanner.nextDouble();
                    fahrenheitToCelsius(fahrenheit);
                    System.out.println("Độ F Là: "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("2. Celsius to Fahrenheit");
                    System.out.print("nhập độ C: ");
                    double celsius = scanner.nextDouble();
                    celsiusToFahrenheit(celsius);
                    System.out.println("Độ C là " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
