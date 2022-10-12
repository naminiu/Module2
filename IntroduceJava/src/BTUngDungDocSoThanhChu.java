import java.util.Scanner;

public class BTUngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = scanner.nextInt();
        int numbertwos = 0;
                switch (number) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    case 10 -> System.out.println("Ten");
                    case 11 -> System.out.println("Eleven");
                    case 12 -> System.out.println("Twelve");
                    case 13 -> System.out.println("Thirteen");
                }
        if (number >= 14 && number < 20) {
            numbertwos = number%10;
        }
        System.out.println(numbertwos + "teen");
        }
    }

