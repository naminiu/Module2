package textFile.Input;

import java.io.FileReader;

public class TestFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("G:/Module2/BaiTap/Exercise/src/textFile/outfile/TestFileOutputStream.txt");
            int out = fr.read();
            int outlast = fr.read();
            int outlast1 = fr.read();
            System.out.println(out);
            System.out.println(outlast);
            System.out.println(outlast1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
