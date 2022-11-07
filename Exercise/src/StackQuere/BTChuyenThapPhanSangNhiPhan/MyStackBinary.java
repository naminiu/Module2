package StackQuere.BTChuyenThapPhanSangNhiPhan;

import java.util.LinkedList;
import java.util.Scanner;

public class MyStackBinary {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Khởi tạo stack rỗng
        LinkedList stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number need convert: ");
        int number = sc.nextInt();

        //Chuyển đổi từ thập phân sang nhị phân
        final int NUM = number;
        while (number != 0) {
            // result => stack
            stack.push(number % 2);//số dư
            number = number / 2;
        }
        // đọc hết stack => nối chuỗi
        String string = "";
        while (!stack.isEmpty()) {
            string += stack.pop();
        }
        System.out.println("result: " + NUM + " = " + "(" + string + ")" + "B");
    }
}

