package textFile.Output;

import java.io.FileWriter;

public class TestFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("G:/Module2/BaiTap/Exercise/src/textFile/outfile/testFileWriter.txt");
            fw.write("Welcome to java.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
