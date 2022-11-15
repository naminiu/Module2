package textFile.THTinhTongCacSoTrongFileText;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
// G:\Module2\BaiTap\Exercise\src\textFile\vidu.txt
// G:\Module2\BaiTap\Exercise\src\textFile\testBufferedWriter.txt
