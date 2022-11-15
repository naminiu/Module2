package textFile.copyFileText2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\vidu.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("vidu");
            bufferedWriter.write(12312);
            bufferedWriter.write(66);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
