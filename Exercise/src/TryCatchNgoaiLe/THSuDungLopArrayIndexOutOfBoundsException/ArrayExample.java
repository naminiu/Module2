package TryCatchNgoaiLe.THSuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Scanner scanner = new Scanner(System.in);

    //    public static Integer[] creatRandom() {
//        Random random = new Random();
//        Integer[] arr = new Integer[100];
//        for (int i = 0; i < 100; i++) {
//            arr[i] = random.nextInt(100);
//            System.out.print(arr[i] + " ");
//        }
//        return arr;
//    }
    public static Integer[] creatRandom() {
        Integer[] arr = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }


    public static void main(String[] args) {
        Integer[] arr = ArrayExample.creatRandom();
//        ArrayExample arrExample = new ArrayExample();
//        Integer[] arr = arrExample.creatRandom();

        System.out.println("");
        System.out.println("nhập 1 số >= 0 && < 100");
        int check = scanner.nextInt();
        try {
            System.out.println("Vị trí " + check + " có giá trị là " + arr[check]);
        } catch (Exception a) {
            System.out.println("chỉ số vượt quá giớ hạn của mảng");
        }

    }
}
