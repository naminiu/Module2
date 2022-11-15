package textFile.copyFileText2;

import java.util.List;
import java.util.Scanner;

public class MainTestFileReaderGeneric {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TestFileReaderGeneric testFileReaderGeneric = new TestFileReaderGeneric();
        System.out.println("Nhập đường dẫn");
        String path = scanner.nextLine();
        List<String> arrays = testFileReaderGeneric.readFile(path);
        System.out.println(arrays);
        for (String line : arrays) {
            System.out.println(line);
        }

    }
    // G:\Module2\BaiTap\Exercise\src\textFile\copyFileText2\vidu.txt

}
