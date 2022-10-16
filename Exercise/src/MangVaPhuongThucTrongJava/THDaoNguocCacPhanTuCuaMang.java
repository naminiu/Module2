package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class THDaoNguocCacPhanTuCuaMang {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean checkContinue = false;
        do {
            System.out.println("Bài 1: đảo ngược giá trị của mảng");
            System.out.println("Bài 2: kiểm tra một giá trị có trong mảng hay không");
            System.out.println("Bài 3: tìm giá trị lớn nhất trong mảng");
            System.out.println("Bài 4: tìm giá trị nhỏ nhất trong mảng");
            System.out.println("Bài 5: Thêm một giá trị vào mảng");
            System.out.println("Bài 6: Xóa một giá trị vào mảng");
            System.out.print("Nhập số để chọn bài: ");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    System.out.println("Bài 1: đảo ngược giá trị của mảng");
                    reverseArrayView();
                    break;
                case "2":
                    System.out.println("Bài 2: kiểm tra một giá trị có trong mảng hay không");
                    checkValueinArrayView();
                    break;
                case "3":
                    System.out.println("Bài 3: tìm giá trị lớn nhất trong mảng");
                    findMaxView();
                    break;
                case "4":
                    System.out.println("Bài 4: tìm giá trị nhỏ nhất trong mảng");
                    findMinView();
                    break;
                case "5":
                    System.out.println("Bài 5: Thêm một giá trị vào mảng");
                    addValueInArrayView();
                    break;
                case "6":
                    System.out.println("Bài 6: Xóa một giá trị vào mảng");
                    delOneValueOfArrayView();
                    break;
            }
            System.out.println("Bạn có muốn tiếp tục không? Y/N");
            String strCheckContinue = scanner.nextLine();
            if (strCheckContinue == "Y"){
                checkContinue = true;
            } else if(strCheckContinue == "N"){
                checkContinue = false;
            }

        } while (checkContinue);

    }

    public static void delOneValueOfArrayView() {
        int[] array = inputArray();
        System.out.print("Nhập một số để kiểm tra có trong mảng hay không? ");
        int value = scanner.nextInt();
        int index = 0;
        boolean checkValue = false;
        int i;
        for (i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                checkValue = true;
            }
        }
        if (checkValue == true) {
            System.out.println(value + " có trong mảng và nằm ở vị trí thứ " + index);
            int k = 0;
            int[] arrayNew = new int[array.length - 1];
            for (int j = 0; j < index; j++) {
                arrayNew[j] = array[k];
                k++;
            }
            int index1 = 0;
            for (index1 = index; index1 < arrayNew.length; index1++) {
                arrayNew[index1] = array[k + 1];
                k++;
            }
            String strArrayNew = convertArrayToString(arrayNew);
            System.out.println("Mảng mới sau khi xóa vị trí của " + value + ": ");
            System.out.println(strArrayNew);
        } else {
            System.out.println(value + " không có trong mảng");
        }

    }

    public static void addValueInArrayView() {
        int[] array = inputArray();
        System.out.print("Bạn muốn thêm vào vị trí thứ bao nhiêu?(từ 0 đến " + array.length + "): ");
        int addIndexNumber = scanner.nextInt();
        System.out.print("Nhập giá trị cho vị trí " + addIndexNumber + ": ");
        int value = scanner.nextInt();
        System.out.println("Mảng mới là: ");
        addValueInArray(array, addIndexNumber, value);
    }

    public static int[] addValueInArray(int array[], int addIndexNumber, int valueNumber) {
        int[] arrayNew = new int[array.length + 1];
        for (int i = 0; i < addIndexNumber; i++) {
            arrayNew[i] = array[i];
        }
        for (int j = addIndexNumber; j < arrayNew.length; j++) {
            if (j == addIndexNumber) {
                arrayNew[j] = valueNumber;
            } else {
                arrayNew[j] = array[j - 1];
            }
        }
        convertArrayToString(arrayNew);
        System.out.println(convertArrayToString(arrayNew));
        return arrayNew;
    }


    public static void findMinView() {
        int[] array = inputArray();
        int min = findMin(array);
        System.out.println("số lớn nhất trong mảng là " + min);
    }

    public static int findMin(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void findMaxView() {
        int[] array = inputArray();
        int max = findMax(array);
        System.out.println("số lớn nhất trong mảng là " + max);
    }

    public static int findMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void checkValueinArrayView() {
        int[] array = inputArray();
        System.out.println("Nhập giá trị cần tìm trong mảng: ");
        int value = scanner.nextInt();
        checkValueinArray(value, array);
    }

    public static boolean checkValueinArray(int number, int array[]) {
        int index = 0;
        boolean checkValue = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                checkValue = true;
            }
        }
        if (checkValue == true) {
            System.out.println(number + " có trong mảng và nằm ở vị trí thứ " + index);
        } else {
            System.out.println(number + " không có trong mảng");
        }
        return checkValue;
    }

    public static void reverseArrayView() {
        int[] array = inputArray();
        reverseArray(array);
        System.out.println(convertArrayToString(array));
    }

    public static void reverseArray(int[] array) {
        int temp;
        int last = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[last];
            array[last] = temp;
            last--;
        }
    }

//    public static void inputArrayView() {
//        System.out.print("Nhập số lượng phần tử mảng: ");
//        int size = Integer.parseInt(scanner.nextLine());
//        int[] array = new int[size];
//        int i;
//        for (i = 0; i < array.length; i++) {
//            System.out.print("nhập phần tử thứ " + i + ": ");
//            int item = scanner.nextInt();
//            array[i] = item;
//        }
//        System.out.println(convertArrayToString(array));
//    }

    public static int[] inputArray() {
        System.out.print("Nhập số lượng phần tử mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print("nhập phần tử thứ " + i + ": ");
            int item = scanner.nextInt();
            array[i] = item;
        }
        System.out.println(convertArrayToString(array));
        return array;
    }

    public static String convertArrayToString(int array[]) {
        String str = "[";
        for (int j = 0; j < array.length; j++) {
            str += array[j];
            if (j == array.length - 1) {
                str += "]";
            } else {
                str += ", ";
            }
        }
        return str;
    }
}
//    public static void addLastValueArrayView() {
//        int[] array = inputArray();
//        addLastValueArray(array);
//    }

//    public static int[] addLastValueArray(int[] array) {
//        int[] arrayNew = new int[array.length + 1];
//        for (int i = 0; i < array.length; i++) {
//            arrayNew[i] = array[i];
//        }
//        System.out.print("nhập giá trị cần thêm vào cuối: ");
//        int addnumber = scanner.nextInt();
//        for (int j = array.length; j <= array.length; j++) {
//            arrayNew[j] = addnumber;
//        }
//        convertArrayToString(arrayNew);
//        System.out.println(convertArrayToString(arrayNew));
//        return arrayNew;
//    }