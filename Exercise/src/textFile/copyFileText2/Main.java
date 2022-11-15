package textFile.copyFileText2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TestFileReader testFileReader = new TestFileReader();
        System.out.println("Nhập đường dẫn");
        String path = scanner.nextLine();
        List<Integer> arrays = testFileReader.readFile(path);
        System.out.println(arrays);
        // hiển thị ra mảng
//        int total = testFileReader.findTotal(arrays);
//        System.out.println(total);
//        int max = testFileReader.findMax(arrays);
//        System.out.println(max);
//        testFileReader.printMax("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\test\\result.txt", max);

        // G:\Module2\BaiTap\Exercise\src\textFile\test\vidu.txt
    }
}
