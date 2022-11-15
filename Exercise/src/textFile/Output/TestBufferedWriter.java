package textFile.Output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferedWriter {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\THTimGiaTriLonNhatVaGhiRaFile\\max.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(9);
            bw.write(5);
            bw.write(4);
            bw.write(2);
            bw.write(15);
            bw.write(3);
            bw.write(6);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
