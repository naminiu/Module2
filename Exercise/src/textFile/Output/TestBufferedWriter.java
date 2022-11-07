package textFile.Output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferedWriter {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("G:/Module2/BaiTap/Exercise/src/textFile/outfile/testBufferedWritertest.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(128);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
