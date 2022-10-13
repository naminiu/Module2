package VongLapJava;


import java.util.Scanner;

public class THTimUocChungLonNhat {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number1;
        int number2;
        int UCLN = 1;
        System.out.println("Nhập số thứ nhất: ");
        number1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        number2 = scanner.nextInt();
        int i = 1;
        while (i <= number1 && i <= number2){
            if (number1 % i == 0 && number2 % i == 0) {
                UCLN = i;
            }
            i++;
        }
//        for (int i = 1; i <= number1 && i <= number2;i++){
//            if (number1%i==0 && number2%i==0){
//                UCLN = i;
//            }
//        }
        System.out.println("Ước chung lớn nhất là: " + UCLN);
    }
}