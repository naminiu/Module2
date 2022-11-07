package textFile.Input;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TestBufferedReader {
    public static void main(String[] args) {
//         cách 1
        File f = new File("G:/Module2/BaiTap/Exercise/src/textFile/outfile/TestDataOutputStream.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // cách 2
//        File f2 = new File("G:/Module2/test.txt");
//        try {
//            List<String> allTtext = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
//            for (String line : allTtext) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
