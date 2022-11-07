package textFile.THTinhTongCacSoTrongFileText;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        String path = scanner.nextLine();

        ReadFileExample rfx = new ReadFileExample();
        rfx.readFileText(path);
    }
}
// G:\Module2\BaiTap\Exercise\src\textFile\testBufferedWriter.txt
